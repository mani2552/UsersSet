package org.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePagePojo extends BaseClass {
	public HomePagePojo() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private WebElement dropDown;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement textBox;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsShop;

	public WebElement getDropDown() {
		return dropDown;
	}

	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}

	public WebElement getTextBox() {
		return textBox;
	}

	public void setTextBox(WebElement textBox) {
		this.textBox = textBox;
	}

	public WebElement getLetsShop() {
		return letsShop;
	}

	public void setLetsShop(WebElement letsShop) {
		this.letsShop = letsShop;
	}
	
	
	
}
