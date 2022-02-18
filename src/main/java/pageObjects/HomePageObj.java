package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class HomePageObj extends Base {

	public HomePageObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euroButtonCurrency;
	@FindBy(xpath = "//button[text()='£ Pound Sterling']")
	private WebElement poundButtonCurrency;
	@FindBy(xpath = "//button[text()='$ US Dollar']")
	private WebElement dollarButtonCurrency;
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']//strong")
	private WebElement changeCurrency;
	@FindBy(xpath = "//div[@id='content']//p")
	private WebElement shoppingCartIsEmty;

	public void clickOneuroButtonCurrency() {
		euroButtonCurrency.click();
	}

	public void clickOpoundButtonCurrency() {
		poundButtonCurrency.click();
	}

	public void clickOdollarButtonCurrency() {
		dollarButtonCurrency.click();
	}

	public void getTextchangeCurrency() throws Exception {
		String text = changeCurrency.getText();
		if (text.equalsIgnoreCase("€")) {
			System.out.println("Currency is €");
		} else if (text.equalsIgnoreCase("£")) {
			System.out.println("Currency is £");
		} else if (text.equalsIgnoreCase("$")) {
			System.out.println("Currency is $");
		} else {
			throw new Exception("Currency money does not match!");
		}
		Thread.sleep(2000);
	}

	public void shoppingCartIsEmty() throws Exception {

		String text = shoppingCartIsEmty.getText();
		Thread.sleep(2000);
		if (text.equalsIgnoreCase("Your shopping cart is empty!")) {
			System.out.println("Text verified!");
		} else {
			throw new Exception("Text does not match!");
		}
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement phone;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishList;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCArt;
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkout;
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textTESTENVIRONMENT;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchBarClickBitton;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shopingCart;
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktop;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNoteBooks;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement PhonesAndPDAs;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameras;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3Players;
	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablets;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//p[contains(text(), 'Intel Core 2 Duo processor')]")
	private WebElement decribtionOfMacBook;
	@FindBy(xpath = "//p[contains(text(), '$602')]")
	private WebElement macBookPriceAndTax;
	@FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
	private WebElement shoppingCartButtonMac;
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[2]")
	private WebElement wishListHeartMac;
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[1]")
	private WebElement comareThisProductMac;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	@FindBy(xpath = "//p[contains(text(),'iPhone is a revolutionary')]")
	private WebElement decribtionOfIPhone;
	@FindBy(xpath = "//p[contains(text(),'$123')]")
	private WebElement priceAndTaxIPhone;
	@FindBy(xpath = "(//*[text()='Add to Cart'])[2]")
	private WebElement shoppingCartButtonIPhone;
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[3]")
	private WebElement wishListHeardIPhone;
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProductIPhone;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement aplleCinema30;
	@FindBy(xpath = "//p[contains(text(),'The 30-inch')]")
	private WebElement descriptionOfAplleCinema30;
	@FindBy(xpath = "((//*[@class='price'])[3]")
	private WebElement NewAndOldPriceAndTaxAplleCinema30;
	@FindBy(xpath = "((//*[text()='Add to Cart'])[3]")
	private WebElement shoppingCartAplleCinema30;
	@FindBy(xpath = "(//*[@class='fa fa-heart'])[4]")
	private WebElement wishListAplleCinema30;
	@FindBy(xpath = "(//*[@class='fa fa-exchange'])[3]")
	private WebElement compareThisProductAplleCinema30;

	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement CanonEOS5D;
	@FindBy(xpath = "//p[contains(text(),'Canon')]")
	private WebElement discriptionOfCanonEOS5D;
	@FindBy(xpath = "(//*[@class='price'])[4]")
	private WebElement newAndOldPriceAndTaxCanonEOS5D;
	@FindBy(xpath = "(//*[text()='Add to Cart'])[4]")
	private WebElement addtoCartCanonEOS5D;

	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement InformationFooter;
	@FindBy(linkText = ("About Us"))
	private WebElement AboutUsFooter;
	@FindBy(linkText = ("Delivery Information"))
	private WebElement deliveryInformationFooter;
	@FindBy(linkText = ("Privacy Policy"))
	private WebElement privacyPolicyFooter;
	@FindBy(linkText = ("Terms & Conditions"))
	private WebElement termsAndConditionsFooter;
	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement customerServiceFooter;
	@FindBy(linkText = ("Contact Us"))
	private WebElement contactUsFooter;
	@FindBy(linkText = ("Returns"))
	private WebElement returnsFooter;
	@FindBy(linkText = ("Site Map"))
	private WebElement siteMapFooter;
	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement exrasFooter;
	@FindBy(linkText = ("Brands"))
	private WebElement brandsFooter;
	@FindBy(linkText = ("Gift Certificates"))
	private WebElement giftCertificatesFooter;
	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliateFooter;
	@FindBy(linkText = ("Specials"))
	private WebElement specialsFooter;
	@FindBy(xpath = "//h5[text()='My Account']")
	private WebElement wishListHeartCanonEOS5D;
	private WebElement myAccountFooter;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccountFooterClick;
	@FindBy(linkText = ("Order History"))
	private WebElement orderHistoryFooter;
	@FindBy(xpath = "//a[text()='Wish List']")
	private WebElement wishListFooter;
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement newsTellerFooter;
	@FindBy(xpath = "//p[contains(text(), 'Powered By')]")
	private WebElement poweredByFooter;

	public void clickOnCurrency() {
		currency.click();

	}

	public void clicktPhone() {
		phone.click();
	}

	public void clickMyAccount() {
		myAccount.click();
	}

	public void clicktWishList() {
		wishList.click();
	}

	public void clickShoppingCart() throws InterruptedException {
		Thread.sleep(3000);
		shoppingCArt.click();

	}

	public void clickCheckout() {
		checkout.click();

	}

	public void textTestEnvoironment() {
		WebElement text = textTESTENVIRONMENT;
		System.out.println(text.getText());
	}

	public void searchBarClickButton() {
		searchBarClickBitton.click();
	}

	public void clickOnShoppingCart() {
		shopingCart.click();
	}

	public void clickOnDesktops() {
		desktop.click();
	}

	public void clickOnShowAllDesktop() {
		showAllDesktop.click();
	}

	public void clickOnLapTopAndNotebooks() {
		laptopAndNoteBooks.click();
	}

	public void clickOnComponents() {
		components.click();
	}

	public void clickOnTablets() {
		tablets.click();
	}

	public void clickOnSoftware() {
		software.click();
	}

	public void clickOnPhonesAndPDAs() {
		PhonesAndPDAs.click();
	}

	public void clickOnCameras() {
		cameras.click();
	}

	public void clickOnmp3Players() {
		mp3Players.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void describtionOfMacBook() {
		decribtionOfMacBook.getText();
	}

	public void priceAndTaxMAcBook() {
		macBookPriceAndTax.getText();
	}

	public void clickOnShoppingCartButtonMac() {
		shoppingCartButtonMac.click();
	}

	public void clickOnWishListHeartMac() {
		wishListHeartMac.click();
	}

	public void clickOnCompareThisProductMac() {
		comareThisProductMac.click();
	}

	public void clickOnIPhone() {
		iPhone.click();
	}

	public void getTextDecribtionOfIPhone() {
		decribtionOfIPhone.getText();
	}

	public void getPriceIphone() {
		priceAndTaxIPhone.getText();
	}

	public void clickOnShoppingCartIphone() {
		shoppingCartButtonIPhone.click();
	}

	public void clickOnWishListHeardIphone() {
		wishListHeardIPhone.click();
	}

	public void clickOncompareThisProductIPhone() {
		compareThisProductIPhone.click();
	}

	public void clickOnAplleCinema30() {
		aplleCinema30.click();
	}

	public void getTextDescriptionOfAplleCinema30() {
		descriptionOfAplleCinema30.getText();
	}

	public void getTextNewAndOldPriceAndTaxAplleCinema30() {
		NewAndOldPriceAndTaxAplleCinema30.getText();
	}

	public void clickOnCartAplleCinema30() {
		shoppingCartAplleCinema30.click();
	}

	public void clickOnWishListAplleCinema30() {
		wishListAplleCinema30.click();
	}

	public void clickOnCompareThisProductAplleCinema30() {
		compareThisProductAplleCinema30.click();
	}

	public void getTextCanonEOS5D() {
		CanonEOS5D.click();
	}

	public void getTextDiscriptionOfCanonEOS5D() {
		discriptionOfCanonEOS5D.getText();
	}

	public void getTextNewAndOldPriceAndTaxCanonEOS5D() {
		newAndOldPriceAndTaxCanonEOS5D.getText();
	}

	public void clickOnAddtoCartCanonEOS5D() {
		addtoCartCanonEOS5D.click();

	}

	public void clickOnwishListHeartCanonEOS5D() {
		wishListHeartCanonEOS5D.click();

	}

	public void getTextOnInformationFooter() {
		InformationFooter.getText();
	}

	public void clickOnAboutUsFooter() {
		AboutUsFooter.click();
	}

	public void clickOnDeliveryInformationFooter() {
		deliveryInformationFooter.click();
	}

	public void clickOnprivacyPolicyFooter() {
		privacyPolicyFooter.click();
	}

	public void clickOnTermsAndConditionsFooter() {
		termsAndConditionsFooter.click();
	}

	public void getTextCustomerServiceFooter() {
		customerServiceFooter.getText();
	}

	public void clickOncontactUsFooter() {
		contactUsFooter.click();
		;
	}

	public void clickOnReturnsFooter() {
		returnsFooter.click();
	}

	public void clickOnSiteMapFooter() {
		siteMapFooter.click();
	}

	public void getTextExrasFooter() {
		exrasFooter.getText();
	}

	public void clickOnBrandsFooter() {
		brandsFooter.click();
	}

	public void clickOnGiftCertificatesFooter() {
		giftCertificatesFooter.click();
	}

	public void clickOnAffiliateFooter() {
		affiliateFooter.click();
	}

	public void clickOnSpecialsFooter() {
		specialsFooter.click();
	}

	public void getTextmyAccountFooter() {
		myAccountFooter.getText();
	}

	public void clickOnMyAccountFooter() {
		myAccountFooterClick.click();
	}

	public void clickOnOrderHistoryFooter() {
		orderHistoryFooter.click();
	}

	public void clickOnWishListFooter() {
		wishListFooter.click();
	}

	public void clickOnNewsTellerFooter() {
		newsTellerFooter.click();
	}

	public void getTextPoweredByFooter() {
		poweredByFooter.getText();
	}

}