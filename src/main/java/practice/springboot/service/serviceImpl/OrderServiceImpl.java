package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.springboot.entities.Order;
import practice.springboot.repo.OrderRepo;
import practice.springboot.service.OrderService;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;

    @Override
    public void save(Order order) {
        orderRepo.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepo.findAll();
    }

    @Override
    public Order getById(Long id) {
        return null;
    }

    @Override
    public void update(Long id, Order order) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Order> findOrdersByCustomerName(String name) {
        return List.of();
    }

    @Override
    public List<Order> findOrdersFromDate(LocalDate fromDate) {
        return List.of();
    }
}
