/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.idb.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.stereotype.Service;

/**
 *
 * @author SAYED
 */
@Service
public class ReportService {

    public JasperPrint getReport() throws Exception {
        Map<String, Object> params = new HashMap();
        String startDate, endDate, path, pathString;
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idb", "root", "")) {
            path = "C:\\Users\\SAYED\\Documents\\NetBeansProjects\\idbu6\\src\\main\\webapp\\WEB-INF\\assets\\report\\payment_history.jasper";
//        path = "idbu6\\src\\main\\webapp\\WEB-INF\\assets\\report\\payment_history.jasper";
            return JasperFillManager.fillReport(path, params, connection);
        }
    }

    public JasperPrint getResultReport(Integer StudentId, String Semester) throws Exception {
        String path;
        Map<String, Object> params = new HashMap();
        params.put("StudentId", StudentId);
        params.put("Semester", Semester);
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/idb", "root", "")) {
            path = "C:\\Users\\SAYED\\Documents\\NetBeansProjects\\idbu6\\src\\main\\webapp\\WEB-INF\\assets\\report\\Result.jasper";
            return JasperFillManager.fillReport(path, params, connection);
        }
    }

//    public static void main(String[] args) {
//        InputStream stream = null;
//        try {
//            stream = new FileInputStream(new File("").getAbsolutePath() + "/src/main/webapp/WEB-INF/assets/report/payment_history.jasper");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("Printing Path :::" + stream);
//    }




//  @RequestMapping(value = "/resultreport/{semester}/{studentId}")
//    private void resultReport(
//            @PathVariable String semseter,
//            @PathVariable Integer studentId, 
//             HttpServletResponse response
//    ) throws Exception {
//        response.setContentType("application/pdf");
//        OutputStream out = response.getOutputStream();
//        JasperPrint jasperPrint = reportService.getResultReport(studentId, semseter);
//        JasperExportManager.exportReportToPdfStream(jasperPrint, out);
//    }








}
