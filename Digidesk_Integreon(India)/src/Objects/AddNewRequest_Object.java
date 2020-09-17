package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utls.Actions;

public class AddNewRequest_Object extends Actions
{	
	static int gender_num = 1;
	static int workstate_num = 1;
	static int desg_num = 32;
	static int busunt_num =2;
	static int hiring_num = 1;
	static int reporting_num = 12;
	static int sourcetype_num = 2;	
	static int serviceline_num = 1; 
	static int hiretype_num = 1;
	static int emplmenttype_num = 2;
	static int rehire_num = 2;
	
//Basic fields
	 static By addnewreq_button = By.xpath("//a[@id='myBtn']");
	 static By firstname = By.xpath("//input[@id='ref_fname']");
	 static By lastname =  By.xpath("//input[@id='ref_lname']");
	 static By email = By.xpath("//input[@id='ref_email']");
	 static By phnumber = By.xpath("//input[@id='ref_phone']"); 
	 static By verify_number = By.xpath("//a[@class='verifyLink']");
	 static By gender = By.xpath("//button[@data-id='gender']");
	 static By workstate = By.xpath("//button[@data-id='ref_state']");
	 static By worklocation = By.xpath("//button[@data-id='sel_loc']");
	 static By current_address = By.xpath("//textarea[@id='current_address']");
	 static By permanent_address = By.xpath("//textarea[@id='permananent_address']");
	 static By desingnation = By.xpath("//button[@data-id='ref_designation']");
	 static By startdate = By.xpath("//input[@id='ref_doj']");
	 static By businessunit = By.xpath("//button[@data-id='ref_businessunit']");
	 static By serviceline = By.xpath("//button[@data-id='ref_serviceline']");
	 static By team = By.xpath("//button[@data-id='team']");
	 static By hiringmanager = By.xpath("//button[@data-id='ref_hm']");
	 static By reportingmanager = By.xpath("//button[@data-id='reporting_manager']");
	 static By employment_type = By.xpath("//button[@data-id='sel_sector']");
	 static By offerdate = By.xpath("//input[@id='offer_date']");
	 static By prf_number = By.xpath("//input[@id='prf_num']");
	 static By prf_date = By.xpath("//input[@id='prf_date']");
	 static By client = By.xpath("//button[@data-id='sel_company']");
	 static By sourcetype = By.xpath("//button[@data-id='source_type']");
	 static By sub_source = By.xpath("//button[@data-id='sub_source']");
	 static By hiretype = By.xpath("//button[@data-id='hire_type']");
	 static By rehire = By.xpath("//button[@data-id='rehire']");
	 static By Offerletter_doc = By.name("supportDoc");
	
//Buttons
	 static By submit_button = By.xpath("//input[@id='sendMessageButton']");
	 static By cancel_button = By.xpath("//a[contains(text(),'Cancel')]");
	 
//Dropdown feilds 
//Gender (option 1<->2 Male, Female)
	 static By gender_option = By.xpath("//div[@class='col-md-10']//div[2]//div[3]//div[contains(@class,'btn-group bootstrap-select')]//li["+gender_num+"]");
	 
//Work State (option 1<->2 Maharastra, UP)
	 static By workstate_option = By.xpath("//div[@class='col-md-10']//div[3]//div[1]//div[contains(@class,'btn-group bootstrap-select')]//li["+workstate_num+"]");
	 
//Work Location
	 static By worklocation_option = By.xpath("//div[@class='col-md-10']//div[3]//div[2]//div[contains(@class,'btn-group bootstrap-select')]//li[2]");
	 
//Designation (option = 1 <-> 61)
	 static By designation_option = By.xpath("//div[@class='col-md-10']//div[4]//div[2]//div[contains(@class,'btn-group bootstrap-select')]//li["+desg_num+"]"); 
	 
//Business Unit (option = 1 <-> 5)[BES, CCC, Corporate, Discovery, Ligitation]
	 static By businessunit_option = By.xpath("//div[@class='col-md-10']//div[5]//div[1]//div[contains(@class,'btn-group bootstrap-select')]//li["+busunt_num+"]");
	 
//Service line
	 static By serviceline_option = By.xpath("//div[@class='col-md-10']//div[5]//div[2]//div[contains(@class,'btn-group bootstrap-select')]//li["+serviceline_num+"]");
	 
//Team
	 static By team_option = By.xpath("//div[@class='col-md-10']//div[5]//div[3]//div[contains(@class,'btn-group bootstrap-select')]//li[2]");
	 
//Hiring Manager
	 static By hiringmanager_option = By.xpath("//div[@class='col-md-10']//div[6]//div[1]//div[contains(@class,'btn-group bootstrap-select')]//li["+hiring_num+"]");
	 
//Reporting Manager
	 static By reportingmanager_option = By.xpath("//div[@class='col-md-10']//div[6]//div[2]//div[contains(@class,'btn-group bootstrap-select')]//li["+reporting_num+"]");
	 
//Employment Type(option = 1<->2 permanant, Temporary)
	 static By emptype_option = By.xpath("//div[@class='col-md-10']//div[6]//div[3]//div[contains(@class,'btn-group bootstrap-select')]//li["+emplmenttype_num+"]");
	 
//Source Type (option = 1<->6 Agency, direct, employee referel, job portal, Temp to Permanent, Walk-in)
	 static By sourcetype_option = By.xpath("//div[@class='col-md-10']//div[@class='row']//div[1]//li["+sourcetype_num+"]");

//Sub Source (Option = 1)
	 static By subsource_option = By.xpath("//div[@class='col-md-10']//div[@class='row']//div[2]//li[2]");
	 
//Hire Type (option = 1<->2 New Hire, Replacement)
	 static By hiretype_option = By.xpath("//div[@class='col-md-10']//div[@class='row']//div[5]//li["+hiretype_num+"]");

//Rehire Option (option = 1<->2 Yes,No)
	 static By rehire_option = By.xpath("//div[@class='col-md-10']//div[@class='row']//div[6]//li["+rehire_num+"]");
	 
	 
 
//Basic Fields
//Add new request 
 	public static WebElement AddNewReqButton() {
 		return findElement(addnewreq_button);
		}	
//First Namme
 	public static WebElement FirstName() {
 		return findElement(firstname);
 		} 
//Last Name 
 	public static WebElement LastName() {
 		return findElement(lastname);
 		} 
//Email	
 	public static WebElement Email() {
 		return findElement(email);
 		} 
//Phone Number
 	public static WebElement PhoneNum() {
 		return findElement(phnumber);
 		} 
// Verify Number
 	public static WebElement VerifyNumber() 
 	{
 		return findElement(verify_number);
 	}
//Gender
 	public static WebElement Gender() {
 		return findElement(gender);
 		} 
//Work State
 	public static WebElement WorkState() {
 		return findElement(workstate);
 		} 
//Work Location
 	public static WebElement WorkLocation() {
 		return findElement(worklocation);
 		} 
//Current Address
 	public static WebElement CurrentAdd() {
 		return findElement(current_address);
 		} 
//Permanent Address
 	public static WebElement PermanentAdd() {
 		return findElement(permanent_address);
 		} 
//Designation
 	public static WebElement Designation() {
 		return findElement(desingnation);
 		}
//Start Date
 	public static WebElement StartDate() {
 		return findElement(startdate);
 		}
//Business Unit 	
 	public static WebElement BusinessUnit() {
 		return findElement(businessunit);
 		}
//Service Line
 	public static WebElement ServiceLine() {
 		return findElement(serviceline);
 		} 
//Team
 	public static WebElement Team() {
 		return findElement(team);
 		}
//Hiring manager
 	public static WebElement HiringManager() {
 		return findElement(hiringmanager);
 		}
//Reporting Mnager
 	public static WebElement ReportingManager() {
 		return findElement(reportingmanager);
 		}
//Employment Type
 	public static WebElement EmploymentType() {
 		return findElement(employment_type);
 		}
//Offer Date
 	public static WebElement OfferDate() {
 		return findElement(offerdate);
 		}
//PRF Number
 	public static WebElement PRF_Number() {
 		return findElement(prf_number);
 		}
//PRF Date
 	public static WebElement PRF_Date() {
 		return findElement(prf_date);
 		} 	
//Source Type
 	public static WebElement SourceType() {
 		return findElement(sourcetype);
 		}
//Sub Source
 	public static WebElement SubSource(){
 		return findElement(sub_source);
 	}
//Hire Type 	
 	public static WebElement HireType() {
 		return findElement(hiretype);
 		}
// Rehire 
 	public static WebElement Rehire() {
 		return findElement(rehire);
	}
//Upload document 	
 	public static WebElement OfferLetter_Doc() {
 		return findElement(Offerletter_doc);
 		}
//Cancel Buttton
 	public static WebElement CancelButton() {
 		return findElement(cancel_button);
 	}
//Submit Button
 	public static WebElement SubmitButton() {
 		return findElement(submit_button);
 	}
 	
 	
 	
 	
//Dropdown Option
// Gender 
 	 public static WebElement Gender_Option() {
 		 return findElement(gender_option);
 	 }
//Work State
 	 public static WebElement WorkState_Option() {
 		 return findElement(workstate_option);
 	 } 
//Work Location
 	public static WebElement WorkLocation_Option() {
		 return findElement(worklocation_option);
	 }
//Designation 	
 	public static WebElement Designation_Option() {
		 return findElement(designation_option);
	 }
//Business Unit 
 	public static WebElement BusinessUnit_Option() {
		 return findElement(businessunit_option);
	 }
//Service line
 	public static WebElement ServiceLine_Option() {
		 return findElement(serviceline_option);
	 }
//Team 	
 	public static WebElement Team_Option() {
		 return findElement(team_option);
	 }
//Hiring Manager 	
 	public static WebElement HiringManager_Option() {
		 return findElement(hiringmanager_option);
	 }
//Reporting Manager
 	public static WebElement ReportingManager_Option() {
		 return findElement(reportingmanager_option);
	 }
//Employment Type 	
 	public static WebElement EmploymentType_Option() {
		 return findElement(emptype_option);
	 } 	
//Source Type
 	public static WebElement SourceType_Option() {
		 return findElement(sourcetype_option);		
	 }
//Sub Source 
 	public static WebElement Subsource_option() {
 		return findElement(subsource_option);
 	}	
//Hire Type 	
 	public static WebElement HireType_Option() {
		 return findElement(hiretype_option);
	 }
//Rehire Option
  	public static WebElement Rehire_Option() {
  		return findElement(rehire_option);
 	}	
 	
}
