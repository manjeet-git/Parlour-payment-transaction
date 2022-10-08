package com.parlour.payment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parlour.payment.account.CustomerAccountBalance;
import com.parlour.payment.custom.exception.InsuficientBalanceException;
import com.parlour.payment.entity.CustomerBillRequest;
import com.parlour.payment.entity.CutomerBillResponse;
import com.parlour.payment.entity.PassengerInfo;
import com.parlour.payment.entity.Payment;
import com.parlour.payment.repo.PassengerRepository;
import com.parlour.payment.repo.PaymentRepository;

@Service
public class ParlourPaymentService {

	@Autowired
	PassengerRepository passengerRepo;
	
	@Autowired
	PaymentRepository paymentRepository;
	
	@Transactional
	public CutomerBillResponse persistPayment(CustomerBillRequest customerBillRequest,String account) {
		
		PassengerInfo passengerDetails=customerBillRequest.getPassengerInfo();
		Payment payment=customerBillRequest.getPayment();
		
		passengerRepo.save(passengerDetails);
		if((payment.getAmount()>=CustomerAccountBalance.accountDetails.get(account))) {
			throw new InsuficientBalanceException("In you bank account "+account+" doesn't have sufficient balance..");
		}
		paymentRepository.save(payment);
		
		CutomerBillResponse custResp=new CutomerBillResponse(passengerDetails, payment, "success");
		
		return custResp;
		
	}
}
