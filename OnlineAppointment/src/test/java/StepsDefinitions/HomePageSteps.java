package StepsDefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	private static String title;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	@Given("user is on Home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver().get("https://katalon-demo-cura.herokuapp.com");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		title = homePage.getHomePageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user clicks on Make Appointment Button")
	public void user_clicks_on_make_appointment_button() {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.ClickonMakeAppointmentButton();
	}

	

}
