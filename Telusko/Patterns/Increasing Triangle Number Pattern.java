public class Test 
{
	public static void main(String a[]) 
	{
		int n = 6;
		for (int rows = 1; rows <= n; rows++) 
		{
			int p=1;
			for (int col = 1; col <= rows; col++) 
			{
					System.out.print(p++ +" ");
			}

			System.out.println();
		}
	}
}
