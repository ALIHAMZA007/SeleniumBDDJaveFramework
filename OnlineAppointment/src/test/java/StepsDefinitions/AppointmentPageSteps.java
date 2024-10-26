package StepsDefinitions;

import java.util.List;
import java.util.Map;

import com.pages.AppointmentPage;
import com.pages.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppointmentPageSteps {
      private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
      private AppointmentPage appointmentpage;
      @Given("user has already logged in to application")
      public void user_has_already_logged_in_to_application(DataTable dataTable) {
    	  List<Map<String, String>> credList = dataTable.asMaps();
  		  String userName = credList.get(0).get("username");
  		  String password = credList.get(0).get("password");

  		  DriverFactory.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
  		appointmentpage = loginpage.doLogin(userName, password);
    }

     @Given("User is on Make Appointment Page")
     public void user_is_on_make_appointment_page() {
    // Write code here that turns the phrase above into concrete actions
       appointmentpage.getAppointmentPageTitle();
    }

     @When("Make Appointment should be displayed")
     public void make_appointment_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
       Assert.assertTrue(appointmentpage.isMake_Appointment());
    }

    @When("User Select Visit Date")
    public void user_select_visit_date() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
      appointmentpage.selectDate();
   }

   @When("User Enter Comments {string}")
    public void user_enter_comments(String Com) {
    // Write code here that turns the phrase above into concrete actions
       appointmentpage.EnterComments(Com);
    }

    @When("User Clicks on Book Appointment Button")
    public void user_clicks_on_book_appointment_button() {
    // Write code here that turns the phrase above into concrete actions
      appointmentpage.ClickonBookAppointmentButton();
    }

    @Then("message Appointment Confirmation should be displayed")
    public void message_appointment_confirmation_should_be_displayed() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
      Thread.sleep(3000);
      Assert.assertTrue(appointmentpage.isAppointment_Confirmation());
    }

    @Then("Second message Please be informed that your appointment has been booked as following: should be displayed")
    public void second_message_please_be_informed_that_your_appointment_has_been_booked_as_following_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
      Assert.assertTrue(appointmentpage.isPlease_be_informed());
    }

    @Then("Go to Homepage Button should be displayed")
    public void go_to_homepage_button_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
      Assert.assertTrue(appointmentpage.isGo_To_HomePage());
   }


}
