public class Test {
	public static void main(String a[]) 
	{
		int n=4;
		int p=1;
			for(int rows=1;rows<=n;rows++)
			{
				for(int k=1;k<=rows;k++)  /// incresing
				{
					System.out.print(p+++"  ");
				}
				
				System.out.println();
			}
	}
}
