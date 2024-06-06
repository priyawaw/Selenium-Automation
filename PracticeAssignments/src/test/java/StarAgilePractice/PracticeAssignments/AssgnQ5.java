package StarAgilePractice.PracticeAssignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class AssgnQ5 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot, new File("E:\\SeleniumAutomation\\Screen.png"));
		System.out.println("Screenshot is captured");
		driver.close();

	}

}
