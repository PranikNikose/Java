class FirstCode 
{
	public int replace(int number) 
	{
		String str = Integer.toString(number);
		int len = str.length();
		String newStr = "";
		
		for (int i = 0; i < len; i++) 
		{
			System.out.print(str.charAt(i)); 
			
			if(str.charAt(i)== '0')
			{
				newStr+='1';
			}
			else
			{
				newStr+=str.charAt(i);
			}
		}
		System.out.println();
		return Integer.parseInt(newStr);
	}

	public static void main(String[] args) 
	{
		FirstCode ob = new FirstCode();
		int result = ob.replace(8002);
		System.out.println(result + " ");
	}
}
