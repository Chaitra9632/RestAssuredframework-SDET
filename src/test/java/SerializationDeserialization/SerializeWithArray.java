package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import practice_POJO_SerDes.*;

public class SerializeWithArray {
	
	@Test
	public void serialiseWithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] phno = {12345,9876};
	    String[] email = {"c@ty.com","c@gmail.com"};
		
		//Step 1: create a object of pojoclass
	    EmployeeDetailsWithArray emp = new EmployeeDetailsWithArray("Chaitra", "typ123", phno , email);
				
		//Step 2: create a object of objectMapper - jackson mapper tool
		ObjectMapper oMap = new ObjectMapper();
				
		//Step 3: use writeValue() from objectmapper and store in a json file
		oMap.writeValue(new File("./empDetailsWithArray.json"), emp);
	}

}
