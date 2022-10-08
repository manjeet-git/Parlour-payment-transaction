package com.parlour.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parlour.payment.entity.CustomerBillRequest;
import com.parlour.payment.entity.CutomerBillResponse;
import com.parlour.payment.service.ParlourPaymentService;

@RestController
@RequestMapping("api/v1/parlour/payment")
public class CustomerPaymentController {
	
	@Autowired
	ParlourPaymentService paymentService;
	
	@PostMapping(path = "/save/{account}")
	public ResponseEntity<CutomerBillResponse> persistCustomerPayment(@RequestBody CustomerBillRequest customerBillReq, @PathVariable String account){
		return new ResponseEntity<CutomerBillResponse>(paymentService.persistPayment(customerBillReq, account), HttpStatus.ACCEPTED);
	}
}
