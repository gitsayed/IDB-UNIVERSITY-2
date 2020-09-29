package org.idb.service;

import java.text.DecimalFormat;
import java.util.List;
import org.idb.model.Result;
import org.idb.repository.ResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

    @Autowired
    ResultDao resultDao;

    public boolean findStudentById(int studentId) {

        return resultDao.findStudentById(studentId);
    }

    public boolean submitResultToDB(Result result) {
        boolean status = resultDao.findStudentById(result.getStudentId());

        if (status) {
            status = resultDao.submitResultToDB(result);
            return status;
        }

        return status;
    }

    public List<Result> getResultByStudentIdAndSemester(int studentId, String semester) {
        return resultDao.getResultByStudentIdAndSemester(studentId, semester);
    }

    public String  getTotalCGPA(List<Result> list) {
        String  cgpa = "";
          DecimalFormat numberFormat = new DecimalFormat("#.00");
        if (list != null) {
            double total = 0;
            for (int i = 0; i < list.size(); i++) {
                total = total + list.get(i).getMarks();
            }
            
            cgpa =numberFormat.format( total / list.size());
        }
        return cgpa;
    }

    public List<Result> getAllResultList() {
    return resultDao.getAllResultList();
    }

    public void deleteResultById(int r_id) {
    resultDao. deleteResultById(r_id);
            }

    public Result getResultInfoById(int r_id) {
        
    return resultDao.getResultInfoById(r_id);
    
    }

}
