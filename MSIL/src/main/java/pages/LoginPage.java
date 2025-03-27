package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "i0116")
	private WebElement usernameField;

	@FindBy(id = "i0118")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='idSIButton9']")
	private WebElement nextButton;

	@FindBy(id = "idSIButton9")
	private WebElement signInButton;

	@FindBy(id = "idSIButton9")
	private WebElement yesButton;

	@FindBy(id = "KmsiCheckboxField")
	private WebElement checkbox;

	@FindBy(xpath = "//p[contains(text(), 'Login To Portal')]")
	public WebElement loginButton;

	@FindBy(id = "current_page_title")
	public WebElement currentPageTitle;

	public void enterUsername(String username) {
		sendKeys(usernameField, username);
	}

	public void enterPassword(String password) {
		sendKeys(passwordField, password);
	}

	public void clickNextButton() {
		click(nextButton);
	}

	public void clickSignInButton() {
		click(signInButton);
	}

	public void clickCheckbox() {
		click(checkbox);
	}

	public void clickYesButton() {
		click(yesButton);
	}

	public void clickLoginButton() {
		click(loginButton);
	}

	public String getCurrentPageTitle() {
		return getText(currentPageTitle);
	}

}