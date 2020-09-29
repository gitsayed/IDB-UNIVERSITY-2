package org.idb.repository;

<<<<<<< HEAD
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
=======
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.idb.model.Notice;
>>>>>>> 7619d62... first commit
import org.idb.model.Users;
import org.idb.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
<<<<<<< HEAD
public class HomeDao implements HomeService{
=======
public class HomeDao {
>>>>>>> 7619d62... first commit

    @Autowired
    SessionFactory sesionFactory;
    
<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public Users getUserByEmail(String email) { 
        Users u= new Users();
        u.setEmail(email);
    
       
            String sql = " from Users u where u.email=:email";
            Query query = sesionFactory.getCurrentSession().createQuery(sql).setProperties(u);
            Users user = (Users) query.uniqueResult();

            return user;
    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public Users getUserById(int user_id) {

        Users u= new Users();
        u.setId(user_id);
    
       
            String sql = " from Users u where u.id=:id";
            Query query = sesionFactory.getCurrentSession().createQuery(sql).setProperties(u);
            Users user = (Users) query.uniqueResult();
            return user;

    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> 7619d62... first commit
    public Users getUserByRoleId(Integer id) {
     String sql= "from Users u where u.role_id="+id;
        
     Query query = sesionFactory.getCurrentSession().createQuery(sql);
     Users user  = (Users) query.list().get(0);

    return user;
    }
    

<<<<<<< HEAD

=======
  
>>>>>>> 7619d62... first commit
}
