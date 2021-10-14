class FirstCode 
{
	public void find(String s)
	{
		String str = s.toLowerCase();
		int countVowels=0;
		int countConsonents=0;
		for(int i=0;i<str.length();i++)
		{
		if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
			     str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			countVowels+=1;
			}
		else
		{
			countConsonents++;
		}
		}
		System.out.println("Total number of vowels : "+countVowels+ " Total number of consonants :"+countConsonents);
	}

	public static void main(String[] args) 
	{
		FirstCode obj = new FirstCode();
		obj.find("characterization");
	}
}
