package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.EmployeeDetails;

public class Deserialization {
	
	@Test
	public void deserializationTest() throws JsonParseException, JsonMappingException, IOException
	{
		//Step 1: Create Object of Object mapper
		ObjectMapper obj = new ObjectMapper();
		
		//Step 2: read the value from Object Mapper Class
		EmployeeDetails emp = obj.readValue(new File(".\\Emp.json"), EmployeeDetails.class);
		
		//Step 3: access the value using reference
		System.out.println(emp.getEmail());
		emp.setName("SDET");
		
	}

}
