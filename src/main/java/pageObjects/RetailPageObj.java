package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import org.junit.Assert;

public class RetailPageObj extends Base {

	public RetailPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFiled;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginButtonMain;
	@FindBy(xpath = "//div[@id='content']//h2[1]")
	private WebElement myAccountDashboard;
	@FindBy(linkText = "Register for an affiliate account")
	private WebElement registerForAnAffiliateAccount;
	@FindBy(id = "input-company")
	private WebElement companyFiled;
	@FindBy(id = "input-website")
	private WebElement websiteFiled;
	@FindBy(id = "input-tax")
	private WebElement taxFiled;
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement radioCheque;
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement radioPayPal;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement radioBank;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBoxAboutUs;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAcc;
	@FindBy(id = "input-firstname")
	private WebElement firstNameMyAccFeild;
	@FindBy(id = "input-lastname")
	private WebElement lastNameMyAccFeild;
	@FindBy(id = "input-email")
	private WebElement emailMyAccFeild;
	@FindBy(id = "input-telephone")
	private WebElement telephoneMyAccFeild;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonMyAcc;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement cuccessMessMyAcc;
	@FindBy(id = "input-bank-name")
	private WebElement bankNameFeild;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement bankBranchNumber;
	@FindBy(id = "input-bank-swift-code")
	private WebElement SWIFTcodeField;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberField;

	@FindBy(id = "input-cheque")

	private WebElement chequePayeeNameFeild;
	@FindBy(linkText = "Edit your affiliate information")
	private WebElement editYourAffilInfo;

	public void validateHomePage() {
		String text = textToValildate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	}

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}
// email update here 
	public void enterUserName() {
		userNameFiled.sendKeys("zirak9@gmail.com");
	}

	public void enterPassword() {
		passwordField.sendKeys("1111");
	}

	public void enterUserNameWithParam(String username) {
		userNameFiled.sendKeys("Zirak");
	}

	public void enterPasswordWithParam(String password) {
		passwordField.sendKeys("0000");
	}

	public void clickOnLoginButtonMain() {
		loginButtonMain.click();
	}

	public void textMyAccountDashboard() {
		String actual = myAccountDashboard.getText();
		String excpected = "My Account";
		System.out.println(actual);
		try {
			Assert.assertEquals(excpected, actual);
		} catch (Exception e) {
			System.out.println("assertion failed");
		}

	}

	public void clickOnRegisterForAnAffiliateAccount() throws InterruptedException {
		Thread.sleep(2000);
		registerForAnAffiliateAccount.click();
	}

	public void sentKeyscompanyFiled(String company) {
		companyFiled.sendKeys(company);
	}

	public void sentKeywebsiteFiled(String website) {
		websiteFiled.sendKeys(website);
	}

	public void sentKeytaxFiled(String taxID) {
		taxFiled.sendKeys(taxID);
	}

	public void clickOnradioCheque() throws InterruptedException {
		radioCheque.click();

		Thread.sleep(2000);

	}

	public void clickOnradioPayPal() throws InterruptedException {
		radioPayPal.click();

		Thread.sleep(2000);

	}

	public void clickOnradioBank() throws InterruptedException {
		radioBank.click();

		Thread.sleep(2000);

	}

	public void clickOncheckBoxAboutUs() {
		checkBoxAboutUs.click();
	}

	public void clickOncontinueButton() {
		continueButton.click();
	}

	public void verifySuccessMessage(String string) throws Exception {
		String expected = successMessage.getText();
		try {
			Assert.assertEquals(expected, string);
		} catch (Exception e) {

		}

	}

	public void sendKeychequePayeeNameFeild() {
		chequePayeeNameFeild.sendKeys("Jan");

	}

	public void clickOneditYourAffilInfo() {
		editYourAffilInfo.click();

	}

	public void sendKeybankNameFeild(String bankName) {
		bankNameFeild.clear();
		bankNameFeild.sendKeys(bankName);

	}

	public void sendKeybankBranchNumber(String abaNumber) {
		bankBranchNumber.clear();
		bankBranchNumber.sendKeys(abaNumber);

	}

	public void sendKeySWIFTcodeField(String swiftCode) {
		SWIFTcodeField.clear();
		SWIFTcodeField.sendKeys(swiftCode);

	}

	public void sendKeyaccountNameField(String accountName) {
		accountNameField.clear();
		accountNameField.sendKeys(accountName);

	}

	public void sendKeyaccountNumberField(String accountNumber) {
		accountNumberField.clear();
		accountNumberField.sendKeys(accountNumber);

	}

	public void clickOneditYourAcc() {
		editYourAcc.click();
	}

	public void sendKeyfirstNameMyAccFeild(String firstname) {
		firstNameMyAccFeild.clear();
		firstNameMyAccFeild.sendKeys(firstname);
	}

	public void sendKeylastNameMyAccFeild(String lastName) {
		lastNameMyAccFeild.clear();
		lastNameMyAccFeild.sendKeys(lastName);
	}

	public void sendKeyemailMyAccFeild(String email) {
		emailMyAccFeild.clear();
		emailMyAccFeild.sendKeys(email);
	}

	public void sendKeytelephoneMyAccFeild(String telephone) {
		telephoneMyAccFeild.clear();
		telephoneMyAccFeild.sendKeys(telephone);
	}

	public void clickOncontinueButtonMyAcc() {
		continueButtonMyAcc.click();
	}

	public void textcuccessMessMyAcc(String strSuccessMsq) throws Exception {
		String expected = cuccessMessMyAcc.getText();
		System.out.println(expected);
		try {
			Assert.assertEquals(expected, strSuccessMsq);
		} catch (Exception e) {

		}

	}

}
