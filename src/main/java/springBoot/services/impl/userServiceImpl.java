package springBoot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import springBoot.models.User;
import springBoot.repositeries.UserRepo;
import springBoot.services.userService;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> findAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @Override
    public String addUser(User user){
        userRepo.save(user);
        return "saved";
    }

    @Override
    public String updateUser(User user){
        String msg = "";
        if(user.getId() != ' '){
            msg = "updated";
            userRepo.save(user);
        } else {
            msg = "error";
        }
        return msg ;
    }

    public User findUsersById(int id){
         return userRepo.findOne(id);
    }

    
}
