package TC_Functions;




import org.openqa.selenium.interactions.Actions;

import Objects.Canvas_Studio_Objects;
import Utls.Action;

public class Canvas_Studio_Functions extends Action{

	static Actions actn = new Actions(driver);

	
	public static void open_casestudiopage() throws Exception
	{
		
		driver.get("http://www.htmlcanvasstudio.com/");
		driver.manage().window().maximize();

		IWait(Canvas_Studio_Objects.icon_draw_a_line());
				
		actn.moveToElement(Canvas_Studio_Objects.icon_draw_a_line());
		actn.click(Canvas_Studio_Objects.icon_draw_a_line()).perform();		
		
		
		
	}
	
	public static void HorizontalLine() throws Exception
	{
		actn.moveToElement(Canvas_Studio_Objects.Canvas_Container()).perform();
		actn.click(Canvas_Studio_Objects.Canvas_Container()).perform();
		actn.moveByOffset(50, 0).perform();
		actn.click(Canvas_Studio_Objects.Canvas_Container()).perform();
		
	}
	
	
	public static void VerticalLine() throws Exception
	{
		actn.moveToElement(Canvas_Studio_Objects.Canvas_Container()).perform();
		actn.click(Canvas_Studio_Objects.Canvas_Container()).perform();
		actn.moveByOffset(0, 50).perform();
		actn.click(Canvas_Studio_Objects.Canvas_Container()).perform();
		
	}
	
	
}
