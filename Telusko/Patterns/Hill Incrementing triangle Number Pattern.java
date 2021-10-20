public class Test 
{
	public static void main(String a[]) 
	{
		int n = 5;
		for (int rows = 1; rows <= n; rows++) 
		{
			int p=1;
			for (int col = rows; col <= n; col++) 
			{
					System.out.print("  ");
			}
			for (int col = 1; col < rows; col++)  //condition for peak
			{
					System.out.print(p++ +" ");
			}
			for (int col = 1; col <= rows; col++) 
			{
					System.out.print(p++ +" ");
			}

			System.out.println();
		}
	}
}
