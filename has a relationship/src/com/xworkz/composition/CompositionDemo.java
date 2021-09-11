package com.xworkz.composition;

public class CompositionDemo {
	public static void main(String[] args) {
		
		Wings wings = new Wings();
		wings.size = "6 ft 7 in";
		wings.shape = "Vestigial structure";
		
		Bird bird = new Bird();
		bird.name = "Ostrich";
		bird.category = "Flightless bird";
		bird.color = "Black plumage";
		bird.wings = wings;
		
		System.out.println("Details of wings of Ostrich is:");
		System.out.println("Size of wings are :"+ bird.wings.size);
		System.out.println("Type of wings are :"+ bird.wings.shape);
		}
}
