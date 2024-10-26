package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By Please_Login_to_make_appointment = By.xpath("//*[@id=\"login\"]/div/div/div[1]/p");
	private By Username = By.id("txt-username");
	private By Password = By.id("txt-password");
	private By LoginBtton = By.id("btn-login");
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean isPlease_Login_To_Make_Appointment()
	{
		return driver.findElement(Please_Login_to_make_appointment).isDisplayed();
	}
	public void enterUserName(String username) {
		driver.findElement(Username).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}
	public void ClickonLoginButton()
	{
		driver.findElement(LoginBtton).click();
	}
	public AppointmentPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(Username).sendKeys(un);
		driver.findElement(Password).sendKeys(pwd);
		driver.findElement(LoginBtton).click();
		return new AppointmentPage(driver);
	}
	
}
