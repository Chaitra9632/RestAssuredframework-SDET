package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class Serialization {
	
	@Test
	public void serializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step 1: create Object of POJO Class 
		EmployeeDetails emp = new EmployeeDetails("Chaitra", 123434, "TY123", "c@ty.com", true);
		
		//Step 2: Create object of OBjectMapper from jacksonMapper-tool
		ObjectMapper obj = new ObjectMapper();
		
		//Step 3: call write value method and provide the file path
		obj.writeValue(new File(".\\Emp1.json"),emp);
	}

}
