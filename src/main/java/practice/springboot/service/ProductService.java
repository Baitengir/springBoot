package practice.springboot.service;

import practice.springboot.entities.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    List<Product> getAll();
    Product getById(Long id);
    void update(Long id, Product product);
    void delete(Long id);
    List<Product> findProductsByOrderId(Long orderId);
    List<Product> findProductsNotInOrders();
}
