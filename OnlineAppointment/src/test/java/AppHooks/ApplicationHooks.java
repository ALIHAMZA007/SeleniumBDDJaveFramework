package AppHooks;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty()
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser()
		{
			String BrowserName = prop.getProperty("browser");
			driverFactory = new DriverFactory();
			driver = driverFactory.init_driver(BrowserName);
		}
	@After(order = 0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario sc)
		{
			if(sc.isFailed())
			{
				String screenshotName = sc.getName().replaceAll("","_");
			    byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			    sc.attach(sourcePath,"image/png", screenshotName);
			}
		}
	

}
