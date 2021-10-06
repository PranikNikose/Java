public class FirstCode 
{
	public static void main(String a[]) 
	{
		for (char i = 'A'; i < 'D'; i++) 
		{
			for (int j = 'A'; j <= i; j++) 
			{
				System.out.print((char)j +" ");
			}
			System.out.println();
		}
	}
}
