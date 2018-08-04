package Excel;


import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdMethods.SeMethods;


public class Create extends SeMethods{
	@BeforeClass
	public void excelSheet() {
		/*excelFileName="TC001";*/
	}

	@Test( dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String email, String phNo)
	{	
		click(locateElement("link", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phNo);
		click(locateElement("name", "submitButton"));
	}
	

	
}