package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.Action;

public class Canvas_Studio_Objects extends Action
{

	static By drwa_a_line = By.xpath("//div[@class='toolbar']//input[@title='Draw a line']");
	
	static By canvas_container = By.xpath("//canvas[@id='imageTemp']");
	
	
	
	public static WebElement icon_draw_a_line()
	{
		return findElement(drwa_a_line);
		
	}
	
	public static WebElement Canvas_Container()
	{
		return findElement(canvas_container);
		
	}
	
}
