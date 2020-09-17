package Utls;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

	
	public static WebDriver wdriver;
	public static Properties properties;
		
	//Initializing the WebDriver
	public static void Driver_Initialize() throws Exception
	{
		try {
		System.setProperty("webdriver.chrome.driver","D:\\Sarath\\Selenium\\driver\\chromedriver.exe");
		wdriver = new ChromeDriver();
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred while Initializing the error" + e);
		}
	}	
	
	//thread sleep
	public static void wait(int ele) throws Exception
	{
		try {
			Thread.sleep(ele);	}
		catch(Exception e){
			System.out.println("Exception Occurred in wait" + e); }
	}
	
	//To Read data
	public static String readData(String key) throws Exception
	{
			properties = new Properties();
			File file = new File(System.setProperty("user.dir","src/utls/Properties"));
			FileReader read = new FileReader(file);
			properties.load(read);
			String data = properties.getProperty(key);
			return data;
	}
	
	//To find Elements
	public static WebElement findElement(By element)
	{
		try {
		return wdriver.findElement(element);  
		}
		catch(Exception e)
		{
			System.out.println("Error occurred while finding Element" + e.toString());
		}
		return null;
	}
	
	// Method to Fill data
		public static void FillData(WebElement element, String Keys) {
			try {
				element.sendKeys(Keys);
			} catch (Exception e) {
				System.out.println("Exception occurred in filldata" + e.toString());
			}
		}
		
	// Method to click an element
		public static void click(WebElement ele) {
			try {
				ele.click();
			} catch (Exception e) {
				System.out.println("Exception occurred in click" + e.toString());
			}
		}

	// Method for Implicit Wait
		public static void IWait(WebElement element) throws Exception
		{
			try {
				WebDriverWait wait= new WebDriverWait(wdriver, 30);
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e) {
				System.out.println("Exception Occurred in Iwait"+ e);
			}
		}

	// Method to select element in Dropdown 
//		public static void Select(WebElement element, String value) throws Exception
//		{
//			try {
//				Select drpdown = new Select(element);
//			//	drpdown.selectByValue(value);
//			//	select.selectByIndex(value);
//				drpdown.selectByVisibleText(value);
//			}
//			catch(Exception e) {
//				System.out.println("Exception Occurred in select Dropdown" + e.toString());
//			}
//		}
//		
//	//	MethodtTo remove read only in a date picker
//		public static WebElement removeReadOnly(List<WebElement> element) 
//	    {
//			List<WebElement> inputs = element;
//			for (WebElement input : inputs) 
//			{
//				((JavascriptExecutor) wdriver).executeScript("arguments[0].removeAttribute('readonly','Readonly')", input);
//			}
//			return null;
//		}
	
	//sample remove read_only
		public static void removeReadOnly1(WebElement element) 
	    {
			((JavascriptExecutor) wdriver).executeScript("arguments[0].removeAttribute('readonly')", element);
		}
		
	// Page Scroll - Down by pixcel
		public static void pageScrollDown_pixcel()
		{
			((JavascriptExecutor) wdriver).executeScript("window.scrollTo(0,500 );");
		}
				
	// Page Scroll - Down
		public static void pageScrollDown()
		{
			((JavascriptExecutor) wdriver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
		}
		
	// Page Scroll - Up
		public static void pageScrollUp()
		{
			((JavascriptExecutor) wdriver).executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		}	
			
	//File upload
		public static void Upload_doc(WebElement element, String keys)
		{
			JavascriptExecutor js = (JavascriptExecutor) wdriver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			js.executeScript("arguments[0].click();", element);
			
			element.sendKeys(keys);
		}
	
		
		
}
