package TC_Functions;



import com.github.javafaker.Faker;

import Objects.AddNewRequest_Object;
import Utls.Actions;

public class AddNewRequest_Function  extends Actions
{	
	 static Faker faker = new Faker();
	 
	
	static String first_name = faker.name().firstName().toLowerCase();
	static String last_name = faker.name().lastName().toLowerCase();	
	static String phn_num = faker.phoneNumber().phoneNumber();
	static String Current_addr = faker.address().fullAddress();
	static String Permanent_addr = faker.address().fullAddress();
	
	
  public static void AddNewRequest() throws Exception
  {
	
//	 Date StartDate = faker.date().future(10, TimeUnit.DAYS);
	 
//	 String Start_date = StartDate.toString();
	 String PRF_Number = faker.number().digits(7);
	  
	 
	 
	//Click Add New Request
	click(AddNewRequest_Object.AddNewReqButton());
	
	// Name and email	
	FillData(AddNewRequest_Object.FirstName(),first_name);
	FillData(AddNewRequest_Object.LastName(), last_name);
	FillData(AddNewRequest_Object.Email(), first_name+"@mailinator.com" );			
	
	// Phone Number
	FillData(AddNewRequest_Object.PhoneNum(),phn_num);
	
	//Gender
	click(AddNewRequest_Object.Gender());
	click(AddNewRequest_Object.Gender_Option());
	
	//work state
	click(AddNewRequest_Object.WorkState());
	wait(500);
	click(AddNewRequest_Object.WorkState_Option());
	
	//Work Location
	click(AddNewRequest_Object.WorkLocation());
	click(AddNewRequest_Object.WorkLocation_Option());
	
	//Current Address
	FillData(AddNewRequest_Object.CurrentAdd(), Current_addr);
	
	//Permanent Address
	FillData(AddNewRequest_Object.PermanentAdd(), Permanent_addr);
	
	//Scrolldown
	pageScrollDown_pixcel();
	
	//Designation
	click(AddNewRequest_Object.Designation());
	click(AddNewRequest_Object.Designation_Option());
	
	//Start Date
	removeReadOnly1(AddNewRequest_Object.StartDate());
	FillData(AddNewRequest_Object.StartDate(), "07/22/2020");
	click(AddNewRequest_Object.StartDate());
	
	//Business Unit
	click(AddNewRequest_Object.BusinessUnit());
	click(AddNewRequest_Object.BusinessUnit_Option());
	
	wait(500);
	
	//Servie Line
	click(AddNewRequest_Object.ServiceLine());
	click(AddNewRequest_Object.ServiceLine_Option());
	
	wait(300);
	
	//Team
	click(AddNewRequest_Object.Team());
	click(AddNewRequest_Object.Team_Option());
	
	//Hiring manager
	click(AddNewRequest_Object.HiringManager());
	click(AddNewRequest_Object.HiringManager_Option());
	
	//Reporting Manager 
	click(AddNewRequest_Object.ReportingManager());
	click(AddNewRequest_Object.ReportingManager_Option());
	
	//Employment Type
	click(AddNewRequest_Object.EmploymentType());
	click(AddNewRequest_Object.EmploymentType_Option());
	
	//scroll down
	pageScrollDown();

	//Offer Date 
	removeReadOnly1(AddNewRequest_Object.OfferDate());
	FillData(AddNewRequest_Object.OfferDate(), "09/21/2020");
	click(AddNewRequest_Object.OfferDate());
	
	//PRF Number
	FillData(AddNewRequest_Object.PRF_Number(), PRF_Number);
	
	//PRF Date
	removeReadOnly1(AddNewRequest_Object.PRF_Date());
	FillData(AddNewRequest_Object.PRF_Date(), "09/30/2020");
	click(AddNewRequest_Object.PRF_Date());
	
	//Source Date
	click(AddNewRequest_Object.SourceType());
	click(AddNewRequest_Object.SourceType_Option());
	
	wait(500);
	
	//Sub Source
	click(AddNewRequest_Object.SubSource());
	click(AddNewRequest_Object.Subsource_option());
	
	//Hire Type
	click(AddNewRequest_Object.HireType());
	click(AddNewRequest_Object.HireType_Option());
	
	//Upload Offer letter
	//click(AddNewRequest_Object.OfferLetter_Doc());
	Upload_doc(AddNewRequest_Object.OfferLetter_Doc(),"C:\\Users\\HEP-CBE-88\\Documents\\offer_letter_selenium.pdf");
	
	wait(1000);
	
	//Submit
	//click(AddNewRequest_Object.SubmitButton());
	
	
  
  }
	
	
}
