public class Test 
{
	public static void main(String a[]) 
	{
		int n = 5;
		for (int rows = 1, p = 5; rows <= n; rows++, p--) 
		{
			for (int col = 1; col <= rows; col++) 
			{
				System.out.print(p+ " ");
			}

			System.out.println();
		}
	}
}
