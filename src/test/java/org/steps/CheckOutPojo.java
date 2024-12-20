package org.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckOutPojo extends BaseClass {
public CheckOutPojo() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	@AndroidFindBy (xpath = ("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productName' and @text='Air Jordan 4 Retro']"))
	private WebElement ProductName;
	@AndroidFindBy (xpath = ("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]"))
	private WebElement AddtoCart;
	@AndroidFindBy (xpath = ("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']"))
	private WebElement CheckOutBox;
	public WebElement getCheckOutBox() {
		return CheckOutBox;
	}


	public void setCheckOutBox(WebElement checkOutBox) {
		CheckOutBox = checkOutBox;
	}


	public WebElement getProductName() {
		return ProductName;
	}


	public void setProductName(WebElement productName) {
		ProductName = productName;
	}
	
	


	public WebElement getAddtoCart() {
		return AddtoCart;
	}


	public void setAddtoCart(WebElement addtoCart) {
		AddtoCart = addtoCart;
	}

}