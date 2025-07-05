package practice.springboot.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate date;
    @ManyToMany (cascade = {DETACH, MERGE, REFRESH})
    List<Product> products;
    @ManyToOne (cascade = {DETACH, MERGE, REFRESH})
    Customer customer;

    public Order(LocalDate date) {
        this.date = date;
    }
}
