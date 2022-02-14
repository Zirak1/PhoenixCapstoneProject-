package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import pageObjects.RetailPageObj;
import utilities.Utilities;

public class RetailSteps extends Base{
	RetailPageObj retail = new RetailPageObj();
	
	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
	    retail.clickOnMyAccountButton();
	    logger.info("User clicked  on MyAccount");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	    retail.clickOnLoginButton();
	    logger.info("User clicked on Login");
	}

	@When("User enter username ‘userName’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() {
		retail.enterUserName();
	   retail.enterPassword();
	   logger.info("User entered username ‘userName’ and password 'password’");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	    retail.clickOnLoginButtonMain();
	    logger.info("User clicked on Login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		retail.textMyAccountDashboard();
		logger.info("User can see logged in to MyAccount dashboard");
	    Utilities.takeScreenShot("User logged on My Account Dashboard");
	   //
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		retail.clickOnRegisterForAnAffiliateAccount();
		 logger.info("User clicked on ‘Register for an Affiliate Account’ link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		retail.sentKeyscompanyFiled(data.get(0).get("company"));
	    retail.sentKeywebsiteFiled(data.get(0).get("website"));
	    retail.sentKeytaxFiled(data.get(0).get("taxID"));
	    retail.clickOnradioCheque();
	    retail.sendKeychequePayeeNameFeild();
	    logger.info("User filled affiliate form with above information");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
	    retail.clickOncheckBoxAboutUs();
	    logger.info("User checked on About us check box");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	    retail.clickOncontinueButton();
	    logger.info("User clicked on Continue button");
	}
//
	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String string) throws Exception {
		retail.verifySuccessMessage(string);
		logger.info("User can see a success message successfuly!");
	    Utilities.takeScreenShot("User Succes message");
	    
	   
	}
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    retail.clickOneditYourAffilInfo();
	    logger.info("User clicked on ‘Edit your affiliate informationlink");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
	   retail.clickOnradioBank();
	   logger.info("user clicked on Bank Transfer radio button");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	   retail.sendKeybankNameFeild(data.get(0).get("bankName"));
	   retail.sendKeybankBranchNumber(data.get(0).get("abaNumber"));
	   retail.sendKeySWIFTcodeField(data.get(0).get("swiftCode"));
	   retail.sendKeyaccountNameField(data.get(0).get("accountName"));
	   retail.sendKeyaccountNumberField(data.get(0).get("accountNumber"));
	   logger.info("User filled Bank information with above information");
	}
	
	
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		retail.clickOneditYourAcc();
		 logger.info("User clicked on ‘Edit your account information’ link");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
	  List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	   retail.sendKeyfirstNameMyAccFeild(data.get(0).get("firstname"));
	   retail.sendKeylastNameMyAccFeild(data.get(0).get("lastName"));
	   retail.sendKeyemailMyAccFeild(data.get(0).get("email"));
	   retail.sendKeytelephoneMyAccFeild(data.get(0).get("telephone"));
	   logger.info("User modified above information");
	}

	@When("User click on continue button")
	public void user_click_on_continue_buttonn() {
	    retail.clickOncontinueButtonMyAcc();
	    logger.info("User clicked on continue button");
	}

//	@Then("User should see a message5 {string}")
//	public void user_should_see_a_message5(String string) throws Exception {
//		retail.textcuccessMessMyAcc(string);
//	  logger.info("User can see message ‘Success: Your account has been successfully updated.’");
//	   Utilities.takeScreenShot("MyAccounSuccesMessage");
//	   
//	}

}
