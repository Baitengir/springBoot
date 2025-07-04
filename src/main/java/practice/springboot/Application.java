package practice.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import practice.springboot.entities.Order;
import practice.springboot.entities.Product;
import practice.springboot.service.OrderService;
import practice.springboot.service.ProductService;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Bean
    public CommandLineRunner runner (ProductService productService, OrderService orderService){
        return args -> {
//            productService.save(new Product("MacBook", 120000));
//            System.out.println(productService.getAll());
//            System.out.println(productService.getById(1L)); // todd

            orderService.save(new Order(LocalDate.now()));

        };

    }

}
