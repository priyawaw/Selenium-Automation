package StarAgilePractice.PracticeAssignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssgnQ2 {

	private WebDriver driver;

	// Constructor
	public AssgnQ2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Web elements
	@FindBy(id = "email")
	private WebElement usernameField;

	@FindBy(name = "pass")
	private WebElement passwordField;

	@FindBy(name = "login")
	private WebElement loginButton;

	// Actions
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
		System.out.println("Facebook login succefully done");
	}
}