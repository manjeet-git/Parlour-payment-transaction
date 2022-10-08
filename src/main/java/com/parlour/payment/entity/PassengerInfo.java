package com.parlour.payment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	
	@Column(name = "PASSENGER_NAME")
	private String passengerName;
	
	@Column(name = "GENDER")
	private Enum GENDER;
	
	@Column(name="CITY")
	private String city;
	
	public PassengerInfo(int passengerId, String passengerName, Enum gENDER, String city) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		GENDER = gENDER;
		this.city = city;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Enum getGENDER() {
		return GENDER;
	}

	public void setGENDER(Enum gENDER) {
		GENDER = gENDER;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PassengerInfo [passengerId=" + passengerId + ", passengerName=" + passengerName + ", GENDER=" + GENDER
				+ ", city=" + city + "]";
	}
	
}
