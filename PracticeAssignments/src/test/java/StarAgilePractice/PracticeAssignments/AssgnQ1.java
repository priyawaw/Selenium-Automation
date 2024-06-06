package StarAgilePractice.PracticeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssgnQ1 {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("priyawaw@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("priya@1990");
		WebElement link = driver.findElement(By.name("login"));
		System.out.println(link);
		// Click on the link
		link.click();
		// Close the browser
		driver.close();
	}
}
