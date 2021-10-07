class Calculator 
{
	public int Add(int...n)
  {
		int sum = 0;
		for (int k : n) 
    {
			sum += k;
		}
		return sum;
	}
}

class FirstCode 
{
	public static void main(String[] args) 
  {
		Calculator myobj1 = new Calculator();
		System.out.println(myobj1.Add(12, 12, 12, 12));
	}
}
