package practice_POJO_SerDes;

public class Spouse {
	

	//Step1: create variables globally
	String name;
	String company;
	int phno;
	
	//Step 2: craete a constructor
	public Spouse(String name, String company, int phno) {
		this.name = name;
		this.company = company;
		this.phno = phno;
	}

	//Step 3: generate getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}
	

}
