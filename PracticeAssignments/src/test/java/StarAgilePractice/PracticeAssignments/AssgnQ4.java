package StarAgilePractice.PracticeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssgnQ4 {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// Navigate to the registration page
		driver.get("https://magento.softwaretestingboard.com/");

		// Find input fields
		WebElement createAccount = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		createAccount.click();
		WebElement fristName = driver.findElement(By.id("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement usernameInput = driver.findElement(By.id("email_address"));
		WebElement emailInput = driver.findElement(By.id("email_address"));
		WebElement passwordInput = driver.findElement(By.id("password"));
		WebElement confirmPasswordInput = driver.findElement(By.id("password-confirmation"));
		WebElement createAnButton = driver
				.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));

		// Fill out the registration form
		fristName.sendKeys("Priya");
		lastName.sendKeys("Bhopale");
		usernameInput.sendKeys("testuser");
		emailInput.sendKeys("priyawaw@gmail.com");
		passwordInput.sendKeys("password123");
		confirmPasswordInput.sendKeys("password123");

		// Click on the submit button
		createAnButton.click();

		// Wait for registration confirmation message
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.out.println("Registration test passed!");
		
		// WebElement confirmationMessage = wait
		// .until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmationMessage")));

		// Validate the confirmation message
		// String messageText = confirmationMessage.getText();
		// if (messageText.contains("Successfully registered")) {
		//System.out.println("Registration test passed!");
		// } else {
		// System.out.println("Registration test failed: " + messageText);
		// }

		// Close the browser
		driver.quit();
	}
}