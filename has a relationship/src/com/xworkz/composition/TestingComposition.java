package com.xworkz.composition;

public interface TestingComposition {
	public static void main(String[] args) {
		
		Ink ink = new Ink();
		ink.color = "blue";
		ink.type = "gel";
		
		Pen pen = new Pen();
		pen.name = "Ballpoint";
		pen.price = 10;
		pen.ink = ink;
		
		System.out.println("Details of ink uesd in ballpoint pen:");
		System.out.println("The color of ink is:"+pen.ink.color);
		System.out.println("The type of ink is:"+pen.ink.type);
		
		
	
		
		
	}

}
