<<<<<<< HEAD

=======
>>>>>>> 7619d62... first commit
package org.idb.service;

import java.util.List;
import org.idb.model.Admin;
<<<<<<< HEAD
import org.idb.model.Payment;
import org.idb.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface AdminService { 

    public Admin getAdminDataById(Integer i);

    public boolean addAdminToUserTable(Users reg_data);

    public void updateUsers(Users user);

    public void updateAdmin(Admin admin);

    public List<Admin> getAdminList();

    public List<Users> getUsersList();

    public Admin addAdminToDB(Admin admin1);

    public void deleteUserById(int delete_id);

    public void deleteAdminById(int delete_id);

    public List<Payment> getPaymentsHistory();

    public List<Payment> getDueAmountListById(int id);

    public Payment getPaymentDueRecordBySerialId(int serial_id);

    public boolean updateDuePayment(Payment dupmt);

    public boolean addPaymentToDB(Payment pmt);
=======
import org.idb.model.Department;
import org.idb.model.Payment;
import org.idb.model.Schedule;
import org.idb.model.Students;
import org.idb.model.Teacher;
import org.idb.model.Users;
import org.idb.repository.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    
    @Autowired
    AdminDao adminDao;
    
    public Admin getAdminDataById(Integer i) {
        return adminDao.getAdminDataById(i);
    }
    
    ;

    public boolean addAdminToUserTable(Users reg_data) {
        
        return adminDao.addAdminToUserTable(reg_data);
    }
    
    ;

    public void updateUsers(Users user) {
        adminDao.updateUsers(user);
    }
    
    ;

    public void updateAdmin(Admin admin) {
        adminDao.updateAdmin(admin);
    }
    
    public List<Admin> getAdminList() {
        
        return adminDao.getAdminList();
    }
    
    public List<Users> getUsersList() {
        return adminDao.getUsersList();
    }
    
    public Admin addAdminToDB(Admin admin1) {
        
        return adminDao.addAdminToDB(admin1);
    }
    
    public void deleteUserById(int delete_id) {
        adminDao.deleteUserById(delete_id);
    }
    
    public void deleteAdminById(int delete_id) {
        adminDao.deleteAdminById(delete_id);
    }
    
    public List<Payment> getPaymentsHistory() {
        return adminDao.getPaymentsHistory();
    }
    
    public List<Payment> getDueAmountListById(int id) {
        return adminDao.getDueAmountListById(id);
    }
    
    public Payment getPaymentDueRecordBySerialId(int serial_id) {
        
        return adminDao.getPaymentDueRecordBySerialId(serial_id);
    }
    
    public boolean updateDuePayment(Payment dupmt) {
        
        return adminDao.updateDuePayment(dupmt);
    }
    
    public boolean addPaymentToDB(Payment pmt) {
        return adminDao.addPaymentToDB(pmt);
    }
    
    public List<Teacher> getTeacherList() {
        return adminDao.getTeacherList();
    }
    
    public boolean addTeacherToDB(Teacher teacher) {
        return adminDao.addTeacherToDB(teacher);
    }
    
    public Teacher findTeacherByID(int teacher_id) {
        return adminDao.findTeacherByID(teacher_id);
    }
    
    public boolean updateTeacherToDB(Teacher teacher) {
        
        return adminDao.updateTeacherToDB(teacher);
    }
    
    public void deleteTeacherById(int t_id) {
        adminDao.deleteTeacherById(t_id);
    }
    
    public boolean addStudentToDB(Students student) {
        return adminDao.addStudentToDB(student);
    }
    
    public Students findStudentByID(int stu_id) {
        return adminDao.findStudentByID(stu_id);
    }
    
    public boolean updateStudentToDB(Students stu) {
        
        return adminDao.updateStudentToDB(stu);
    }
    
    public void deleteStudentById(int t_id) {
        adminDao.deleteStudentById(t_id);
    }
    
    public List<Students> getStudentList() {
        
        return adminDao.getStudentList();
    }
    
    public List<Department> getDepartmentList() {
        return adminDao.getDepartmentList();
    }
    
    public Department findDepartmentByID(int dep_id) {
        return adminDao.findDepartmentByID(dep_id);
    }
    
    public boolean addDepartmentToDB(Department department) {
        
        return adminDao.addDepartmentToDB(department);
    }
    
    public boolean updateDepartmentToDB(Department dep) {
        return adminDao.updateDepartmentToDB(dep);
    }
    
    public void deleteDepartmentById(int d_id) {
        adminDao.deleteDepartmentById(d_id);
    }
    
    public List<Schedule> getScheduleList() {
        return adminDao.getScheduleList();
    }
    
    public Schedule findScheduleByID(int cdl_id) {
        
        return adminDao.findScheduleByID(cdl_id);
    }
    
    public boolean addScheduleToDB(Schedule schedule) {
        return adminDao.addScheduleToDB(schedule);
    }
    
    public boolean updateScheduleToDB(Schedule cdl) {
        
        return adminDao.updateScheduleToDB(cdl);
    }
    
    public void deleteScheduleById(int cdl_id) {
        adminDao.deleteScheduleById(cdl_id);
        ;
    }
    
    public Schedule findScheduleByDepID(int dep_id) {
        
        return adminDao.findScheduleByDepID(dep_id);
    }
>>>>>>> 7619d62... first commit
    
}
