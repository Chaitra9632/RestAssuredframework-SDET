package practice_POJO_SerDes;

public class EmployeeDetails {
	
	//Step 1: declare all the variables globally
	String Name;
	int PhoneNum;
	String EmpID;
	String Email;
	boolean isEmployed;
	
	//Step 2: Create a constructor to initilaise the variables
	public EmployeeDetails(String name, int phone, String empID, String email, boolean isEmployed) {
		this.Name = name;
		this.PhoneNum = phone;
		this.EmpID = empID;
		this.Email = email;
		this.isEmployed = isEmployed;
	}

	public EmployeeDetails()
	{
		
	}
	
	//Step 3: provide getters and setters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhone() {
		return PhoneNum;
	}

	public void setPhone(int phone) {
		PhoneNum = phone;
	}

	public String getEmpID() {
		return EmpID;
	}

	public void setEmpID(String empID) {
		EmpID = empID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public boolean isEmployed() {
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	
	
	
	
	
	

}
