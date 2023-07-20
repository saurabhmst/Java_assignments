package multilebel_inheritance;

public class person {
	
	private String name;
	private String address;
	
	protected void set_person(String name,String address)
	{
		this.name= name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
