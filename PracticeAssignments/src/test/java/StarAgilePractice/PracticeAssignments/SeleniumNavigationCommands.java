package StarAgilePractice.PracticeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver", "E:\\SeleniumAutomation\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();

		// driver.close(); //close current browser
		driver.quit(); // close all browser sessions
	}
}
