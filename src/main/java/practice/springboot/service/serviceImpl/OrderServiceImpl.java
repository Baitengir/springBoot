package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
        return orderRepo.findById(id).orElseThrow(() ->
                new NullPointerException(String.format("Order with id %s not found", id)));
    }

    @Override
    public void update(Long id, Order order) {
        if (id == null || order == null) return;
        Order orderInDb = getById(id);
        orderInDb.setDate(order.getDate());
        save(orderInDb);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        orderRepo.deleteById(id);
    }

    @Override
    public List<Order> findOrdersByCustomerName(String name) {
        return orderRepo.findOrderByCustomerName(name);
    }

    @Override
    public List<Order> findOrdersFromDate(LocalDate fromDate) {
        return List.of();
    }
}
