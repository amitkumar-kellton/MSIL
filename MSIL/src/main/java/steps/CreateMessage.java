package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Message;
import utilities.WebDriverManager;

public class CreateMessage {

	WebDriverManager webDriverManager;
	private Message message;
	String filePath = System.getProperty("user.dir") + "/src/test/resources/logo.jpg";

	public CreateMessage() {
		message = new Message(WebDriverManager.getDriver());
	}

	@Then("Navigate to Message Page")
	public void navigate_to_Message_Page() {
		message.clickMessageModule();
	}

	@Given("I am on the Message Page")
	public void i_am_on_the_messagePage() {
		message.clickAddMessageButton();
	}

	@And("I enter details in the message form for title {string} and messagebody and status {string}")
	public void i_enter_details_in_the_message_form(String messageTitle, String Published) {
		message.enterTitle(messageTitle);
		message.enterBody();
		message.uploadImage(filePath);
		message.uploadDocument(filePath);
		message.clickMessageStatusDropdown();
		if (Published.equalsIgnoreCase("Published")) {
			message.selectPublished();
		} else {
			message.selectDraft();
		}
		message.clickSubmitButton();
	}
}