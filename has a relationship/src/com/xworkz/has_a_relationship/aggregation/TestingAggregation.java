package com.xworkz.has_a_relationship.aggregation;

public class TestingAggregation 
{
	public static void main(String[] args) {
	
		Temple temple= new Temple();
		temple.name = "Mantralayam";
		temple.location ="Mantralaya";
		temple.timing = "9:00 AM to 10:00 PM";
		
			
		God god= new God();
		god.name= "Raghavendra";
		god.gender="Male";
		god.temple= temple;
		
		System.out.println("Details of god are:");
		System.out.println("The Name of the temple is: "+god.temple.name);
		System.out.println("Location of the temple is: "+god.temple.location);
		System.out.println("Timings of the temple is: "+god.temple.timing);
		
		
			}
}
