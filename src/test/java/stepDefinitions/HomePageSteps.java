package stepDefinitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObj;

public class HomePageSteps extends Base {
	HomePageObj home = new HomePageObj();

	@When("User click on Currency")
	public void user_click_on_currency() {
		home.clickOnCurrency();
		logger.info("User click on Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		home.clickOneuroButtonCurrency();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws Exception {
		home.getTextchangeCurrency();
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		home.clickShoppingCart();

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws Exception {
		home.shoppingCartIsEmty();
	}

}
