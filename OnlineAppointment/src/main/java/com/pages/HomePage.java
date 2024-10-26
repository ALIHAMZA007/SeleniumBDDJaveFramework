package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private By MakeAppointmentButton = By.id("btn-make-appointment");
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	public void ClickonMakeAppointmentButton()
	{
		driver.findElement(MakeAppointmentButton).click();
	}
}
