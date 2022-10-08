package com.parlour.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parlour.payment.entity.PassengerInfo;


@Repository
public interface PassengerRepository extends JpaRepository<PassengerInfo, Integer>{

}
