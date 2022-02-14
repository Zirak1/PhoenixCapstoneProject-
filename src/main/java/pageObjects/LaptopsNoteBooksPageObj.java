package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObj extends Base{
	
	
	public LaptopsNoteBooksPageObj() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement textTESTENVIRONMENT;
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	private WebElement loptopsAndNB;
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNB;
	@FindBy(linkText="MacBook")
	private WebElement itemMacBook;
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCartbuttonMacBook;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAddedToCartMacBook;
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartTotalMacBook;
	@FindBy(xpath="//span[@id='cart-total']") 
	private WebElement cartTotal;
	@FindBy(xpath="//i[@class='fa fa-times']") 
    private WebElement cartRemoveButton;
	@FindBy(xpath="//span[@id='cart-total']") 
	private WebElement textEmptyShoppingCart;
	@FindBy(xpath="//button[contains(@onclick,'43')][3]")
	private WebElement compareProductButtonMacBook;
	@FindBy(xpath="//button[contains(@onclick,'44')][3]")
	private WebElement compareProductButtonMacBookAir;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageMacBookAir;
	@FindBy(linkText="product comparison")
	private WebElement productComparisonLinkMacBookAir;
	@FindBy(xpath="//h1[text()='Product Comparison']")
	private WebElement productComparisonText;
	@FindBy(xpath="//div[@id='content']//a/strong")
	private List<WebElement> listOfItemsProductComparison;
	@FindBy(xpath="//button[contains(@onclick,'46')][2]")
	private WebElement heartSonyVAIO;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement textSuccessTexttSonyVAIO;
	@FindBy(linkText="MacBook Pro")
	private WebElement macBookPro;
	@FindBy(xpath="//ul[@class='list-unstyled']//h2")
	private WebElement priceMacBookPro;
	
	
	
//-------------------	
	@FindBy(xpath="//a[text()='Macs (0)']")
	private WebElement loptopsAndNBMacs;
	@FindBy(xpath="//h2[text()='Macs']")
	private WebElement textMAcsLoptopsAndNB; //just text getText()
	@FindBy(xpath="//p[text()='There are no products to list in this category.']")
	private WebElement textThereAreNoProductLoptopsAndNBMacs; //just text getText()
	@FindBy(xpath="//a[text()='Windows (0)']")
	private WebElement windowsLoptopsAndNBMacs; // dropdown .click
	@FindBy(xpath="//h2[text()='Windows']")
	private WebElement textWindowsLoptopsAndNBMacs; // .getText()
	@FindBy(xpath="//img[@class='img-responsive']")
	private WebElement imgLoptopsAndNB; // .click img
	
	
	public void textTestEnvoironment() {
		WebElement text= textTESTENVIRONMENT;
		 System.out.println(text.getText());
	 }
	public void clickOnLoptopsAndNB() {
		loptopsAndNB.click();
	}
	public void clickOnshowAllLaptopsAndNB() {
		showAllLaptopsAndNB.click();
	}
	public void clickOnItemMacBook() {
		itemMacBook.click();
	}
	public void clickOnaddToCartbuttonMacBook() {
		addToCartbuttonMacBook.click();
	}
	public void textSuccessAddedToCartMacBook () {
		successAddedToCartMacBook.getText();
	}
	public void getTextcartTotalMacBook() throws Exception {
		String text = cartTotalMacBook.getText();
	
			if (text.equalsIgnoreCase("1 item(s) - $602.00")) {
				logger.info("Text verified!");
			
			} else {
				logger.info("Text does not match!");
				throw new Exception();
				}
			}
	public void ClickOnCartTotal() {
		cartTotal.click();
	}
	public void ClickOnCartRemoveButton() {
		cartRemoveButton.click();
	}
	public void TextEmptyShoppingCart() throws Exception {
		Thread.sleep(3000);
		String cartEmotyText = textEmptyShoppingCart.getText();
		
		if (cartEmotyText.equalsIgnoreCase("0 item(s) - $0.00")) {
			logger.info("Cart is empty!");
		
		} else {
			logger.info("Cart is not empty!");
			throw new Exception();
			}
		
	}			
		 
	public void clickOncompareProductButtonMacBook() {
		compareProductButtonMacBook.click();
	}		
	public void clickOncompareProductButtonMacBooAir() {
		compareProductButtonMacBookAir.click();
	}		
	public void successMessageMacBookAirButtonMacBooAir() {
		successMessageMacBookAir.getText();
	}		
	public void clickOnproductComparisonLinkMacBookAir() throws InterruptedException {
		Thread.sleep(2000);
		productComparisonLinkMacBookAir.click();
	}
	public void getTextproductComparisonText() {
		productComparisonText.getText();
	}
	public void allListOfItemsProductComparison() {
		
		List<WebElement> list = listOfItemsProductComparison;
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
	}
	public void clickOnHeartSonyVAIO() {
		heartSonyVAIO.click();
	}
	public void textSuccessTextSonyVAIO() {
		textSuccessTexttSonyVAIO.getText();
		
	}
	public void clickOnMacBookPro(){
		macBookPro.click();
		
	}
	public void textPriceMacBookPro() throws Exception{
		String price = priceMacBookPro.getText();
		if (price.equalsIgnoreCase("$2,000.00")) {
			logger.info("Price verified!");
			
		} else {
			throw new Exception("Price does not match!");
		}
	}
	
}
