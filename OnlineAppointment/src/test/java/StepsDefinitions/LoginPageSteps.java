package StepsDefinitions;


import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Then;
import java.util.List;
import java.util.Map;

import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LoginPageSteps {
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	@Then("user redirects to Login Page")
	public void user_redirects_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    loginpage.getLoginPageTitle();
	}

	@Then("Please login to make appointment should be displayed")
	public void please_login_to_make_appointment_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    Assert.assertTrue(loginpage.isPlease_Login_To_Make_Appointment());
	}

	@Then("User Enters Username {string}")
	public void user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    loginpage.enterUserName(username);
	}

	@Then("User Enters Password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    loginpage.enterPassword(password);
	}

	@Then("User Click on Login Page")
	public void user_click_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    loginpage.ClickonLoginButton();
	}

	@Then("User Redirects to Appointment Page")
	public void user_redirects_to_appointment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
