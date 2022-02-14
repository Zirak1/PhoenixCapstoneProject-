package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObj extends Base{
	
	public SoftwarePageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Software")   //click
	private WebElement software;
	@FindBy(xpath="//h2[text()='Software']")
	private WebElement printTextsoftware;   //text
}
