class FirstCode 
{
	int _Result=0;
	public void Add(int num)
	{
		for(int i=0;i<3;i++)
		{int R = num%10;
		_Result +=R;
		num = num /10;
		}
		System.out.println(_Result);
	}

	public static void main(String[] args) 
	{
		FirstCode obj = new FirstCode();
		obj.Add(719);
	}
}
