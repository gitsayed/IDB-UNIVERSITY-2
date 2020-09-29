<<<<<<< HEAD

package org.idb.service;

import java.util.ArrayList;
import java.util.List;
import org.idb.model.Application;
import org.idb.model.Payment;
import org.idb.model.Students;
import org.idb.model.Users;

=======
package org.idb.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.idb.dto.PaymentDetails;
import org.idb.model.Admin;
import org.idb.model.Application;
import org.idb.model.Payment;
import org.idb.model.Schedule;
import org.idb.model.Students;
import org.idb.model.Users;
import org.idb.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 7619d62... first commit

import org.springframework.stereotype.Service;

@Service
<<<<<<< HEAD
public interface StudentService {

 

  public List<Students> getMyprofile();
    
  public boolean getPayment(Payment payment) ;

  public boolean submitApplication(Application application);

  public List<Application> getApplictionList();

  public void removeAppliction(int id);

  public List<Payment> getDuePaymentList(int id);

  public List<Payment> getStudentPaymentHistory(int id);

  public List<Payment> getStudentPaymentDueRecord(int id);

    public boolean updateStudentDuePayment(Payment payment);

    public List<Students> getStudentDataById(Integer i);

    public boolean addStudentToUserTable(Users reg_data);
=======
public class StudentService {

    @Autowired
    HomeService homeService;
    @Autowired
    StudentDao stuDao;

    public List<Students> getMyprofile() {
        return stuDao.getMyprofile();
    }

    public boolean getPayment(Payment payment) {

        String a = new SimpleDateFormat("dd-MM-yyyy ").format(new Date());
        payment.setP_date(a);
        payment.setDue_amount(
                payment.getPayable_amount()
                - payment.getPaying_amount());
        return stuDao.getPayment(payment);
    }

    ;

  public boolean submitApplication(Application application) {
        return stuDao.submitApplication(application);
    }

    ;

  public List<Application> getApplictionList() {
        return stuDao.getApplictionList();
    }

    ;

  public void removeAppliction(int id) {
        stuDao.removeAppliction(id);
    }

    ;

  public List<Payment> getDuePaymentListByStudentID(int id) {
        return stuDao.getDuePaymentListByStudentID(id);
    }

    ;

  public List<Payment> getPaymentHistoryByStudentID(int id) {
        return stuDao.getPaymentHistoryByStudentID(id);
    }

    ;

    public List<Payment> getStudentPaymentDueRecord(int id) {
        return stuDao.getStudentPaymentDueRecord(id);
    }

    ;

    public boolean updateStudentDuePayment(Payment payment) {

        return stuDao.updateStudentDuePayment(payment);
    }

    ;

    public Students getStudentDataById(Integer i) {

        return stuDao.getStudentDataById(i);
    }

    ;

    public boolean addStudentToUserTable(Users reg_data) {
        return stuDao.addStudentToUserTable(reg_data);

    }

    ;

    public Students getStudentById(Integer role_id) {
        return stuDao.getStudentById(role_id);
    }

    ;

    public boolean updateStudent(Students student) {
        return stuDao.updateStudent(student);
    }

    ;

    public boolean updateUser(Users user1) {

        return stuDao.updateUser(user1);
    }

    ;

    public List<Application> getApplictionListByStudentID(Integer role_id) {
        return stuDao.getApplictionListByStudentID(role_id);
    }

    ;

    public List<Schedule> getScheduleofClassByDeptId(String dept_id) {
        return stuDao.getScheduleofClassByDeptId(dept_id);

    }
;

 
>>>>>>> 7619d62... first commit

   


<<<<<<< HEAD
}
=======
}
>>>>>>> 7619d62... first commit
