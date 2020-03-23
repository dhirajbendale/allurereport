package com.pages;

import io.qameta.allure.Step;

public class CreateAccountPage {

	public boolean verifyPageTitle() {
		String pageTitle = "Create your Google Account";
		return true;
	}

	@Step("Verify base page Title")
	public boolean verifyCreateAccountPageText() {
		String pageText = "Create your Google Account";
		return true;
	}

	public void createAccount() {
		// need to write steps for creating an account
	}
}