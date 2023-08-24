package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDaoImp;

   public UserServiceImp(UserDao userDaoImp) {
      this.userDaoImp = userDaoImp;
   }

   @Transactional
   @Override
   public void add(User user) {
      userDaoImp.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDaoImp.listUsers();
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserByCar(String model, int series) {
      return userDaoImp.getUserByCar(model, series);
   }
}
