package com.chaoslogix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chaoslogix.model.OrderEntity;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    
    Optional<OrderEntity> findByReference(String reference);

}
