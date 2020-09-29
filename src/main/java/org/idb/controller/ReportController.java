package org.idb.controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.io.OutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.idb.model.Admin;
import org.idb.model.Result;
import org.idb.model.Users;
import org.idb.service.AdminService;
import org.idb.service.HomeService;
import org.idb.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/report")
public class ReportController {

//        @RequestMapping(value = "/payment_report/{user_id}")
//    public ModelAndView deleteScheduleById(
//            @PathVariable int user_id,
//            @PathVariable int cdl_id
//    ) {
//        ModelAndView mv = new ModelAndView("user/admin/admin_login");
//        Users user = homeService.getUserById(user_id);
//        Admin admp = admService.getAdminDataById(user.getRole_id());
//        admService.deleteScheduleById(cdl_id);
//        List<Schedule> clist = admService.getScheduleList();
//
//        mv.addObject("user", user);
//        mv.addObject("admp", admp);
//        mv.addObject("clist", clist);
//        mv.addObject("gotoschedule", true);
//        mv.addObject("schedule", new Schedule());
//        return mv;
//    }
    @Autowired
    ReportService reportService;
    @Autowired
    AdminService admService;
    @Autowired
    HomeService homeService;

    @RequestMapping(value = "/payment_report2")
    private void sendPdfReportsvoid(
            HttpServletResponse response
    ) throws Exception {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        JasperPrint jasperPrint = reportService.getReport();
        JasperExportManager.exportReportToPdfStream(jasperPrint, out);
    }

    @RequestMapping(value = "/payment_report/{user_id}")
    private ModelAndView sendPdfReports(
            @PathVariable int user_id) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(user_id);
        Admin admp = admService.getAdminDataById(user.getRole_id());

        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("showReport", true);

        return mv;
    }

    @RequestMapping(value = "/resultreport/{user_id}")
    private ModelAndView resultReport(
            @PathVariable int user_id
    ) {
        ModelAndView mv = new ModelAndView("user/admin/admin_login");
        Users user = homeService.getUserById(user_id);
        Admin admp = admService.getAdminDataById(user.getRole_id());

        mv.addObject("user", user);
        mv.addObject("admp", admp);
        mv.addObject("resultObject", new Result());
        mv.addObject("resultPanel", true);
        mv.addObject("resultReport", true);
        return mv;
    }
    
    
    
    
  @RequestMapping(value = "/resultreport/{semester}/{studentId}")
    private void getPdfReport(
            @PathVariable String semester,
            @PathVariable Integer studentId,
            HttpServletResponse response
    ) throws Exception {
        response.setContentType("application/pdf");
        OutputStream out = response.getOutputStream();
        JasperPrint jasperPrint = reportService.getResultReport(studentId, semester);
        JasperExportManager.exportReportToPdfStream(jasperPrint, out);
    }

}
