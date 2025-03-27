package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message extends BasePage {

	public Message(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@aria-label='Message']")
	private WebElement messageModule;

	@FindBy(xpath = "//button[@type='button']/p[contains(text(), 'Add Message')]")
	private WebElement addMessageButton;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement messageTitle;

	@FindBy(xpath = "//div[@class='ck-blurred ck ck-content ck-editor__editable ck-rounded-corners ck-editor__editable_inline']")
	private WebElement messageBody;

	@FindBy(xpath = "//input[@accept='.jpg, .jpeg']")
	private WebElement uploadImage;

	@FindBy(xpath = "(//input[@type='file'])[2]")
	private WebElement uploadDocument;

	@FindBy(xpath = "//li[contains(text(), 'Published')]")
	private WebElement selectPublished;

	@FindBy(xpath = "//li[contains(text(), 'Draft')]")
	private WebElement selectDraft;

	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl  css-10budqg']")
	private WebElement messageStatusDropdown;

	@FindBy(xpath = "//button[contains(text(), 'Submit')]")
	private WebElement submitButton;

	public void clickMessageModule() {
		click(messageModule);
	}

	public void clickAddMessageButton() {
		click(addMessageButton);
	}

	public void enterTitle(String titleText) {
		sendKeys(messageTitle, titleText);
	}

	public void enterBody() {
//		click(messageBody);
		messageBody.sendKeys("Message Body");
//		sendKeys(messageBody, bodyText);
	}

	public void uploadImage(String imagePath) {
		sendKeys(uploadImage, imagePath);
	}

	public void uploadDocument(String imagePath) {
		sendKeys(uploadDocument, imagePath);
	}

	public void clickMessageStatusDropdown() {
		click(messageStatusDropdown);
	}

	public void selectPublished() {
		click(selectPublished);
	}

	public void selectDraft() {
		click(selectDraft);
	}

	public void clickSubmitButton() {
		click(submitButton);
	}

}