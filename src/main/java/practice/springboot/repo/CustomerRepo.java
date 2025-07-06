package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Customer;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    @Query (value = """
            select c.*
            from customers c
            join orders o on c.id = o.customer_id
            group by c.id
            having count(o.id)  > 1
            """, nativeQuery = true)
    List<Customer> findCustomersWithMultipleOrders();

    void removeById(Long id);
}
