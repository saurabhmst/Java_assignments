package multilebel_inheritance;
import java.util.*;

public class manager_detail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("manager data----------------------------------------------> ");
		
		manager manager1 = new manager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person Name");
		String name = scanner.next();
		manager1.setName(name);
	    System.out.println("Enter Person Address");
		String Address = scanner.next();
		manager1.setAddress(Address);
		System.out.println("Enter Manager Salary");
		int salary = scanner.nextInt();
		manager1.setSalary(salary);
		System.out.println("Enter Employee Id");
		int id = scanner.nextInt();
		manager1.setEmployee_id(id);
		
		display(manager1);

	}

	private static void display(manager manager1) {
		// TODO Auto-generated method stub
		System.out.println("Name "+manager1.getName());
		System.out.println("Address "+manager1.getAddress());
		System.out.println("Employee id "+manager1.getEmployee_id());
		System.out.println("Salary "+manager1.getSalary());
	}

}
