package com;
interface Drawable
{
		void draw();
}
interface Printable
{
		void print();
}
class Circle implements Drawable , Printable 
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void print()
	{
		System.out.println("Printing Circle");
	}
}
public class InterfaceInJava{
	
	public static void main(String[] args) 
	{
			Circle obj = new Circle();
			obj.draw();
			obj.print();
	}
}
/*Interface : 
 * 	
 * Its a blueprint of class.
 * 		=> 1) interface access  abstraction using interface. 
 * 		=> 2) Multiple inheritance => parent class more than one => child class properties access of 
 * 			  parent class. For that we use interface. 
 * declaration : interface interface-name
 * 					{
 * 
 * 					}
 * 	
 * relationship between class & interface : 
 * 	child	class   -> extends    -> class
 * 	child	class   -> implements -> parent interface
 * 	child interface -> extends    -> parent interface 
 *  
 * */
