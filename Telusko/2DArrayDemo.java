class FirstCode 
{
	public static void main(String[] args)
	{
		//initializing 2D array
		int Array2D [][]= new int[3][3];
		
		//initialize and assign at same time 
		int Arr2D [][] = {
							{2,4,6,8},
							{1,3,5},
							{9,6,3}
						 };
		
		//accessing the values
		System.out.println(Arr2D[0][0]);    System.out.println();
		
		//for jagged array as well as 2D normal array using For loop
		for(int i=0;i<Arr2D.length;i++)
		{
			for (int j=0;j<Arr2D[i].length;j++)
			{
				System.out.print(Arr2D[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//For jagged as well as normal 2D array using For-Each loop
		for (int k[]: Arr2D)
		{
			for (int l:k)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
