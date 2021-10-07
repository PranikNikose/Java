class Outer
{
	static int a=10;
	public static void Show()
	{
		System.out.println("Show");
	}
	
	static class Inner {
		public void Display()
		{
			System.out.println("In Display");
		}
	}
}

public class FirstCode 
{
	public static void main(String a[]) 
	{
		//inner class 
		//class meber -----static member ----- anonymous
		
		//Outer obj1=new Outer();  
		//obj1.Show();
		
		//Outer.Inner obj2 = obj1.new Inner();
		//obj2.Display();
		
		Outer.Inner obj2 = new Outer.Inner();  // ClassName ObjectName = new ConstructoreName;   //for static member
		obj2.Display();
	}
}
