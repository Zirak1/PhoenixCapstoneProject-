package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObj extends Base{
	public PhonesPDAsPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Phones & PDAs")   //click
	private WebElement phonesAndPDAs;    //click
	@FindBy(xpath="//h2[text()='Phones & PDAs']")
	private WebElement prinTextphonesAndPDAs;   //text
	@FindBy(linkText = "HTC Touch HD")   //click
	private WebElement textHTCTouch; //click
	@FindBy(xpath="//p[contains(text(),'HTC Touch')]")
	private WebElement discriptionHTCTouch;   //text
	@FindBy(xpath="(//p[@class='price'])[1]")
	private WebElement priceHTCTouch;   //text
	@FindBy(xpath="(//div[@class='button-group'])[1]")
	private WebElement addToCartHTCTouch;   //click
	@FindBy(xpath="(//i[@class='fa fa-heart'])[2]")
	private WebElement wishListCartHTCTouch;   //click
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProdCartHTCTouch;   //click
	@FindBy(xpath="//a[text()='iPhone']")
	private WebElement textIphone;   //click
	@FindBy(xpath="//p[contains(text(),'iPhone is a')]")
	private WebElement discriptionIphone;   //text
	@FindBy(xpath="(//p[@class='price'])[2]")
	private WebElement printPriceIphone;   //text
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement addToCarIphone;   //click
	@FindBy(xpath="(//i[@class='fa fa-heart'])[3]")
	private WebElement wishListIphone;   //click
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareToIphone;   //click
	@FindBy(linkText = "Palm Treo Pro")
	private WebElement textPalmTreoPro; //click
	@FindBy(xpath="//p[contains(text(),'Redefine your')]") //text
	private WebElement descriptionPalmTreoPro;
	@FindBy(xpath="(//p[@class='price'])[3]") //text
	private WebElement pricePalmTreoPro;
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[5]") //click
	private WebElement addToCartPalmTreoPro;
	@FindBy(xpath="(//i[@class='fa fa-heart'])[4]")  //click
	private WebElement wishListPalmTreoPro;
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[3]") //click
	private WebElement compareToPalmTreoPro;   
	@FindBy(xpath="//div[@class='col-sm-6 text-right']")//getText
	private WebElement printTextToPalmTreoPro;   
	
	
	
}
