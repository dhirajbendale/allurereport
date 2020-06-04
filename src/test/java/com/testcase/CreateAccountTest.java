package com.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.BasePage;
import com.pages.CreateAccountPage;
import com.pages.SignInPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

// Add test case comments
@Epic("Allure examples")
@Feature("April-Sprint")
public class CreateAccountTest {

	private SignInPage signInPage = new SignInPage();
	private BasePage basePage = new BasePage();
	private CreateAccountPage createAccountPage = new CreateAccountPage();

	@BeforeClass
	public void setUp() {
	}

	@Severity(SeverityLevel.BLOCKER)
	@Description("Create account test")
	@Story("Test create account verify")
	@Test(description = "Create account test")
	@TmsLink("test-1")
	public void verifyCreateAnAccountPage() {
		System.out.println("Create An Account page test...");
		basePage.clickSignInBtn();
		basePage.getPageTitle("demo");
		basePage.verifyBasePageTitle();
		signInPage.clickonCreateAnAccount();
		Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");
		Assert.assertTrue(createAccountPage.verifyCreateAccountPageText(), "Page text not matching");
	}

	@Severity(SeverityLevel.NORMAL)
    @Description("Create account test")
	@Story("Test create account test1")
	@Test
	@TmsLink("test-2")
	public void createAccountExample1() {
	}

	@Story("Test create account test2")
	@Test(dependsOnMethods = "createAccountExample1")
	public void createAccountExample2() {
	}

}
