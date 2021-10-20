public class Test 
{
	public static void main(String a[]) 
	{
		int n = 5;
		for (int rows = 1, p = 5; rows <= n; rows++, p--) 
		{
			for (int col = 1; col <= rows; col++) 
			{
				if(rows%2==0)
				{
					System.out.print("E ");
				}
				else
				{
					System.out.print("O ");
				}
			}

			System.out.println();
		}
	}
}
