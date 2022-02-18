package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopsPageObj extends Base {

	public DesktopsPageObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textTESTENVIRONMENT;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop;
	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement pc;
	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement mac;
	@FindBy(xpath = "//a[text()='iMac']")
	private WebElement iMac;
	@FindBy(xpath = "//p[contains(text(),'Just when you')]")
	private WebElement descriptionIMac;
	@FindBy(xpath = "//p[contains(text(),'$122')]")
	private WebElement iMacPrice;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement iMacAddCart;
	@FindBy(xpath = "//button//i[@class='fa fa-heart']")
	private WebElement iMacWishList;
	@FindBy(xpath = "//button//i[@class='fa fa-exchange']")
	private WebElement iMacExchange;
	@FindBy(xpath = "//div[text()='Showing 1 to 1 of 1 (1 Pages)']")
	private WebElement iMacPageText;
	@FindBy(xpath = "//h2[text()='Mac']")
	private WebElement iMacText;
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement iMacList;
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement iMacGrid;
	@FindBy(id = ("compare-total"))
	private WebElement iMacProductCompare;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement iMacSortBy;
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement iMacShow;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopPageItem;
	@FindBy(xpath = "(//a[text()='Desktops'])[2]")
	private WebElement printDesktopName;
	@FindBy(xpath = "//p[contains (text(), 'Example of category')]")
	private WebElement desktopCatagoryText;
	@FindBy(xpath = "//select[@id = 'input-sort']")
	private WebElement defaultDropDown;
	@FindBy(xpath = "//select[@id = 'input-limit']")
	private WebElement showtDropDown;
	@FindBy(tagName = "a")
	private List<WebElement> allListOfItemsOnDesktop;
	@FindBy(linkText = "Apple Cinema 30")
	private WebElement printAppleCinemsName;
	@FindBy(xpath = "//div[contains(text(),'The 30-inch Apple Cinema')]")
	private WebElement appleCinemaDescription;
	@FindBy(xpath = "//span[text()='$110.00']")
	private WebElement appleCinemaPriceAndTax;
	@FindBy(xpath = "//span[text()='Add to Cart'][1]")
	private WebElement appleCinemaAddToCart;
	@FindBy(xpath = "//i[@class='fa fa-heart'])[2]")
	private WebElement appleCinemaWishList;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement appleCinemaCompareThisProduction;
	@FindBy(xpath = "//a[normalize-space()='Canon EOS 5D Camera']")
	private WebElement canonEOSPrintName;
	@FindBy(xpath = "//p[contains(text(),'Canon')]")
	private WebElement cannonEOS5DDEscription;
	@FindBy(xpath = "//p[@class='price'][1]")
	private WebElement canonEOSPrice;
	@FindBy(xpath = "//button[contains(@onclick,'30')][1]")
	private WebElement canonEOSAddToCart;
	@FindBy(xpath = "(//p[@class='price'])[2]")
	private WebElement canonEOSPriceAndTax;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement canonEOSWishList;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement canonEOSCompareThisProduct;
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement canonEOSSelect;
	@FindBy(xpath = "	//input[@id='input-quantity']")
	private WebElement canonSelectQty;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement canonAddToCartQty;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successTextCanonAddToCart;
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewCanonEOS;
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement inputNameReviewCanonEOS;
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement textAreaReviewCanonEOS;
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButtonCanonEOS;
	@FindBy(xpath = "//div[4]//div[1]//input[1]")
	private WebElement radioButtonCanonEOS1;
	@FindBy(xpath = "//div[4]//div[1]//input[2]")
	private WebElement radioButtonCanonEOS2;
	@FindBy(xpath = "//div[4]//div[1]//input[3]")
	private WebElement radioButtonCanonEOS3;
	@FindBy(xpath = "//div[4]//div[1]//input[4]")
	private WebElement radioButtonCanonEOS4;
	@FindBy(xpath = "//div[4]//div[1]//input[5]")
	private WebElement radioButtonCanonEOS5;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement thankYouMessageCanonEOS;

	public void canonSelectQty() {
		canonSelectQty.sendKeys("1");
	}

	public void canonSelectQtyClear() {
		canonSelectQty.clear();
	}

	public void ClickOnCanonAddToCartQty() {
		canonAddToCartQty.click();
	}

	public void SuccessTextCanonAddToCart() {
		successTextCanonAddToCart.getText();

	}

	public void clickOnCanonEOSPrintName() {
		canonEOSPrintName.click();
	}

	public void clickOnAddToCartCanonEOS5D() {
		canonEOSAddToCart.click();
	}

	public void clickOncanonEOSSelect() throws InterruptedException {
		Thread.sleep(3000);
		Select select = new Select(canonEOSSelect);
		select.selectByIndex(1);
	}

	public void clickOnwriteReviewCanonEOS() {
		writeReviewCanonEOS.click();
	}

	public void sendKeyInputNameReviewCanonEOS() {
		inputNameReviewCanonEOS.sendKeys("Sam");

	}

	public void sendKeyTextAreaReviewCanonEOS() {
		textAreaReviewCanonEOS.sendKeys("Good quality and easy to use.");
	}

	public void clickOnContinueButtonCanonEOS() {
		continueButtonCanonEOS.click();
	}

	public void clickOnradioButtonCanonEOS1() {
		radioButtonCanonEOS1.click();
	}

	public void clickOnradioButtonCanonEOS2() {
		radioButtonCanonEOS2.click();
	}

	public void clickOnradioButtonCanonEOS3() {
		radioButtonCanonEOS3.click();
	}

	public void clickOnradioButtonCanonEOS4() {
		radioButtonCanonEOS4.click();
	}

	public void clickOnradioButtonCanonEOS5() {
		radioButtonCanonEOS5.click();
	}

	public void textThankYouMessageCanonEOS() {
		String text = thankYouMessageCanonEOS.getText();
		if (text.equalsIgnoreCase("Thank you for your review. It has been submitted to the webmaster for approval.")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text doesn't match");
		}
	}

	@FindBy(linkText = "HP LP3065")
	private WebElement printHPLPName;
	@FindBy(xpath = "//p[contains(text(),'Stop your co-workers')]")
	private WebElement hPLPDecriptionText;
	@FindBy(xpath = "(//p[@class='price'])[3]")
	private WebElement hPLPDPriceAndTax;

	@FindBy(xpath = "//button[contains(@onclick,'47')][1]")

	private WebElement hPLPAddtoCart;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement hPLPDWishList;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement hPLPCompatreThiProduct;
	@FindBy(xpath = "//input[@Id='input-quantity']")
	private WebElement hPLPQty;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButtonHPLP;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageSuccessAddedToCartHPLP;

	public void printHPLPdescription() {
		WebElement text = hPLPDecriptionText;
		System.out.println(text.getText());
	}

	public void clickOnHPLPName() {
		printHPLPName.click();
	}

	public void clickOnAddToCartHPLP() {
		hPLPAddtoCart.click();
	}

	public void sendKeyHPLPQty() {
		hPLPQty.sendKeys("1");
	}

	public void clearHPLPQty() {
		hPLPQty.clear();
	}

	public void clickOnAddToCArtButtonHPLP() {
		addToCartButtonHPLP.click();
	}

	public void textMessageSuccessAddedToCartHPLP() {
		messageSuccessAddedToCartHPLP.getText();

	}

	@FindBy(linkText = ("HTC Touch HD"))
	private WebElement printHTCTouchHD;
	@FindBy(xpath = ("//p[contains(text(), 'HTC Touch')]"))
	private WebElement TextDescriptionHTCTouchHD;
	@FindBy(xpath = ("(//p[@class ='price'])[4]"))
	private WebElement priceAndTaxHTCTouchHD;
	@FindBy(xpath = ("(//i[@class ='fa fa-shopping-cart'])[6]"))
	private WebElement hTCTouchHDAddToCart;
	@FindBy(xpath = ("(//i[@class ='fa fa-heart'])[5]"))
	private WebElement hTCTouchHDWishList;
	@FindBy(xpath = ("(//i[@class ='fa fa-exchange'])[4]"))
	private WebElement hTCTouchHDCompareThisProduct;

	@FindBy(linkText = ("iPhone"))
	private WebElement printiPhone;
	@FindBy(xpath = ("//p[contains(text(), 'iPhone is a revolutionary')]"))
	private WebElement DescriptionTextiPhone;
	@FindBy(xpath = ("(//p[@class='price'])[5]"))
	private WebElement iPhonePriceAndTax;
	@FindBy(xpath = ("(//i[@class='fa fa-shopping-cart'])[7]"))
	private WebElement iPhoneAddToCart;
	@FindBy(xpath = ("(//i[@class='fa fa-heart'])[6]"))
	private WebElement iPhoneWhishList;
	@FindBy(xpath = ("(//i[@class='fa fa-exchange'])[5]"))
	private WebElement iPhoneCompareThisProduct;

	@FindBy(linkText = ("iPod Classic"))
	private WebElement printiPodClassic;
	@FindBy(xpath = ("(//p[@class='price'])[6]"))
	private WebElement iPodClassicPriceAndTax;
	@FindBy(xpath = ("//p[contains(text(),'iPhone is a revolutionary')]"))
	private WebElement iPodClassicTextDescription;
	@FindBy(xpath = ("(//i[@class='fa fa-shopping-cart'])[8]"))
	private WebElement iPodClassicAddToCart;
	@FindBy(xpath = ("(//i[@class='fa fa-heart'])[7]"))
	private WebElement iPodClassicWishToList;
	@FindBy(xpath = ("(//i[@class='fa fa-exchange'])[6]"))
	private WebElement iPodClassicCompareThisProduct;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//p[contains(text(),'Intel Core 2')]")
	private WebElement descriptionMacBook;
	@FindBy(xpath = "(//p[@class='price'])[7]")
	private WebElement priceMacBook;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
	private WebElement addToCartMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[8]")
	private WebElement wishListMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[7]")
	private WebElement compareThisProdMacBook;

	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAir;
	@FindBy(xpath = "//p[contains(text(),'MacBook Air')]")
	private WebElement descriptionMacBookAir;
	@FindBy(xpath = "(//p[@class='price'])[8]")
	private WebElement priceMacBookAir;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[8]")
	private WebElement addToCartMacBookAir;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[9]")
	private WebElement wishListMacBookAir;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[8]")
	private WebElement compareThisProdMacBookAir;

	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoPro;
	@FindBy(xpath = "//p[contains(text(),'Redefine your')]")
	private WebElement descriptionPalmTreoPro;
	@FindBy(xpath = "(//p[@class='price'])[9]")
	private WebElement pricePalmTreoPro;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
	private WebElement addToCartPalmTreoPro;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[10]")
	private WebElement wishListPalmTreoPro;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[9]")
	private WebElement compareThisProdPalmTreoPro;

	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product8;
	@FindBy(xpath = "//p[contains(text(),'Product 8')]")
	private WebElement descriptionProduct8;
	@FindBy(xpath = "(//p[@class='price'])[10]")
	private WebElement priceProduct8;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
	private WebElement addToCartProduct8;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement wishListProduct8;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[10]")
	private WebElement compareThisProduct8;

	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSynMaster;
	@FindBy(xpath = "//p[contains(text(),'Imagine the advantages')]")
	private WebElement descriptionSamsungSynMaster;
	@FindBy(xpath = "(//p[@class='price'])[11]")
	private WebElement priceSamsungSynMaster;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
	private WebElement addToCartSamsungSynMaster;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[12]")
	private WebElement wishListSamsungSynMaster;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[11]")
	private WebElement compareSamsungSynMaster;

	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement SonyVAIO;
	@FindBy(xpath = "//p[contains(text(),'Unprecedented power')]")
	private WebElement descriptionSonyVAIO;
	@FindBy(xpath = "(//p[@class='price'])[12]")
	private WebElement priceSonyVAIO;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
	private WebElement addToCartSonyVAIO;
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[13]")
	private WebElement wishListSonyVAIO;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[12]")
	private WebElement compareSonyVAIO;

	public void textTestEnvoironment() {
		String text = textTESTENVIRONMENT.getText();
		System.out.println(text);
	}

	public void clickOnShowAllDesktop() {
		showAllDesktopPageItem.click();
	}

	public void getListOfAllListOfItemsOnDesktop() throws InterruptedException {

		List<WebElement> list = allListOfItemsOnDesktop;
		System.out.println(list.size() + " size of element prsent in UI:");
		Thread.sleep(3000);
		for (int i = 0; i < list.size(); i++) {

			Assert.assertTrue(list.size() != 0);

		}
	}

	public void clickOnDesktops() {
		desktop.click();

	}

	public void clickOnPc() {
		pc.click();
	}

	public void clickOnMac() {
		mac.click();
	}

	public void clickOniMac() {
		iMac.click();
	}

}
