package org.steps;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public static AndroidDriver driver;

	//user defined Method 
	//Original Logic
	//Input - Argument ,Output - Return Type
	public static void appLaunch(String deviceName,String app) throws MalformedURLException {
		
		AppiumDriverLocalService build = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();

		build.start();

		UiAutomator2Options uiAutomator2Option = new UiAutomator2Options();
		uiAutomator2Option.setCapability("deviceName", deviceName);
		uiAutomator2Option.setCapability("app", app);
		
		
		driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/"), uiAutomator2Option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		
		
	}
	public static void buttonclick(WebElement element) {
		element.click();
		
		
	}
	public static void enterText(WebElement element, String textToPass) {
		
		element.sendKeys(textToPass);
		
	}
	public static void scrolluptotext(String textValue ) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+textValue+"\"));"));

	}
	
	public static void contextHandling(WebElement element, WebElement element1) {
		Set<String> allTabs = driver.getContextHandles();
		List<String> allTabsList=new ArrayList<String>();
		for (String a : allTabs) {
			System.out.println(a);
			allTabsList.add(a);
		}
		System.out.println(allTabsList);
		
		driver.context(allTabsList.get(1));

	
	}
	
	
}