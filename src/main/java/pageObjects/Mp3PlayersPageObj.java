package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObj extends Base{
	public Mp3PlayersPageObj() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "MP3 Players")//click	
	private WebElement MP3Players; 
	@FindBy(linkText = "test 11 (0)") //click
	private WebElement dropdowntest11;
	@FindBy(xpath="//h2[text()='test 11']")
	private WebElement printTextTest11; //printText
	@FindBy(xpath="//p[contains(text(),'There are no')]") //print text , repeated
	private WebElement printTextThereAreNoTest;
	@FindBy(linkText = "test 12 (0)") //click
	private WebElement dropdowntest12;
	@FindBy(xpath="//h2[text()='test 12']")
	private WebElement printTextTest12; //printText
	@FindBy(linkText = "test 15 (0)") //click
	private WebElement dropdowntest15;
	@FindBy(xpath="//h2[text()='test 15']")
	private WebElement printTextTest15; //printText
	@FindBy(linkText = "test 16 (0)") //click
	private WebElement dropdowntest16;
	@FindBy(xpath="//h2[text()='test 16']")
	private WebElement printTextTest16; //printText
	@FindBy(linkText = "test 17 (0)") //click
	private WebElement dropdowntest17;
	@FindBy(xpath="//h2[text()='test 17']")
	private WebElement printTextTest17; //printText
	@FindBy(linkText = "test 18 (0)") //click
	private WebElement dropdowntest18;
	@FindBy(xpath="//h2[text()='test 18']")
	private WebElement printTextTest18; //printText
	@FindBy(linkText = "test 19 (0)") //click
	private WebElement dropdowntest19;
	@FindBy(xpath="//h2[text()='test 19']")
	private WebElement printTextTest19; //printText
	@FindBy(linkText = "test 20 (0)") //click
	private WebElement dropdowntest20;
	@FindBy(xpath="//h2[text()='test 20']")
	private WebElement printTextTest20; //printText
	@FindBy(linkText = "test 21 (0)") //click
	private WebElement dropdowntest21;
	@FindBy(xpath="//h2[text()='test 21']")
	private WebElement printTextTest21; //printText
	@FindBy(linkText = "test 22 (0)") //click
	private WebElement dropdowntest22;
	@FindBy(xpath="//h2[text()='test 22']")
	private WebElement printTextTest22; //printText
	@FindBy(linkText = "test 23 (0)") //click
	private WebElement dropdowntest23;
	@FindBy(xpath="//h2[text()='test 23']")
	private WebElement printTextTest23; //printText
	@FindBy(linkText = "test 24 (0)") //click
	private WebElement dropdowntest24;
	@FindBy(xpath="//h2[text()='test 24']")
	private WebElement printTextTest24; //printText
	@FindBy(linkText = "test 4 (0)") //click
	private WebElement dropdowntest4;
	@FindBy(xpath="//h2[text()='test 4']")
	private WebElement printTextTest4; //printText
	@FindBy(linkText = "test 5 (0)") //click
	private WebElement dropdowntest5;
	@FindBy(xpath="//h2[text()='test 5']")
	private WebElement printTextTest5; //printText
	@FindBy(linkText = "test 6 (0)") //click
	private WebElement dropdowntest6;
	@FindBy(xpath="//h2[text()='test 6']")
	private WebElement printTextTest6; //printText
	@FindBy(linkText = "test 7 (0)") //click
	private WebElement dropdowntest7;
	@FindBy(xpath="//h2[text()='test 7']")
	private WebElement printTextTest7; //printText
	@FindBy(linkText = "test 8 (0)") //click
	private WebElement dropdowntest8;
	@FindBy(xpath="//h2[text()='test 8']")
	private WebElement printTextTest8; //printText
	@FindBy(linkText = "test 9 (0)") //click
	private WebElement dropdowntest9;
	@FindBy(xpath="//h2[text()='test 9']")
	private WebElement printTextTest9; //printText
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	






















