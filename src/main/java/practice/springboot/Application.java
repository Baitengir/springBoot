package practice.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import practice.springboot.service.CustomerService;
import practice.springboot.service.OrderService;
import practice.springboot.service.ProductService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner runner (ProductService productService, OrderService orderService, CustomerService customerService){
        return args -> {
            // todo Product methods
//            productService.save(new Product("Tiger1", 1200000));
//            System.out.println(productService.getAll());
//            System.out.println(productService.getById(1L));
//            System.out.println(productService.getAll());
//            productService.update(1L, new Product("WZ121", 3300000));
//            productService.delete(2L);
//            System.out.println(productService.findProductsNotInOrders());

            // todo Customer methods
//            customerService.save(new Customer("Jusup"));
//            customerService.save(new Customer("Zumbi"));
//            customerService.save(new Customer("Saara"));
//            System.out.println(customerService.getById(2L));
//            customerService.update(3L, new Customer("Saara updated"));
//            customerService.delete(2L);

            // todo order methods
//            orderService.save(new Order(LocalDate.of(2024, 11, 26)));
//            System.out.println(orderService.getById(1L));
//            System.out.println(orderService.getAll());
//            orderService.update(1L, new Order(LocalDate.of(2025, 6,21)));
//            orderService.delete(1L);

        };

    }

}
