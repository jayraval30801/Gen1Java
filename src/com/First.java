package com;

abstract class Bike
{
	abstract void run();
	abstract void milage();
	void display()
	{
		System.out.println("Bike display is very well");
	}
	static void light()
	{
		System.out.println("Light is yellow");
	}
	Bike()
	{
	System.out.println("Bike Con Called");	
	}
	static {
		System.out.println("Static Block Called");
	}
	final void gear()
	{
		System.out.println("It has 5 gears");
	}
}
class First extends Bike
{
	
		void milage()
		{
			System.out.println("Mileage is  60km/l");
		}
		void run()
		{
			System.out.println("BIke is running");
		}
		
		public static void main(String[] args) {
			First  obj = new First();
			obj.run();
			obj.milage();
			obj.display();
			obj.gear();
			obj.light();
		}
}

/*
 * 
 * Abstraction  : 
 * 		
 * 				Hiding implementation details and showing only functionalities to the user.
 * 	1) Abstract class : 
 * 			class keyword abstract.it can have abstract and non abstract methods.
 * 		Abstract method implements can not be instantiated.
 * 	=>	abstract display(); 
 * 	=> 	void display()
 * 		{
 * 				
 * 			}	
 * => static method constuctor 
 * => static Block 	
 * => final method.
 * 	2) Interface :
 * 
 * 
 * */


