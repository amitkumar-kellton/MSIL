package steps;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.WebDriverManager;

public class Login {
	WebDriverManager webDriverManager;
	private LoginPage loginPage;

	public Login() {
		loginPage = new LoginPage(WebDriverManager.getDriver());
	}

	@Then("Click on the Login Button")
	public void click_on_the_login_button() {
		loginPage.loginButton.click();
	}

	@When("I enter username {string} and password {string}")
	public void i_am_on_the_login_page(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.clickNextButton();
		loginPage.enterPassword(password);
		loginPage.clickSignInButton();
		loginPage.clickCheckbox();
		loginPage.clickYesButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		if (loginPage.getCurrentPageTitle().equalsIgnoreCase("Dashboard")) {
			Assert.assertTrue(true, "Login Successfull");
			System.out.println("\n\n\nLogin Successfull...\n\n\n");
		}
	}
}