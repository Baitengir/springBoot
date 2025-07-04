package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import practice.springboot.entities.Customer;
import practice.springboot.entities.Product;
import practice.springboot.repo.CustomerRepo;
import practice.springboot.repo.ProductRepo;
import practice.springboot.service.CustomerService;
import practice.springboot.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    @Override
    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepo.findById(id).orElseThrow(() ->
                new NullPointerException(String.format("Product with id %s not found", id)));
    }

    @Override
    public void update(Long id, Customer customer) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Customer> findCustomersWithMultipleOrders() {
        return List.of();
    }
}
