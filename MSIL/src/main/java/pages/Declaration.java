package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Declaration extends BasePage {

	public Declaration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@aria-label='Declaration']")
	private WebElement declarationModule;

	@FindBy(xpath = "//button[@type='button']/p[contains(text(), 'Add Declaration')]")
	private WebElement addDeclarationBtn;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement declarationTitleTextBox;

	@FindBy(xpath = "//div[@id='root']/div[2]/div[3]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/p")
	private WebElement declarationBodyTextBox;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkBox1;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBox2;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement textboxCB1;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement textboxCB2;

	@FindBy(xpath = "//input[@name='buttonLabel']")
	private WebElement buttonLabelTextBox;

	@FindBy(xpath = "//input[@name='textBoxLabel']")
	private WebElement textBoxLabelTextBox;

	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl  css-10budqg']")
	private WebElement statusDropdown;

	@FindBy(xpath = "//li[contains(text(), 'Published')]")
	private WebElement statusPublished;

	@FindBy(xpath = "//li[contains(text(), 'Draft')]")
	private WebElement statusDraft;

	@FindBy(xpath = "//button[contains(text(), 'Submit')]")
	private WebElement submitButton;
	
	public void clickDeclarationModule() {
		click(declarationModule);
	}

	public void clickAddDeclarationButton() {
		click(addDeclarationBtn);
	}

	public void enterTitle() {
		sendKeys(declarationTitleTextBox, "Declaration Title 26-March-2024");
	}

	public void enterDeclarationBody() {
		sendKeys(declarationBodyTextBox, "Declaration Body 26-March-2024");
	}

	public void clickCheckBox1() {
		click(checkBox1);
	}
	
	public void clickCheckBox2() {
		click(checkBox2);
	}
	
	public void enterTextforCheckBox1() {
		sendKeys(textboxCB1, "CheckBox 1");
	}
	
	public void enterTextforCheckBox2() {
		sendKeys(textboxCB2, "CheckBox 2");
	}
	
	public void enterTextforButtonLabel() {
		sendKeys(buttonLabelTextBox, "Button Label");
	}
	
	public void enterTextforTextLabel() {
		sendKeys(textBoxLabelTextBox, "TextBox Label");
	}
	
	public void clickStatusDropDown() {
		click(statusDropdown);
	}
	
	public void selectDeclarationStatus(Boolean Published) {
		if(Published) {
			click(statusPublished);
		} else {
			click(statusDraft);
		}
	}
	
	public void clickSubmitButton() {
		click(submitButton);
	}

}