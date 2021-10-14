class FirstCode 
{
	public void reverse(String s)
	{
		String str ="";
		String nstr = "";
		for(char k : s.toCharArray())
		{
			 nstr = k + nstr ;
		}
		System.out.println(nstr);
	}

	public static void main(String[] args) 
	{
		FirstCode obj = new FirstCode();
		obj.reverse("PKN");
	}
}
