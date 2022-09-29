package practice_POJO_SerDes;

public class EmployeeDetailsWithArray {

	//Step 1: create global variables
		String name;
		String empId;
		int[] phno;
		String[] email;
		
		//Step 2: craete a constructor
		public EmployeeDetailsWithArray(String name, String empId, int[] phno, String[] email) {
			this.name = name;
			this.empId = empId;
			this.phno = phno;
			this.email = email;
		}

		//Step 3: provide getters and setters 
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

		public String[] getEmail() {
			return email;
		}

		public void setEmail(String[] email) {
			this.email = email;
		};
		
}
