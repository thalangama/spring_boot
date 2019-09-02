package springBoot.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import springBoot.models.Products;

public interface ProductRepo extends JpaRepository<Products, Integer> {
}
