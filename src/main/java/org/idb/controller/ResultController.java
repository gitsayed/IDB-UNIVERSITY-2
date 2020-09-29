package org.idb.controller;

import java.util.ArrayList;
import java.util.List;
import org.idb.model.Admin;
import org.idb.model.Result;
import org.idb.model.Users;
import org.idb.service.AdminService;
import org.idb.service.HomeService;
import org.idb.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/result")
public class ResultController {

    @Autowired
    HomeService homeService;
    @Autowired
    AdminService admService;

    @Autowired
    ResultService resultService;

//    @RequestMapping(value = "/viewalladmin/{user_id}")
//    public ModelAndView viewAllAdmin(
//            @PathVariable("user_id") int id
//    ) {
//        ModelAndView mv = new ModelAndView("user/admin/admin_login");
//
//        Users user = homeService.getUserById(id);
//        Admin admp = admService.getAdminDataById(user.getRole_id());
//        List<Admin> aList = admService.getAdminList();
//        mv.addObject("user", user);
//        mv.addObject("admp", admp);
//        mv.addObject("aList", aList);
//
//        mv.addObject("viewAllAdmin", true);
//
//        return mv;
//    }
    @RequestMapping(value = "/gotoresultpanel/{user_id}")
    public ModelAndView resultPanel(
            @PathVariable("user_id") int id
    ) {
        System.out.println("CALLED! :: gotoresultpanel");
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());

        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("resultObject", new Result());
        mv.addObject("resultPanel", true);
        mv.addObject("resultInputpanel", true);

        return mv;
    }

    @PostMapping(value = "/submitmarks/{user_id}")
    public ModelAndView submitResultToDb(
            @PathVariable("user_id") int id,
            @ModelAttribute Result result
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        boolean submit = resultService.submitResultToDB(result);
        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("submit", submit);
        mv.addObject("resultPanel", true);
        mv.addObject("resultInputpanel", true);
        mv.addObject("resultObject", new Result());
        return mv;
    }

    @RequestMapping(value = "/viewstudentresult/{user_id}")
    public ModelAndView getResult(
            @PathVariable("user_id") int id,
            @ModelAttribute Result result
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        boolean status = resultService.findStudentById(result.getStudentId());
        List<Result> resultList;
        if (status && !result.getSemester().equals("sm")) {
            resultList = resultService.getResultByStudentIdAndSemester(result.getStudentId(), result.getSemester());
            String cgpa = resultService.getTotalCGPA(resultList);
            mv.addObject("resultList", resultList);
            mv.addObject("resultObject", new Result());
            mv.addObject("cgpa", cgpa);
            mv.addObject("user", user);
            mv.addObject("admp", admp);
            mv.addObject("resultPanel", true);
            for (int j = 0; j < resultList.size(); j++) {
                Result rs = resultList.get(j);
                System.out.println(rs.toString());
            }
            return mv;
        } else {
            status = false;
            mv.addObject("user", user);
            mv.addObject("admp", admp);
            mv.addObject("submit", status);
            mv.addObject("resultPanel", true);
            mv.addObject("resultInputpanel", true);
            mv.addObject("resultObject", new Result());
            return mv;
        }

    }

    @RequestMapping(value = "/viewallresults/{user_id}")
    public ModelAndView viewAllResultt(
            @PathVariable("user_id") int id
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        List<Result> allResultList = resultService.getAllResultList();

        mv.addObject("allResultList", allResultList);
        mv.addObject("resultPanel", true);
        mv.addObject("user", user);
        mv.addObject("admp", admp);
        return mv;
    }

    @RequestMapping(value = "deleteresult/{user_id}/{r_id}")
    public ModelAndView deleteResult(
            @PathVariable("user_id") int id,
            @PathVariable("r_id") int r_id
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        resultService.deleteResultById(r_id);
        List<Result> allResultList = resultService.getAllResultList();
        mv.addObject("allResultList", allResultList);
        mv.addObject("resultPanel", true);
        mv.addObject("user", user);
        mv.addObject("admp", admp);
        return mv;

    }

    @GetMapping(value = "/updateresult/{user_id}/{r_id}")
    public ModelAndView gotoUpdateResult(
            @PathVariable("user_id") int id,
            @PathVariable("r_id") int r_id
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        Result resultObject = resultService.getResultInfoById(r_id);
        mv.addObject("resultPanel", true);
        mv.addObject("resultUpdatePanel", true);
        mv.addObject("resultObject", resultObject);
        mv.addObject("user", user);
        mv.addObject("admp", admp);

        return mv;
    }

    @PostMapping(value = "/updateresult/{user_id}")
    public ModelAndView updateResult(
            @ModelAttribute Result result,
            @PathVariable("user_id") int id
    ) {

        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        boolean submit = resultService.submitResultToDB(result);
        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("update", submit);
        mv.addObject("resultPanel", true);
        mv.addObject("resultInputpanel", true);
        mv.addObject("resultObject", new Result());
        return mv;
    }

    @PostMapping(value = "/deletestudentresult/{user_id}")
    public ModelAndView deleteStudentResult(
            @PathVariable("user_id") int id,
            @ModelAttribute Result result
    ) {

        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(id);
        Admin admp = admService.getAdminDataById(user.getRole_id());
        resultService.deleteResultById(result.getId());
        List<Result> resultList = resultService.getResultByStudentIdAndSemester(result.getStudentId(), result.getSemester());
        String CGPA = resultService.getTotalCGPA(resultList);
        mv.addObject("resultList", resultList);
        mv.addObject("resultObject", new Result());
        mv.addObject("cgpa", CGPA);
        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("resultPanel", true);
        for (int i = 0; i < resultList.size(); i++) {
            Result rs = resultList.get(i);
            System.out.println(rs.toString());
        }
        return mv;

    }

}
