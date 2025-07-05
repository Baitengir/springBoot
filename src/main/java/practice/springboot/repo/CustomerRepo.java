package practice.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.springboot.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    void removeById(Long id);
}
