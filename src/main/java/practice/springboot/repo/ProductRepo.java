package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Product;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

    @Query(value = """
            select p.*
            from products p
            join orders_products op on p.id = op.products_id
            where op.order_id = :orderId
            """, nativeQuery = true)
    List<Product> findProductsByOrderId(@Param("orderId") Long orderId);

    @Query (value = """
        select * from products where id not in (
        select products_id
        from orders_products)
    """, nativeQuery = true)
    List<Product> findProductsNotInOrders();


    void removeById(Long id);
}

