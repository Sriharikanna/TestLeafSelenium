package testNG;

import org.testng.annotations.Test;

import wrappers.LeafTapswrappers;

public class EditLeads extends LeafTapswrappers {
	@Test (dependsOnMethods = "testNG.CreateLead.createLead")
	public void editLeads() {
		
		// Click on Leads Link
		clickByLink("Leads");
		// Click on Find Leads Link
		clickByLink("Find Leads");
		// Enter First Name
		enterByXpath("//span[text()='Name and ID']/following::input[@name='firstName']", "Shree");
		// Click on find Leads button
		clickByXpath("//button[text()='Find Leads']");
		// Click on the First Resulting Lead
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		// Verify the Title of the Page
		verifyTitle("View Lead | opentaps CRM");
		// Click on Edit Link
		clickByLink("Edit");
		// Enter the Company Name - Edit the Company Name
		enterById("updateLeadForm_companyName", "CTS");
		// Click on Update
		clickByXpath("//input[@value='Update']");
		// Verify the New Company Name
		verifyTextById("viewLead_companyName_sp", "CTS");
		System.out.println("****************Editing work is done****************");
		
		
	}
}
