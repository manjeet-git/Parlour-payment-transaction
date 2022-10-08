package com.parlour.payment.entity;


public class CutomerBillResponse {

	private PassengerInfo passengerInfo;
	private Payment payment;
	private String paymentStatus;
	
	public CutomerBillResponse(PassengerInfo passengerInfo, Payment payment, String paymentStatus) {
		super();
		this.passengerInfo = passengerInfo;
		this.payment = payment;
		this.paymentStatus=paymentStatus;
	}

	
	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "CutomerBillResponse [passengerInfo=" + passengerInfo + ", payment=" + payment + ", paymentStatus="
				+ paymentStatus + "]";
	}	
	
}
