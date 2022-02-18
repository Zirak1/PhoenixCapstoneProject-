package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObj extends Base {

	public TablestPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Tablets")
	private WebElement tablets;
	@FindBy(xpath = "//h2[text()='Tablets']")
	private WebElement printTextTablets;
	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement printSamsungGalaxTab10;
	@FindBy(xpath = "//p[@class='price']")
	private WebElement printPriceSamsungGalaxTab10;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCartButtonSamsungGalaxTab10;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement wishLisButtonSamsungGalaxTab10;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareButtonSamsungGalaxTab10;
	@FindBy(xpath = "//div[text()='Showing 1 to 1 of 1 (1 Pages)']")
	private WebElement getTextPageSamsungGalaxTab10;

}
