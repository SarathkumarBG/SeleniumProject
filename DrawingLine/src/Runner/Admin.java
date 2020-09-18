package Runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TC_Functions.Canvas_Studio_Functions;
import Utls.Action;

public class Admin extends Action
{
	
	@BeforeTest
	public void Initialize_driver() throws Exception
	{
		Driver_Initialize();
	}
	
	@Test
	public void Draw_A_Line()throws Exception
	{
	
		Canvas_Studio_Functions.open_casestudiopage();
		Canvas_Studio_Functions.HorizontalLine();
		Canvas_Studio_Functions.VerticalLine();

		
	}
	
	
	

}
