package TC_Functions;


import Objects.Login_Objects;
import Utls.Actions;

public class Login_functions extends Actions
{
	public static String user_env = "dev";
	public static String user_email = "sarathkumar.g@heptagon.in";
	public static String user_psswrd = "Admin@123";
	
	public static void India_login_user() throws Exception
	{
		wdriver.get("http://integreon-"+user_env+".digidesk.co/");
		//wdriver.get(readData("URL"));
		wait(500);
		
		wdriver.manage().window().maximize();
		
		wait(500);
		// Click Country DropDown
		click(Login_Objects.SelectCountry());
		// Click Country - India	
		click(Login_Objects.Country_India());	
		// Email
		FillData(Login_Objects.EmailId(), user_email);
		// password
		FillData(Login_Objects.Password(), user_psswrd);
		// Click login button
		click(Login_Objects.LoginButton());
	}
	
}
