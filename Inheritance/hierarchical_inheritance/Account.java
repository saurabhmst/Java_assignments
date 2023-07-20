package hierarchical_inheritance;

public class Account {
	 private String name;
	 private String account_number;
	
	public void set_account_number(String account_number)
	{
		this.account_number=account_number;
		
	}
	
	public void set_name(String name)
	{
		
		this.name=name;
	}
	
	public String get_name()
	{
		return name;
	}
	public String get_account_number()
	{
		return account_number;
	}

}
