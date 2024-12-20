package org.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPagePojo extends BaseClass {
public ProductPagePojo() {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
	



}