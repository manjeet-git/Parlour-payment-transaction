package com.parlour.payment.custom.exception;


public class InsuficientBalanceException extends RuntimeException {

	public InsuficientBalanceException(String msg) {
		super(msg);
	}
}
