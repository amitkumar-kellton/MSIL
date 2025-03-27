package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Declaration;
import utilities.WebDriverManager;

public class CreateDeclaration {
	
	WebDriverManager webDriverManager;
	private Declaration declaration;
	String filePath = "C:\\Users\\amit.kumar\\eclipse-workspace\\MSIL\\src\\test\\resources\\logo.jpg";
	
	public CreateDeclaration() {
		declaration = new Declaration(WebDriverManager.getDriver());
	}
	
	@Given("I am on the Dashboard navigate to Declaration Page")
	public void i_am_on_the_dashboard() {
		declaration.clickDeclarationModule();
	}
	
	@When("I am on the Declaration Page")
	public void i_am_on_the_declarationPage() {
		declaration.clickAddDeclarationButton();
	}
	
	@And("I enter details in the declaration form")
	public void i_enter_details_in_the_declaration_form() {
		Boolean Published;
		declaration.enterTitle();
		declaration.enterDeclarationBody();
//		declaration.clickCheckBox1();
//		declaration.clickCheckBox2();
//		declaration.enterTextforCheckBox1();
//		declaration.enterTextforCheckBox2();
		declaration.enterTextforButtonLabel();
		declaration.enterTextforTextLabel();
		Published = true;
		if(Published) {
			declaration.clickStatusDropDown();
			declaration.selectDeclarationStatus(true);
		}
		declaration.clickSubmitButton();
	}
}
