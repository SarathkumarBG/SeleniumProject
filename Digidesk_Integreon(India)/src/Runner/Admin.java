package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Integreon_Tabs;
import TC_Functions.AddNewRequest_Function;
import TC_Functions.Login_functions;
import Utls.Actions;

public class Admin extends Actions
{
	

	@BeforeTest
	public void Initialize_Driver() throws Exception
	{	//Initializing the Driver
		Driver_Initialize();
	} 

	@Test(priority = 1)
	public void login_integreon() throws Exception
	{	// Login
		Login_functions.India_login_user();
	}
	
	@Test(priority = 2)
	public void Addnew_Request() throws Exception
	{	wait(600);
		click(Integreon_Tabs.OnBoarding_tab());
				
//		for(int i=1; i<=2 ;i++)
//		{
			wait(600);
		AddNewRequest_Function.AddNewRequest();
//		}
	}
	
	
}
