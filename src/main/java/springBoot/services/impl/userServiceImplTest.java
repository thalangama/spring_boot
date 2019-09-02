package springBoot.services.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import springBoot.services.userService;

@Service
public class userServiceImplTest  {
    
    public String findAllUsers() {
        return "all user service test";
    }
}
