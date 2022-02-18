package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObj extends Base {
	public PhonesPDAsPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Phones & PDAs")
	private WebElement phonesAndPDAs;
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement prinTextphonesAndPDAs;
	@FindBy(linkText = "HTC Touch HD")
	private WebElement textHTCTouch;
	@FindBy(xpath = "//p[contains(text(),'HTC Touch')]")
	private WebElement discriptionHTCTouch;
	@FindBy(xpath = "(//p[@class='price'])[1]")
	private WebElement priceHTCTouch;
	@FindBy(xpath = "(//div[@class='button-group'])[1]")
	private WebElement addToCartHTCTouch;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement wishListCartHTCTouch;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProdCartHTCTouch;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement textIphone;
	@FindBy(xpath = "//p[contains(text(),'iPhone is a')]")
	private WebElement discriptionIphone;
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement printPriceIphone;
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[4]")
	private WebElement addToCarIphone;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement wishListIphone;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareToIphone;
	@FindBy(linkText = "Palm Treo Pro")
	private WebElement textPalmTreoPro;
	@FindBy(xpath = "//p[contains(text(),'Redefine your')]")
	private WebElement descriptionPalmTreoPro;
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement pricePalmTreoPro;
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[5]")
	private WebElement addToCartPalmTreoPro;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement wishListPalmTreoPro;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement compareToPalmTreoPro;
	@FindBy(xpath = "//div[@class='col-sm-6 text-right']")
	private WebElement printTextToPalmTreoPro;

}
