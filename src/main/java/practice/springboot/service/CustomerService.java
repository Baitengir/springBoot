package practice.springboot.service;

import practice.springboot.entities.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    List<Customer> getAll();
    Customer getById(Long id);
    void update(Long id, Customer customer);
    void delete(Long id);
    List<Customer> findCustomersWithMultipleOrders();
}
