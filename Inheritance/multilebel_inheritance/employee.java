package multilebel_inheritance;

public class employee extends person {
	
	int employee_id;
	
	public void set_eid(int eid)
	{
		employee_id=eid;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	

}
