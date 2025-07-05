package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Order;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    @Query (value = """
    
    """, nativeQuery = true)
    List<Order> findOrderByCustomer_Name(String customerName);
}
