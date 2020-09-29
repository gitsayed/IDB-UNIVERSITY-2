package org.idb.repository;

import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.idb.model.Result;
import org.idb.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ResultDao {

    @Autowired
    SessionFactory sessionFactory;

    public boolean findStudentById(int i) {
        try {
            String sql = "from Students s where s.id=" + i;
            Query query = sessionFactory.getCurrentSession().createQuery(sql);
            List<Students> admList = query.list();
            Students s = admList.get(0);
            return s.getId() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Students Data Exception ::" + e.getMessage());
            return false;

        }

    }

    public boolean submitResultToDB(Result result) {
        Result rs = (Result) sessionFactory.getCurrentSession().merge(result);

        return (rs.getStudentId() > 0);
    }

    public List<Result> getResultByStudentIdAndSemester(int studentId, String semester) {

        String sql = "FROM Result r WHERE r.semester='" + semester + "' " + "AND  r.studentId=" + studentId;
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Result> resultList = query.list();
        return resultList;

    }

    public List<Result> getAllResultList() {
        String sql = "from Result r";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Result> allResultList = query.list();
        return allResultList;

    }

    public void deleteResultById(int r_id) {
        String sql = "delete from Result r where r.id=" + r_id;
        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
    }

    public Result getResultInfoById(int r_id) {

        String sql = "from Result r where r.id=" + r_id;
        Result result = (Result) sessionFactory.getCurrentSession().createQuery(sql).uniqueResult();
        System.out.println("getResultInfoById :: "+result.toString());
        return result;
    }

}
