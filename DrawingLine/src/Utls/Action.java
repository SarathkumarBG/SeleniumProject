package Utls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class Action {

	public static WebDriver driver;
	
	//to Initialize the driver
	public static void Driver_Initialize() throws Exception
	{
		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Sarath\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred while Initializing the error" + e);
		}
	}	
	
	//To find Element
	public static WebElement findElement(By element)
	{
		try {
		return driver.findElement(element);  
		}
		catch(Exception e)
		{
			System.out.println("Error occurred while finding Element" + e.toString());
		}
		return null;
	}
	
	//to clicki an element
	public static void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println("Exception occurred in click" + e.toString());
		}
	}
	
	//Implicit wait
	public static void IWait(WebElement element) throws Exception
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable((element)));
		}
		catch(Exception e) {
			System.out.println("Exception Occurred in Iwait"+ e);
		}
	}
	
	
}
