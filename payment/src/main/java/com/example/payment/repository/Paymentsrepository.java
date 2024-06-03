package com.example.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payment.entity.Payment;
@Repository
public interface Paymentsrepository extends JpaRepository<Payment, Long>{

}
