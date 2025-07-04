package practice.springboot.service;

import practice.springboot.entities.Order;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {
    void save(Order order);
    List<Order> getAll();
    Order getById(Long id);
    void update(Long id,Order order);
    void delete(Long id);
    List<Order> findOrdersByCustomerName(String name);
    List<Order> findOrdersFromDate(LocalDate fromDate);

}
