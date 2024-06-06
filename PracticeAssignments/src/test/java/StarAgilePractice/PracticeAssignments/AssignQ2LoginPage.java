package StarAgilePractice.PracticeAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AssignQ2LoginPage {
	private WebDriver driver;
	private AssgnQ2 AssgnQ2;

	@BeforeClass
	public void setUp() {
		// Set the path for the ChromeDriver executable
		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe");

		// Initialize the WebDriver instance
		driver = new FirefoxDriver();

		// Open the login page
		driver.get("https://www.facebook.com/");

		// Initialize the LoginPage instance
		AssgnQ2 = new AssgnQ2(driver);
	}

	@Test
	public void testLogin() {
		// Perform login
		AssgnQ2.login("priyawaw@gmail.com", "priya@1990");

	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		if (driver != null) {
			driver.quit();
		}
	}
}
