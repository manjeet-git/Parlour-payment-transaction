package com.parlour.payment.account;

import java.util.HashMap;
import java.util.Map;

public class CustomerAccountBalance {
	
	public static Map<String,Double> accountDetails= new HashMap<>();
	
	static{
		accountDetails.put("acc1", (double) 12000);
		accountDetails.put("acc2", (double) 8000);
		accountDetails.put("acc3", (double) 13000);
		accountDetails.put("acc4", (double) 3000);
		
	}

}
