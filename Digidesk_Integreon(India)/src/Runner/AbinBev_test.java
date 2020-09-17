package Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import Utls.Actions;

public class AbinBev_test extends Actions
{

	@FindBy(how=How.XPATH, using="//a[text()= 'WoA']")
	private WebElement WoA;
	

	@Test
	public static void sample_run() throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Sarath\\Selenium\\driver\\chromedriver.exe");
		wdriver = new ChromeDriver();
		wdriver.manage().window().maximize();
		wdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wdriver.get("http://abi-mba-test.heptagon.tech/sign");
		
		wdriver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("admin@yopmail.com");
		wdriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin@123");
		wdriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		wait(1000);
		
		wdriver.findElement(By.xpath(" //a[contains(text(),'New Plan')]")).click(); // new plan button
		
		wait(200);
		wdriver.findElement(By.xpath("//ng-select[@placeholder='Select a Country']//input")).click();
		wdriver.findElement(By.xpath("//ng-select[@formcontrolname='countryId']//ng-dropdown-panel//div//span[contains(text(),'United States')]")).click();
		
		wdriver.findElement(By.xpath("//div[@class='ng-value-container']/div[contains(text(),'Select a Brand')]//following::div/input")).click();
		wait(500);
		wdriver.findElement(By.xpath("//ng-select[@placeholder='Select a Brand']//ng-dropdown-panel//div//span[contains(text(),'Budweiser')]")).click();
		
		wait(1000);
		wdriver.findElement(By.xpath("//input[@formcontrolname='mediaPlanName']")).sendKeys("Sample12");
		
		wait(500);
		pageScrollDown();
		wdriver.findElement(By.xpath("//button[@class='btn-medium main-action']")).click();
		
		wait(1000);
		wdriver.findElement(By.xpath("//span[ contains(text(),'I want to start with last year (2019) ')]")).click();
		
		wait(1000);
		pageScrollDown();
		wdriver.findElement(By.xpath("//button[text()=' Simulate ']")).click();
		
		
		
		
		
		
	}
	
	
}
