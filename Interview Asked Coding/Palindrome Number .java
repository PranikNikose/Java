public class Test {
	public static void main(String a[]) 
	{
		int n =32123;
		int m = n;
		int k=0;
		while(n!=0)
		{
			int r = n%10; //3    2     1    2    3
			k= r + k*10; //3     32    321  3212 32123
			n = n/10;    //3212  321   32   3    0
		}
		if (k==m)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println(" not Palindrome");
		}

	}
}
