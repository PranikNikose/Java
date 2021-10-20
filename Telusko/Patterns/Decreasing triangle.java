import java.util.Arrays;

public class Test 
{
	public static void main(String a[]) 
	{
		int n=5;
		for(int rows=1;rows<=n;rows++)
		{
			for (int col=rows;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		}
}
