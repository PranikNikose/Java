class abc
{
	int c;
	
	public synchronized void increment()
	{
		c++;
	}
	
}

class FirstCode {
	public static void main(String[] args) throws Exception 
	{
		abc c = new abc();
		
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) 
			{
				c.increment();
				try 
				{
					//Thread.sleep(500);
				} 
				catch (Exception e) 
				{

				}
			}
		});
		Thread t2 = new Thread(() -> 
		{
			for (int i = 1; i <= 1000; i++) 
			{
				c.increment();
				try 
				{
					//Thread.sleep(500);
				} catch (Exception e) 
				{

				}
			}
		});

		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count "+ c.c);

	}
}
