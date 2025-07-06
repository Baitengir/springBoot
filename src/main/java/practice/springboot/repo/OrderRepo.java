package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Order;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    @Query(value = """
                select o.*
                from orders o
                join customers c on o.customer_id = c.id
                where c.name = :customerName
            """, nativeQuery = true)
    List<Order> findOrderByCustomerName(@Param("customerName") String customerName);

    @Query(value = """
                    select *
                    from orders
                    where date =: fromDate
            """, nativeQuery = true)
    List<Order> findOrdersFromDate(@Param("fromDate") LocalDate fromDate);
}
