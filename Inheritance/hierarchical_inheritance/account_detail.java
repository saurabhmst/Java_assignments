package hierarchical_inheritance;
import java.util.*;

public class account_detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select your Account type\nCurrent press 1 \nSaving press 2");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		while(input!=-1)
		{
			
			if(input==1)
			{
				current_account(scanner);
			    input=-1;
		      break;
			}
		
			if(input==2)
			{
			
				saving_account(scanner);
		        input=-17;
			  break;
			}
		
		
		
       
		  System.out.println("Invalide selection! \nplease select a valid option ");
		  input = scanner.nextInt();
	    }
		
		System.out.println("thankyou!");
	}

	private static void current_account(Scanner scanner) {
		// TODO Auto-generated method stub
		
		System.out.println("You selected Current");
		
		Current current = new Current();
		System.out.println("Enter Account holder name");
		String name= scanner.next();
		current.set_name(name);
		System.out.println("Your account Number is");
		String account_number=genrate_account_number();
		System.out.println(account_number);
		current.set_account_number(account_number);
		System.out.println("Enter rate of intrest");
	    double roi= scanner.nextDouble();
		current.set_rate_of_intrest(roi);
		display_current(current);
		
	}

	private static void display_current(Current account) {
		// TODO Auto-generated method stub
	

		
			System.out.println("Name "+account.get_name());
			System.out.println("Account_number "+account.get_account_number());
			System.out.println("Rate_of_intrest "+account.get_rate_of_intrest());
			
		
	}

	private static void saving_account( Scanner scanner) {
		// TODO Auto-generated method stub
		
       System.out.println("You selected Saving");
		
		Saving saving = new Saving();
		System.out.println("Enter Account holder Name");
		String name= scanner.next();
		saving.set_name(name);
		System.out.println("Your account Number is");
		String account_number=genrate_account_number();
		System.out.println(account_number);
		saving.set_account_number(account_number);
		System.out.println("Enter Balance");
		double balance= scanner.nextDouble();
		saving.set_balance(balance);
		display_saving(saving);
		  
		
	}

	private static String genrate_account_number() {
		
		Random random = new Random();
		
		long account_number=1234567890 + random.nextInt(1000000);
		String str="";
		return str+(account_number);
	}

	private static void display_saving(Saving account) {
		// TODO Auto-generated method stub
		
	       
			System.out.println("Name "+account.get_name());
			System.out.println("Account_number "+account.get_account_number());
			System.out.println("Balance "+account.get_balance());
			
		
		
	}
}
