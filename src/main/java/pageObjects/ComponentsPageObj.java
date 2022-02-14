package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObj extends Base {

	public ComponentsPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Components']") // .click
	private WebElement componentsDropDown;
	@FindBy(xpath = "//a[text()='Mice and Trackballs (0)']") // .click!
	private WebElement miceAndTrackballs;
	@FindBy(xpath = "//h2[text()='Mice and Trackballs']") // .getText
	private WebElement textMiceAndTrackballs;
	@FindBy(xpath = "//li//li//a[contains(text(),'Monitors')]")
	private WebElement monitors; // .click
	@FindBy(xpath = "//h2[text()='Monitors']")
	private WebElement textMonitors; // .getText
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement textRefineSearch; // .getText
	@FindBy(xpath = "//div//a[contains(text(), 'test 1 ')]")
	private WebElement test1RefineSearch; // .click
	@FindBy(xpath = "//div//a[contains(text(), 'test 2 ')]")
	private WebElement test2RefineSearch; // .click

	@FindBy(xpath = "//a[text()='Apple Cinema 30']")
	private WebElement AppleCinema30; // .click
	@FindBy(xpath = "//p[contains(text(),'The 30-inch Apple')]")
	private WebElement discriptionAppleCinema30; // .getText
	@FindBy(xpath = "//span[@class='price-new']")
	private WebElement priceNewAppleCinema30; // .getText
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement priceOldAppleCinema30; // .getText
	@FindBy(xpath = "//span[text()='Ex Tax: $90.00']")
	private WebElement taxAppleCinema30; // .getText
	@FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
	private WebElement addToCartAppleCinema30; // .click
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement wishListAppleCinema30; // .click
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[1]")
	private WebElement compareAppleCinema30; // .click

	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement getTextASamsungSyn; // .getText
	@FindBy(xpath = "//p[contains(text(),'Imagine the')]")
	private WebElement discriptiontSamsungSyn; // .getText
	@FindBy(xpath = "//p[contains(text(),'242')]")
	private WebElement priceSamsungSyn; // .getText
	@FindBy(xpath = "//span[contains(text(),'Ex Tax: $200.00')]")
	private WebElement taxSamsungSyn; // .getText
	@FindBy(xpath = "(//*[text()='Add to Cart'])[2]")
	private WebElement addCartSamsungSyn; // .click
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[3]")
	private WebElement wishListCartSamsungSyn; // .click
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[2]")
	private WebElement compareCartSamsungSyn; // .click
	@FindBy(xpath = "//div[text()='Showing 1 to 2 of 2 (1 Pages)']")
	private WebElement textPageCartSamsungSyn; // .getText
	@FindBy(linkText = "Printers (0)")
	private WebElement printers; // .click
	@FindBy(xpath = "//h2[text()='Printers']")
	private WebElement printTextprinters; // .getText
	@FindBy(linkText = "Scanners (0)")
	private WebElement clickScanners; // .click
	@FindBy(xpath = "//h2[text()='Scanners']")
	private WebElement printTextScanners; // .getText
	@FindBy(linkText = "Web Cameras (0)")
	private WebElement clickWebCameras; // .click
	@FindBy(xpath = "//h2[text()='Web Cameras']")
	private WebElement printTextWebCameras; // .getText

}
