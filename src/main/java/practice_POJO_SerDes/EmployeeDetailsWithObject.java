package practice_POJO_SerDes;

public class EmployeeDetailsWithObject {
	
	//Step 1: declare variables globally
		String name;
		String empId;
		int[] phno;
		Object spouse;
		
		//Step 2: create constructor
		public EmployeeDetailsWithObject(String name, String empId, int[] phno, Object spouse) {
			this.name = name;
			this.empId = empId;
			this.phno = phno;
			this.spouse = spouse;
		}

		//Step 3: generate getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public int[] getPhno() {
			return phno;
		}

		public void setPhno(int[] phno) {
			this.phno = phno;
		}

		public Object getSpouse() {
			return spouse;
		}

		public void setSpouse(Object spouse) {
			this.spouse = spouse;
		}
		
		

}
