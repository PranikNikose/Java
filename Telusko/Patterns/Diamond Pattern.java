public class Test {
	public static void main(String a[]) {
		int n = 5;
		// Hill
		for (int row = 1; row < n; row++) /// Condition only < to make peak at mid
		{
			for (int col = row; col <= n; col++) 
			{
				System.out.print("  ");
			}
			for (int col = 1; col < row; col++) /// Condition only < to make peak top
			{
				System.out.print("* ");
			}
			for (int col = 1; col <= row; col++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		// reverse Hill
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print("  ");
			}
			for (int col = row; col < n; col++) /// Condition only < to make peak at top
			{
				System.out.print("* ");
			}
			for (int col = row; col <= n; col++) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
