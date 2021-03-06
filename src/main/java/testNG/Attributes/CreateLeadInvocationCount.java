package testNG.Attributes;

import org.testng.annotations.Test;

import wrappers.LeafTapswrappers;

public class CreateLeadInvocationCount extends LeafTapswrappers {
	/*
	 * Invocation Count is to iterate the test for 'n' times. In the below case
	 * it iterates for 7 times.
	 */
	@Test(invocationCount = 7)
	public void createLead() {
		// Click on Create Lead
		clickByLink("Create Lead");
		// Enter Company Name
		enterById("createLeadForm_companyName", "Cognizant Tech.");
		// Enter First Name
		enterById("createLeadForm_firstName", "Shree");
		// Enter Last Name
		enterById("createLeadForm_lastName", "M");
		// Enter Parent Id
		enterById("createLeadForm_parentPartyId", "17865");
		// Select Source Drop Down
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");
		// Select MArketing Campaign Drop down
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");
		// Enter First name Local
		enterById("createLeadForm_firstNameLocal", "First Name Local");
		// Enter Last Name Local
		enterById("createLeadForm_lastNameLocal", "Last Name Local");
		// Enter Salutation
		enterById("createLeadForm_personalTitle", "Mr.");
		// Enter Title
		enterById("createLeadForm_generalProfTitle", "Er.");
		// Place Holder for D.O.B
		// Enter Department
		enterById("createLeadForm_departmentName", "My Dept");
		// Enter Annual Revenue
		enterById("createLeadForm_annualRevenue", "120000");
		// Select Industry
		selectVisibileTextById("createLeadForm_currencyUomId", "INR - Indian Rupee");
		// Click Create Lead Button
		clickByClassName("smallSubmit");
		System.out.println("CREATE LEAD USING WRAPPERS: TEST COMPLETED SUCCESSFULLY");

	}
}
