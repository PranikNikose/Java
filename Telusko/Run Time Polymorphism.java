class MyClassA
{
//Method Overriding,Late binding, Dyanmic Binding, Runtime Polymorphism
	public void Display()
	{
		System.out.println("Class A Display");
	}
}

class MyClassB extends MyClassA
{
	public void Display()
	{
		System.out.println("Class B Display");
	}
}
class FirstCode 
{
	public static void main(String[] args)
	{
		MyClassB obj = new MyClassB();
		obj.Display();
	}
}
