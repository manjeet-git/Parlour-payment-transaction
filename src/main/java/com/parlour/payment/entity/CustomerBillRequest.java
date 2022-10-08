package com.parlour.payment.entity;


public class CustomerBillRequest {
	
      private PassengerInfo passengerInfo;
      private Payment payment;
      
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
		return "CustomerBillRequest [passengerInfo=" + passengerInfo + ", payment=" + payment + "]";
	}
      
      
      
	
}
