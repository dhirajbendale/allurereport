package com.pages;

import io.qameta.allure.Step;

public class SignInPage {


	

	public void clickonCreateAnAccount() {

	}
	
//	public String getSignInPageTitle() {
//		return pageTitle;
//	}
//
//	public boolean verifySignInPageTitle() {
//		String expectedTitle = "Sign in - Google Accounts";
//		return getSignInPageTitle().contains(expectedTitle);
//	}
//
//	public boolean verifySignInPageText() {
//
//		
//		String conpHeaderText = text1 + pageSubText;
//		String expectedPageText = "Sign in with your Google Account";
//		return conpHeaderText.equalsIgnoreCase(expectedPageText);
//	}
//
//
//	@Step("Verify sign with uname {0 and password {1}")
//	public boolean verifySignIn(String uname, String pwd) {
//		enterUserName(uname);
//		enterPassword(pwd);
//		clickOnSignIn();
//		return getErrorMessage().contains("incorrect");
//	}
//
//	@Step("Enter username {0}")
//	public void enterUserName(String userName) {
//		WebElement emailTxtBox = driver.findElement(emailTextBox);
//		if (emailTxtBox.isDisplayed())
//			emailTxtBox.sendKeys(userName);
//	}
//
//	@Step("Enter password {0}")
//	public void enterPassword(String password) {
//		WebElement passwordTxtBox = driver.findElement(passwordTextBox);
//		if (passwordTxtBox.isDisplayed())
//			passwordTxtBox.sendKeys(password);
//	}
//
//	public void clickNextBtn() {
//		WebElement nxtBtn = driver.findElement(nextBtn);
//		nxtBtn.click();
//	}
//
//	public void clickOnSignIn() {
//		WebElement signInBtn = driver.findElement(loginBtn);
//		if (signInBtn.isDisplayed())
//			signInBtn.click();
//	}
//
//	public String getErrorMessage() {
//		String strErrorMsg = null;
//		WebElement errorMsg = driver.findElement(errorMsgTxt);
//		if (errorMsg.isDisplayed() && errorMsg.isEnabled())
//			strErrorMsg = errorMsg.getText();
//		return strErrorMsg;
//	}
}