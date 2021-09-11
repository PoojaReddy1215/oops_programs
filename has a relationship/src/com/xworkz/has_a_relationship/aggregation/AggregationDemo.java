package com.xworkz.has_a_relationship.aggregation;

public class AggregationDemo {
	public static void main(String[] args) {
		
		Internet internet = new Internet();
		internet.type = "Satellite";
		internet.name = "Starlink";
		internet.speed = "Max Download speed=100Mbps, Max Upload speed=3Mbps";
		
		Mobile mobile = new Mobile();
		mobile.name="Vivo S7";
		mobile.RAM="4 GB";
		mobile.processor="2.0 GHz Octa-Core";
		mobile.internet = internet;
		
		System.out.println("The details of internet are:");
		System.out.println("Type of internet is :"+ mobile.internet.type);
		System.out.println("Name of internet is :"+ mobile.internet.name);
		System.out.println("Speed of internet is :"+ mobile.internet.speed);
		}
}
