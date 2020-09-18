import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;



public class Tests_GET {

	@Test
	 void test_01()
	{
		
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200);

	}
	
	
}
