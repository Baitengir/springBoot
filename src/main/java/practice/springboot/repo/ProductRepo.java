package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Product;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @NativeQuery("""
            select p.*
            from products p
            join orders_products op on p.id = op.products_id
            where op.order_id = :orderId
            """)
    List<Product> findProductsByOrderId(@Param("orderId") Long orderId);
    List<Product> findProductsNotInOrders();
}
