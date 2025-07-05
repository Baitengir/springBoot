package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practice.springboot.entities.Customer;
import practice.springboot.repo.CustomerRepo;
import practice.springboot.service.CustomerService;

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
                new NullPointerException(String.format("Customer with id %s not found", id)));
    }

    @Override
    public void update(Long id, Customer customer) {
        if (id == null || customer == null) return;
        Customer customerInDb = getById(id);
        customerInDb.setName(customer.getName());
        save(customerInDb);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        customerRepo.removeById(id);
    }

    @Override
    public List<Customer> findCustomersWithMultipleOrders() {
        return List.of();
    }
}
