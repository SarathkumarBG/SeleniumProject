package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.Actions;

public class Login_Objects extends Actions
{
	public static String country = "India";
	
	static By selectcountry = By.id("countryList_title");
	static By country_India = By.xpath("//span[text()='"+country+"']");
	static By emailid = By.xpath("//input[@id='username']");
	static By password = By.xpath("//input[@id='password']");
	static By loginbutton = By.xpath("//button[@class='loginLnk']");
	static By forgetpassword = By.xpath("//a[@class='forgot-link']");
	
	public static WebElement SelectCountry() {
		return findElement(selectcountry);
	}
	
	public static WebElement Country_India() {
		return findElement(country_India);
	}
	
	public static WebElement EmailId() {
		return findElement(emailid);
	}
	
	public static WebElement Password() {
		return findElement(password);
	}
	
	public static WebElement LoginButton() {
		return findElement(loginbutton);
	}
	
	public static WebElement ForgetPassword() {
		return findElement(forgetpassword);
	}
	
	
}
