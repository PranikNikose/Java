
class Pranik implements Runnable
{
	public void run() 
	{
		for (int i = 0; i <= 4; i++) 
		{
			System.out.println("Pranik");
			try 
			{
				Thread.sleep(500); 
			} 
			catch (Exception e) 
			{
				
			}
		}
	}
}

class Nikose implements Runnable
{
	public void run() 
	{
		for (int i = 0; i <= 4; i++) 
		{
			System.out.println("Nikose");
			try 
			{
				Thread.sleep(500); 
			} 
			catch (Exception e) 
			{
				
			}
		}
	}
}

class FirstCode 
{
	public static void main(String[] args) 
	{
		Runnable obj1 = new Pranik();
		Runnable obj2 = new Nikose();
		
		Thread t1 =new Thread(obj1);
		Thread t2 =new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}
}
