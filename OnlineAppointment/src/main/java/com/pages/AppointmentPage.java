package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {
	private WebDriver driver;
	private By VisitDate = By.id("txt_visit_date");
	private By DateSelect = By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[5]");
	private By Comments = By.id("txt_comment");
	private By Book_Appointment_Button = By.id("btn-book-appointment");
	private By Appointment_Confirmation = By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2");
	private By Please_be_informed = By.xpath("//*[@id=\"summary\"]/div/div/div[1]/p");
	private By Go_To_HomePage = By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a");
	private By Make_Appointment = By.xpath("//*[@id=\"appointment\"]/div/div/div/h2");

	public AppointmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAppointmentPageTitle() {
		return driver.getTitle();
	}
	public void selectDate() throws InterruptedException
	{
		driver.findElement(VisitDate).click();
		Thread.sleep(3000);
		driver.findElement(DateSelect).click();
	}
	public void EnterComments(String comments) {
		driver.findElement(Comments).sendKeys(comments);
	}
    public void ClickonBookAppointmentButton()
    {
    	driver.findElement(Book_Appointment_Button).click();
    }
    public boolean isAppointment_Confirmation()
    {
    	return driver.findElement(Appointment_Confirmation).isDisplayed();
    }
    public boolean isPlease_be_informed()
    {
    	return driver.findElement(Please_be_informed).isDisplayed();
    }
    public boolean isGo_To_HomePage()
    {
    	return driver.findElement(Go_To_HomePage).isDisplayed();
    }
    public boolean isMake_Appointment()
    {
    	return driver.findElement(Make_Appointment).isDisplayed();
    }
    
}
