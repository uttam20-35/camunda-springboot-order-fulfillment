package com.crossasyst.camunda.repository;

/*import com.crossasyst.camunda.camundaorderfulfillment.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;*/
import com.crossasyst.camunda.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
