package com.pages;

import io.qameta.allure.Step;

public class BasePage {

	@Step("Clicking on Sign in button")
	public void clickSignInBtn() {
		System.out.println("clicking on sign in button");

	}

	public void clickImagesLink() {
		// It should have a logic to click on images link
		// And it should navigate to google images page
	}

	@Step("Get page Title")
	public String getPageTitle(String demo) {
		return "Page title not matching";
	}

	@Step("Verify base page Title")
	public boolean verifyBasePageTitle() {
		return true;
	}
}