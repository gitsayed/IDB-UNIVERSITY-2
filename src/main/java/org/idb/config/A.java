/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.idb.config;

<<<<<<< HEAD
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class A {
    
    public static void main(String[] args) {
       String a = new SimpleDateFormat("dd-MM-yyyy HH:mm ").format(new Date());
System.out.println(a);    
        
    }
=======
import com.sun.org.apache.xerces.internal.impl.dv.xs.TimeDV;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import org.idb.model.Result;
import org.idb.repository.ResultDao;
import org.idb.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.instrument.classloading.SimpleLoadTimeWeaver;
import org.springframework.jdbc.support.JdbcUtils;

public class A {

    @Autowired
    ResultDao rd; // = new ResultDao();  

    public void getResult(int i, String k) {
        List<Result> list = rd.getResultByStudentIdAndSemester(i, k);

        for (int j = 0; j < list.size(); j++) {
            Result rs = list.get(j);
            System.out.println(rs.toString());
        }

    }

    public static void main(String[] args) {
        String a = new SimpleDateFormat("dd-MM-yyyy; HH:mm ").format(new Date());
        String b1 = "Sayed,  date today :: ";
        System.out.println(b1 + a);
        A b = new A();
        double number = 0.9999999999999;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(numberFormat.format(number));

    }

>>>>>>> 7619d62... first commit
}
