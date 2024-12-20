package org.steps;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class StepDefinition extends BaseClass {
	HomePagePojo homePagePojo;
	CheckOutPojo page;
	CheckOutPojo checkoutpojo;
	
	@Given("User launches the General Store App")
	public void user_launches_the_general_store_app() throws MalformedURLException {
	    
		appLaunch("Mani", "C:\\Users\\admin\\Downloads\\Manikandan\\App\\General-Store.apk");
		
	}
	@When("User selects the country India")
	public void user_selects_the_country_india() {
	    homePagePojo = new HomePagePojo();
	    WebElement dropDown = homePagePojo.getDropDown();
		buttonclick(dropDown);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		WebElement IndiaOption = driver.findElement(By.xpath("//*[@text='India']"));
	    buttonclick(IndiaOption);
	}
	@When("User enters the names")
	public void user_enters_the_names() {
		WebElement textBox = homePagePojo.getTextBox();
		enterText(textBox, "Ram");
	    
	}
	@When("User clicks on Lets shop button")
	public void user_clicks_on_lets_shop_button() {
	    buttonclick(homePagePojo.getLetsShop());
	   
	}
	@When("User picks the price of the product before adding to cart")
	public void user_picks_the_price_of_the_product_before_adding_to_cart() {
		String expected = "Air Jordan 4 Retro";
		WebElement productElement = page.getProductName();
		String actual = productElement.getText();

		Assert.assertEquals(expected, actual);

		System.out.println("User Successfully Added the Cart ");

	}
	@When("User clicks on Add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		buttonclick(checkoutpojo.getAddtoCart());	
	}
	@When("User clicks on the cart Icon")
	public void user_clicks_on_the_cart_icon() {
		buttonclick(checkoutpojo.getCheckOutBox());
		}
		
	    
	    
	@Then("User validates the price of the before and after adding to cart")
	public void user_validates_the_price_of_the_before_and_after_adding_to_cart() {
		
	}
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) throws IOException {
		
		}
		
	}
