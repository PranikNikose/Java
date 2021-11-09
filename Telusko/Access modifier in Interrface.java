package com.Demo;

interface myInterface 
{
	void show();   //default
	public void display(); //public
	abstract void view();  // abstract	
	static void present(); //static 
}

public class myclass implements myInterface 
{
		public void display() 
		{
			System.out.println("In a Display");
		}

		public void show()
		{
			System.out.println("In a Show");
		}

		public void view() 
		{
			System.out.println("In a view");
		}
		
		public void present()
		{
			System.out.println("In a present");
		}

	public static void main(String[] args) 
	{
		myclass mc1 = new myclass();
		mc1.display();
		mc1.show();
		mc1.view();
		mc1.present();
		
	}
}
