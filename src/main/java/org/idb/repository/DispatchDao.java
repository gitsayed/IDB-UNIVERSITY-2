package org.idb.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.idb.model.Application;
import org.idb.model.Notice;
import org.springframework.stereotype.Repository;
import org.idb.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DispatchDao implements DispatchService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Notice> getNoticeList() {
        String sql = "from Notice n";

        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }

    @Override
    public boolean addNoticeToDB(Notice notice) {
        String a = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        notice.setP_date(a);
        int i = (int) sessionFactory.getCurrentSession().save(notice);
        return (i > 0);
    }

    @Override
    public void deleteNoticeById(int n_id) {
        String sql = "delete from Notice n where n.id=" + n_id;
        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
    }

    @Override
    public List<Notice> finsNoticeByIdAndType(int id, String t) {
        String sql = "from Notice n";
        List<Notice> nlist = new ArrayList<>();
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> clist = query.list();
        for (int i = 0; i < clist.size(); i++) {
            String t2 = clist.get(i).getType();
            int id2 = clist.get(i).getId();
            if (t.equals(t2) && id == id2) {
                nlist.add(clist.get(i));
                return nlist;
            }
        }
        return nlist;
    }

    @Override
    public List<Notice> findNoticeByType(String t) {
        String sql = "from Notice n";
        List<Notice> nlist = new ArrayList<>();
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> clist = query.list();
        for (int i = 0; i < clist.size(); i++) {
            if (t.equals(clist.get(i).getType())) {
                nlist.add(clist.get(i));
//                return nlist;
            }
        }
        return nlist;
    }

    @Override
    public boolean updateNotice(Notice notice) {
        String a = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        notice.setP_date(a);
        System.out.println("printing Notice ID : " + notice.getId() + " before .");
        Notice n = (Notice) sessionFactory.getCurrentSession().merge(notice);
        int i = n.getId();

        System.out.println("printing Notice ID : " + i + " After .");
        return (i > 0);
    }

    @Override
    public Notice getNoticeByID(int n_id) {
        String sql = "from Notice n";
        Notice nNull = null;
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> clist = query.list();
        for (int i = 0; i < clist.size(); i++) {
            if (n_id == clist.get(i).getId()) {
                nNull = clist.get(i);
                return nNull;
            }
        }
        return nNull;

    }

    @Override
    public List<Application> getApplicationList() {
        String sql = "from Application ap";

        return sessionFactory.getCurrentSession().createQuery(sql).list();

    }

    @Override
    public void deleteApplicationById(int a_id) {
        String sql = "delete from Application ap where ap.a_id=" + a_id;
        int i = sessionFactory.getCurrentSession().createQuery(sql).executeUpdate();
    }

    @Override
    public List<Notice> getNoticeListByType() {
        System.out.println("Creating Statement....");
        String sql = "from Notice n where n.type ='Notice'";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> nlist = query.list();
        System.out.println(nlist.toArray().toString());
        return nlist;
    }

    @Override
    public List<Notice> getNoticeListById(int id) {
        System.out.println("Creating Statement....");
        String sql = "from Notice n where n.id =" + id;
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> nlist = query.list();
        return nlist;

    }

    @Override
    public List<Notice> getEventsListByType() {
        System.out.println("Creating Statement....");
        String sql = "from Notice n where n.type ='Event'";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> nlist = query.list();
        
        return nlist;

    }

    @Override
    public List<Notice> getNewsListByType() {
        System.out.println("Creating Statement....");
        String sql = "from Notice n where n.type ='News'";
        Query query = sessionFactory.getCurrentSession().createQuery(sql);
        List<Notice> nlist = query.list();
        
        return nlist;

    }

}
