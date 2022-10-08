package com.parlour.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parlour.payment.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
