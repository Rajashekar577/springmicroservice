package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Od;
import com.example.demo.model.Or;
@Repository
public interface OrderRepository extends JpaRepository<Od, Long>{

	Or save(Or or);

	void save(long orderId);

}
