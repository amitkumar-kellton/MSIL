package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.WebDriverManager;

public class Connection {
	String BASE_URL = "https://msil-uat.kellton.net";

	@Given("Open the Browser and navigate to the URL")
	public void initializeConnection() {
		WebDriverManager.getDriver().manage().window().maximize();
		WebDriverManager.getDriver().get(BASE_URL);
	}

	@Then("Close the browser")
	public void close_the_browser() {
		WebDriverManager.quitDriver();
	}

	@Then("wait for {int} seconds")
	public void waitForNextStep(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

}
