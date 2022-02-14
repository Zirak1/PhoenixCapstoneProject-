package stepDefinitions;

import java.io.IOException;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPageObj;

import utilities.Utilities;

public class DesktopTab extends Base{
	DesktopPageObj desktop = new DesktopPageObj();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		desktop.textTestEnvoironment();
		Utilities.takeScreenShot("HomePage");
		logger.info("Home validated successfully");

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktops();
		logger.info("Clicked on desktop");
	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickOnShowAllDesktop();
		logger.info("clicked on Show All Desktop");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException, InterruptedException {

		desktop.getListOfAllListOfItemsOnDesktop();
		logger.info("User Can see the size of items Success");
		// 106 size of element prsent in UI:we will see in our test pass
		
//		Utilities.takeScreenShot("1 Show All Desktop Page");
//		Utilities.scrolldownPage();
//		Utilities.takeScreenShot("2 Show All Desktop Page");
	}

//2-HPLP3065--------------------------------------------------------------------
	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickOnAddToCartHPLP();
		logger.info("Enterd to HPLP by cliking add to cart button Successfully!");

	}

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktop.clearHPLPQty();
		desktop.sendKeyHPLPQty();
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickOnAddToCArtButtonHPLP();
		logger.info("Clicked on add to cart Button2 Successfuly!");
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1)
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		desktop.textMessageSuccessAddedToCartHPLP();
		Utilities.takeScreenShot("HPLP3065");
		logger.info("Success message showing and taken screenshot Successfully!");

	}

//3-Cannon---------------------------------------------------------------------	
	@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.clickOnAddToCartCanonEOS5D();
	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() throws InterruptedException {
		Thread.sleep(3000);
		desktop.clickOncanonEOSSelect();
		Thread.sleep(3000);
	}

	@When("User select quantity {int} here")
	public void user_select_quantity_here(Integer int1) {
		desktop.canonSelectQtyClear();
	    desktop.canonSelectQty();
	}

	@When("User click add to Cart buttonn")
	public void user_click_add_to_cart_buttonn() {
		desktop.ClickOnCanonAddToCartQty();
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws IOException, InterruptedException {
		Thread.sleep(3000);
		desktop.SuccessTextCanonAddToCart();
		Utilities.takeScreenShot("Cannon EOS 5D");
	}


//4---------------------------------------------------------

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOnCanonEOSPrintName();
}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnwriteReviewCanonEOS();
}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
        desktop.sendKeyInputNameReviewCanonEOS();
        desktop.sendKeyTextAreaReviewCanonEOS();
        desktop.clickOnradioButtonCanonEOS5();
}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.clickOnContinueButtonCanonEOS();
    
}

	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() throws InterruptedException {
		Thread.sleep(3000);
		desktop.textThankYouMessageCanonEOS();
		
}
}