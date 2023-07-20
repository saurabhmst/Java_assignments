package hierarchical_inheritance;

public class Saving extends Account {
	
private double balance;

public void set_balance(double balance)
{
	this.balance=balance;
}

Account account = new Account();

public double get_balance()
{
	return balance;
	
}

}
