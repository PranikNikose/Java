class FirstCode 
{
	public static void main(String[] args)
	{
		//Creating an int array
		int EvenArr[] = new int[5];
		
		//assigning value 
		EvenArr[0]=0;
		EvenArr[1]=2;
		EvenArr[2]=4;
		EvenArr[3]=6;
		EvenArr[4]=8;
		
		//OR we can initialize and assign at same time 
		int OddArr[] = {1,3,5,7,9};
		
		//accessing the value 
		System.out.println(EvenArr[3]);
		System.out.println(OddArr[4]);  
		System.out.println();
		
		//accessing array through For loop
		for(int i=0;i<5;i++)
		{
			System.out.println(EvenArr[i] +"  "+ OddArr[i]);
		}
		System.out.println();
		
		//accessing array through For-each loop
		for (int num : EvenArr) 
		{ 
		    System.out.println(num);;
		} 
	}
}
