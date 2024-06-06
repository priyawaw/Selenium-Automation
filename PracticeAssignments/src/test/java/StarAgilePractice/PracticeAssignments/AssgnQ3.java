package StarAgilePractice.PracticeAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssgnQ3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// Step#2- Launching URL
		driver.get("https://demoqa.com/select-menu");

		// Maximizing window
		driver.manage().window().maximize();

		// Step#3- Selecting the dropdown element by locating its id
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

		// Step#4- Printing the options of the dropdown
		// Get list of web elements
		List<WebElement> lst = select.getOptions();

		// Looping through the options and printing dropdown options
		System.out.println("The dropdown options are:");
		for (WebElement options : lst)
			System.out.println(options.getText());

		driver.quit();
	}

}
