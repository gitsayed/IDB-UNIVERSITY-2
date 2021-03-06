package org.idb.repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.idb.model.Admin;
<<<<<<< HEAD
import org.idb.model.Payment;
import org.idb.model.Students;
import org.idb.model.Users;
import org.idb.service.AdminService;
=======
import org.idb.model.Department;
import org.idb.model.Payment;
import org.idb.model.Schedule;
import org.idb.model.Students;
import org.idb.model.Teacher;
import org.idb.model.Users;
>>>>>>> 7619d62... first commit
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
<<<<<<< HEAD
public class AdminDao implements AdminService {
=======
public class AdminDao  {
>>>>>>> 7619d62... first commit

    @Autowired
    SessionFactory sessionFactory;

<<<<<<< HEAD
    @Override
    public Admin getAdminDataById(Integer i) {
        String sql = "from Admin a where a.id=" + i;
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Admin> admList = query.list();
        Admin adm = admList.get(0);
        return adm;
    }

    @Override
=======
    
    public Admin getAdminDataById(Integer i) {

        try {
            String sql = "from Admin a where a.id=" + i;
            Query query = sessionFactory.getCurrentSession().createQuery(sql);
            List<Admin> admList = query.list();
            Admin adm = admList.get(0);
            return adm;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Admin Data Exception " +e.getMessage() );
            return null;

        }

    }

>>>>>>> 7619d62... first commit
    public boolean addAdminToUserTable(Users reg_data) {
        int id = reg_data.getRole_id();
        String email = reg_data.getEmail();
        Admin adm = getAdminDataById(id);
        reg_data.setUsername(adm.getName());
        adm.setEmail(email);
        Object merge = sessionFactory.getCurrentSession().merge(adm);
        System.out.println(merge.toString());
        int i = (int) sessionFactory.getCurrentSession().save(reg_data);

        return (i > 0);
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 7619d62... first commit
    public void updateUsers(Users user) {
        boolean b = true;
        Object merge = sessionFactory.getCurrentSession().merge(user);
        System.out.println(merge.toString());

    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 7619d62... first commit
    public void updateAdmin(Admin admin) {

        sessionFactory.getCurrentSession().merge(admin);
    }

<<<<<<< HEAD
    @Override
=======
>>>>>>> 7619d62... first commit
    public List<Admin> getAdminList() {

        String sql = "from Admin a";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);

        return query.list();

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public List<Users> getUsersList() {
        String sql = "from Users u";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);

        return query.list();

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public Admin addAdminToDB(Admin admin1) {

        Admin admin = (Admin) sessionFactory.getCurrentSession().merge(admin1);
        return admin;
    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public void deleteUserById(int delete_id) {

        String sql = "delete from Users u where u.id=" + delete_id;

        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public void deleteAdminById(int delete_id) {
        String sql = "delete from Admin a where a.id=" + delete_id;

        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public List<Payment> getPaymentsHistory() {
        String sql = "from Payment p";
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public List<Payment> getDueAmountListById(int id) {

        String sql = "Select pm from Payment pm where  pm.due_amount>0 and pm.student_id=" + id;

        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public Payment getPaymentDueRecordBySerialId(int serial_id) {

        String sql;
        sql = "Select pm from Payment pm where pm.serial_id=" + serial_id;
        return (Payment) sessionFactory.getCurrentSession().createQuery(sql).list().get(0);

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public boolean updateDuePayment(Payment pmt) {

        String a = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        double b = pmt.getPayable_amount();
        double due = pmt.getDue_amount() - pmt.getPaying_amount();

        double paid = pmt.getPayable_amount() - due;

        pmt.setDue_amount(due);
        pmt.setPaying_amount(paid);
        pmt.setP_date(a);

        Payment pm = (Payment) sessionFactory.getCurrentSession().merge(pmt);

        return (pm.getSerial_id() > 0);

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public boolean addPaymentToDB(Payment payment) {

        int i;

        String a = new SimpleDateFormat("dd-MM-yyyy ").format(new Date());
        payment.setP_date(a);
        payment.setDue_amount(
                payment.getPayable_amount()
                - payment.getPaying_amount());
        try {
            i = (int) sessionFactory.getCurrentSession().save(payment);
        } catch (HibernateException e) {

            return false;

        }

        return (i > 0);
    }

<<<<<<< HEAD
=======
    
    public List<Teacher> getTeacherList() {
        String sql = "from Teacher t";

        return sessionFactory.getCurrentSession().createQuery(sql).list();

    }

    
    public boolean addTeacherToDB(Teacher teacher) {

        int i = (int) sessionFactory.getCurrentSession().save(teacher);
        return (i > 0);
    }

    
    public Teacher findTeacherByID(int teacher_id) {
//        String sql = "From Teacher t where t.id=" + teacher_id;
        String sql = "from Teacher t";

        Teacher tnull = null;

        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Teacher> tlist = query.list();

        for (int i = 0; i < tlist.size(); i++) {

            if (teacher_id == tlist.get(i).getId()) {
                tnull = tlist.get(i);
                return tnull;
            }
        }
        return tnull;
    }

    
    public boolean updateTeacherToDB(Teacher teacher) {
        Teacher t = (Teacher) sessionFactory.getCurrentSession().merge(teacher);
        int i = t.getId();
        return (i > 0);
    }

    
    public void deleteTeacherById(int t_id) {
        String sql = "delete from Teacher t where t.id=" + t_id;

        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();

    }

    
    public boolean addStudentToDB(Students student) {
        int i = (int) sessionFactory.getCurrentSession().save(student);
        return (i > 0);
    }

    
    public Students findStudentByID(int stu_id) {
        //  String sql = "From Teacher t where t.id=" + teacher_id;
        String sql = "from Students s";

        Students sNull = null;

        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Students> slist = query.list();

        for (int i = 0; i < slist.size(); i++) {

            if (stu_id == slist.get(i).getId()) {
                sNull = slist.get(i);
                return sNull;
            }
        }
        return sNull;
    }

    
    public boolean updateStudentToDB(Students stu) {
        Students s = (Students) sessionFactory.getCurrentSession().merge(stu);
        int i = s.getId();
        System.out.println("updateStudentToDB : ID : " + stu.getId());
        return (i > 0);
    }

    
    public void deleteStudentById(int s_id) {
        String sql = "delete from Students s where s.id=" + s_id;

        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
    }

    
    public List<Students> getStudentList() {
        String sql = "from Students t";

        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

    
    public List<Department> getDepartmentList() {
        String sql = "from Department d";
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

    
    public Department findDepartmentByID(int dep_id) {
        String sql = "from Department d";

        Department dNull = null;

        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Department> dlist = query.list();

        for (int i = 0; i < dlist.size(); i++) {

            if (dep_id == dlist.get(i).getId()) {
                dNull = dlist.get(i);
                return dNull;
            }
        }
        return dNull;

    }

    
    public boolean addDepartmentToDB(Department department) {
        int i = (int) sessionFactory.getCurrentSession().save(department);
        return (i > 0);

    }

    
    public boolean updateDepartmentToDB(Department dep) {
        Department d = (Department) sessionFactory.getCurrentSession().merge(dep);
        int i = d.getId();
        return (i > 0);

    }

    
    public void deleteDepartmentById(int d_id) {
        String sql = "delete from Department d where d.id=" + d_id;
        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();

    }

    
    public List<Schedule> getScheduleList() {
        String sql = "from Schedule cdl";
        return sessionFactory.getCurrentSession().createQuery(sql).list();

    }

    
    public Schedule findScheduleByID(int cdl_id) {
        String sql = "from Schedule cdl";

        Schedule cNull = null;

        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Schedule> clist = query.list();

        for (int i = 0; i < clist.size(); i++) {

            if (cdl_id == clist.get(i).getId()) {
                cNull = clist.get(i);
                return cNull;
            }
        }
        return cNull;
    }

    
    public boolean addScheduleToDB(Schedule schedule) {
        int i = (int) sessionFactory.getCurrentSession().save(schedule);
        return (i > 0);
    }

    
    public boolean updateScheduleToDB(Schedule schedule) {

        Schedule d = (Schedule) sessionFactory.getCurrentSession().merge(schedule);
        int i = d.getId();
        return (i > 0);
    }

    
    public void deleteScheduleById(int c_id) {
        String sql = "delete from Schedule c where c.id=" + c_id;
        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
    }

    
    public Schedule findScheduleByDepID(int dep_id) {

        String sql = "from Schedule cdl";

        Schedule cNull = null;

        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Schedule> clist = query.list();

        for (int i = 0; i < clist.size(); i++) {

            if (dep_id == clist.get(i).getDept_id()) {
                cNull = clist.get(i);
                return cNull;
            }
        }
        return cNull;
    }

>>>>>>> 7619d62... first commit
}
