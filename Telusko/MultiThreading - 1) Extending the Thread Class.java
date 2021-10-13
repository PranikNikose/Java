class Pranik extends Thread
{
	public void run() 
	{
		for (int i = 0; i <= 4; i++) 
		{
			System.out.println("Pranik");
			try 
			{
				Thread.sleep(1000); 
			} 
			catch (Exception e) 
			{
				
			}
		}
	}
}

class Nikose extends Thread
{
	public void run() 
	{
		for (int i = 0; i <= 4; i++) 
		{
			System.out.println("Nikose");
			try 
			{
				Thread.sleep(1000); 
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
		Pranik obj1 = new Pranik();
		Nikose obj2 = new Nikose();
		
		obj1.start();
		
		obj2.start();
	}
}
