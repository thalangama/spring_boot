package springBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import springBoot.models.User;
import springBoot.services.userService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private userService userServices;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userServices.addUser(user);
    }

    @PostMapping("update")
    public String updateUser(@RequestBody User user){
        return userServices.updateUser(user);
    }

    @GetMapping("user/{id}")
    public User getUserById(@PathVariable int id){
        return userServices.findUsersById(id);
    }
}
