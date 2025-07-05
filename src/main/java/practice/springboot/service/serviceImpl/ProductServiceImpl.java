package practice.springboot.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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
        return productRepo.findById(id).orElseThrow(() ->
                new NullPointerException(String.format("Product with id %s not found", id)));
    }

    @Override
    public void update(Long id, Product product) {
        if (product == null || id == null) return;
        Product productInDb = getById(id);
        productInDb.setName(product.getName());
        productInDb.setPrice(product.getPrice());
        save(productInDb);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        productRepo.removeById(id);
    }

    @Override
    public List<Product> findProductsByOrderId(Long orderId) {
        return productRepo.findProductsByOrderId(orderId);
    }

    @Override
    public List<Product> findProductsNotInOrders() {
        return productRepo.findProductsNotInOrders();
    }
}
