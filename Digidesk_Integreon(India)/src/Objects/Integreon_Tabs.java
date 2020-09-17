package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.Actions;

public class Integreon_Tabs extends Actions
{
	//Dashboard 
		static By Dashboard = By.xpath("//ul[@class='leftMenu group']//li[@class='active']//a[@title='Dashboard']");
	
	//Onboarding links
		static By OnBoarding = By.xpath("//div[@class='header-right group']//a[@href='onboarding.php']");
		static By Onboard_queue = By.xpath("//ul[@class='submenu']//li//a[@title='Queue']");
		static By Onboard_verified = By.xpath("//ul[@class='submenu']//li//a[@title='Verified']");
		static By Onboard_reprocess = By.xpath("//ul[@class='submenu']//li//a[@title='ReProcess']");
		static By Onboard_QCverified = By.xpath("//ul[@class='submenu']//li//a[@title='QC Verified']");
		static By Onboard_cancelled = By.xpath("//ul[@class='submenu']//li//a[@title='Cancelled']");
		static By Onboard_offerdecline = By.xpath("//ul[@class='submenu']//li//a[@title='OL Rejected']");
		
	//User management
		static By User_management = By.xpath("//ul[@class='leftMenu group']//li[@class]//a[@title='User Management']");
		
	//Masters
		static By Master = By.xpath("//ul[@class='leftMenu group']//li[@class]//a[@title='Master']");
		
		//
		
		
		public static WebElement OnBoarding_tab()
		{
			return findElement(OnBoarding);
		}
		
		
}
