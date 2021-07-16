package com.orangeHRM.Testcases;

import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.orangeHRM.Testcases.Custom_Listeners.class)
public class OrangeHRM_login extends Custom_Listeners implements ITestListener {

	@BeforeMethod
	public void setup() {
		Golden_template.openbrowser("chrome-pom");
		Golden_template.getURL("https://opensource-demo.orangehrmlive.com", 10, 10);
	}

	@Test
	public void login() {
		Golden_template.ValidatePageTitle("sam");
		// assertEquals(false, true);
	}

	@AfterMethod
	public void teardown() {
		Golden_template.closebrowser();
	}

}
