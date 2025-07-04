package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.springboot.entities.Product;
import practice.springboot.repo.ProductRepo;
import practice.springboot.service.ProductService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Override
    public void save(Product product) {
        productRepo.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepo.getById(id);
    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Product> findProductsByOrderId(Long orderId) {
        return List.of();
    }

    @Override
    public List<Product> findProductsNotInOrders() {
        return List.of();
    }
}
