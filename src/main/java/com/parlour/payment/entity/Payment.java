package com.parlour.payment.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	
	
	@Column(name = "AMOUNT")
	private double amount;
	
	@Column(name = "PAYMENT_DATE")
	private String paymentDate;
	

	public Payment(int paymentId, double amount, String paymentDate) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentDate="
				+ paymentDate + "]";
	}
	
}
