package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}
