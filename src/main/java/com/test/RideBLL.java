package com.test;

public class RideBLL {
	
	public String validate(Ride ride){
		
		if(!ride.getSrc().isEmpty() && !ride.getDest().isEmpty()){
			return "Success";
		}
		else {
			return "Unknown";
		}
	}

}
