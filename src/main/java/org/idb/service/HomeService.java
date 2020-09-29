

package org.idb.service;

<<<<<<< HEAD
import org.idb.model.Users;
import org.springframework.stereotype.Service;

@Service
public interface HomeService {
    
    public Users getUserByEmail(String email);

    public Users getUserById(int user_id);

    public Users getUserByRoleId(Integer id);
    
=======
import java.util.List;
import org.idb.model.Notice;
import org.idb.model.Users;
import org.idb.repository.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    @Autowired
    HomeDao homeDao;
    
    public Users getUserByEmail(String email){
    return homeDao.getUserByEmail(email);
    };

    public Users getUserById(int user_id)
{
    return homeDao.getUserById(user_id);
    };
    public Users getUserByRoleId(Integer id)
    {
    return homeDao.getUserByRoleId(id);
    };

    public List<Notice> getNoticeListByType() {
    
    return null;
    }
>>>>>>> 7619d62... first commit
}
