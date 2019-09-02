package springBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
