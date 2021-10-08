class MyClass
{
//Method Overloading,Early Binding,Static Binding,CompileTime Polymorphism
	public void Display()
	{
		System.out.println("Displayed");
	}
	
	public void Display(int H)
	{
		System.out.println("Displayed "+ H);
	}
}

class FirstCode 
{
	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		obj.Display(5);
	}
}
