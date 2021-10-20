import java.util.Arrays;

public class Test 
{
	public static void main(String a[]) 
	{
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<6-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=6;j<6+i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
