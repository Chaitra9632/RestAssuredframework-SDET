package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.*;


public class SerializeWithObject {
	
	@Test
	public void serialisationwithObjectTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] phno = {1234,765};
		Spouse sp = new Spouse("xyz", "Accenture", 5432);
		
		//Step 1: create obj of pojo
		EmployeeDetailsWithObject emp = new EmployeeDetailsWithObject("ABC", "TY123",phno , sp);
		
		//Step 2: create obj of object mapper
		ObjectMapper map = new ObjectMapper();
		
		//Step 3: write values into json file
		map.writeValue(new File("./empDetailsWithObj.json"), emp);
	}


}
