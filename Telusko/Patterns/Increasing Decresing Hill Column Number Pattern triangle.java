public class Test {
	public static void main(String a[]) 
	{
		int n=5;
			for(int rows=1;rows<=n;rows++)
			{
				
				int p=1;
				for(int k=rows;k<=n;k++)  /// decresing
				{
					System.out.print("  ");
				}
				for(int col = 1;col<rows;col++) ///increasing and condition for peak at top
				{
					System.out.print(p+++" ");
				}
				for(int col = 1;col<=rows;col++) ///increasing
				{
					System.out.print(p--+" ");
				}
				System.out.println();
			}
	}
}
