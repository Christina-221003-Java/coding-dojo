package com.revature;

import java.time.LocalTime;

public class handsOfTime {
	
	public double getAngle(LocalTime time) {
        
		//Convert LocalTime to hours and minutes
		int hours = time.getHour();
		int minutes = time.getMinute();
		
		//Multiplying minute by the degrees per minute and multiplying the hours by degrees per hour
		double minuteAngle = minutes*6;
		double hourAngle = (hours*30);
		
        //Subtracting the hour angle by the minute angle and taking the absolute value
		double finalAngle = Math.abs(hourAngle-minuteAngle);
		
		//Checking if the angle is larger than 180 so we can take the smaller angle
		if( finalAngle > 180) {
			return 360 - finalAngle;
		} else {
			return finalAngle;
		}
			
    }

}
