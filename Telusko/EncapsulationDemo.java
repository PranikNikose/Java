class MyBank
{
	//Fields
	private String _Name;
	private long _BankAccount;
	private int _Balance;
	
	//Encapsulation 
	public String get_Name() 
	{
		return _Name;
	}

	public void set_Name(String _Name) 
	{
		this._Name = _Name;
	}

	public long get_BankAccount() 
	{
		return _BankAccount;
	}

	public void set_BankAccount(long _BankAccount) 
	{
		this._BankAccount = _BankAccount;
	}

	public int get_Balance() 
	{
		return _Balance;
	}

	public void set_Balance(int _Balance) 
	{
		this._Balance = _Balance;
	}

	//Constructor
	public MyBank(String Name,long BankAccount,int Balance)
	{
		this._Name=Name;
		this._BankAccount=BankAccount;
		this._Balance = Balance;
	}
	
	//Method 
	public void ShowBalance()
	{
		System.out.println(_Name +" "+_BankAccount +" "+ _Balance);
	}
	
}

class FirstCode 
{
	public static void main(String[] args)
	{
		MyBank Pranik = new MyBank("Pranik",20283544907L,3500);
		
		Pranik.set_Balance(2000);
		
		Pranik.ShowBalance();
		
	}
}
