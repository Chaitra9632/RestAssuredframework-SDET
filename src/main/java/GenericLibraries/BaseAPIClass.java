package GenericLibraries;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

/**
 * This class will contain basic configuration annotations
 * @author Chaitra M
 *
 */
public class BaseAPIClass {
	
	public DatabaseLibrary dbLib = new DatabaseLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public RestAssuredLibrary rLib = new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dbLib.connectToDB();
		Reporter.log("====db connection successfull====", true);
		
		baseURI = IConstantsLibrary.appURL;
		port = IConstantsLibrary.appPort;
		
	}
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dbLib.closeDB();
		Reporter.log("====db closed====",true);
	}
	
	

}
