package org.SivasProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SivaProject {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
//		
//		AppiumDriverLocalService build = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
//				withIPAddress("127.0.0.1").
//				usingPort(4723).build();
//				
//		build.start();

		UiAutomator2Options uiAutomator2Option = new UiAutomator2Options();
		uiAutomator2Option.setCapability("deviceName", "Sam");
		uiAutomator2Option.setCapability("app", "C:\\Users\\admin\\Downloads\\Manikandan\\App\\ApiDemos-debug.apk");
		//uiAutomator2Option.setChromedriverExecutable("C:\\Users\\admin\\eclipse-workspace\\UsersSet\\src\\test\\resources\\chromedriver.exe");
		//uiAutomator2Option.setCapability("browserName", "Chrome");
		//uiAutomator2Option.setCapability("appPackage", "io.appium.android.apis");
		//uiAutomator2Option.setCapability("appActivity", "io.appium.android.apis.view.ExpandableList1");
		AndroidDriver driver = new AndroidDriver(new URL(" http://127.0.0.1:4723/"), uiAutomator2Option);
		
		
		
		Thread.sleep(2000);
		WebElement viewsElement = driver.findElement(AppiumBy.accessibilityId("Views"));
		viewsElement.click();
		
		
		DeviceRotation landscape = new DeviceRotation(0,0,90);
		driver.rotate(landscape);
		
		
		//Thread.sleep(2000);
		//to perform Long Press
		//WebElement peoplename = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Thread.sleep(2000);
		//js.executeScript("mobile:longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)peoplename).getId() ,"duration", 2000));
		
		
		
		
//		Thread.sleep(2000);
//		WebElement viewsElement = driver.findElement(AppiumBy.accessibilityId("Views"));
//		viewsElement.click();
		
		
		
		
		
		
		//to perform swipe operation
//		WebElement gallery = driver.findElement(AppiumBy.accessibilityId("Gallery"));
//		gallery.click();
//		
//		
//		WebElement photos = driver.findElement(AppiumBy.accessibilityId("1. Photos"));
//		photos.click();
//		
//		WebElement firstImage = driver.findElement(By.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));
//		
//		
//		Thread.sleep(3000);
//		//perform Swipe Operation
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("mobile:swipeGesture",
//		ImmutableMap.of("elementId", ((RemoteWebElement)firstImage).getId() ,"direction", "left","percent", 0.75));
		
//		Thread.sleep(3000);
//		WebElement draganddrop = driver.findElement(AppiumBy.accessibilityId("Drag and Drop"));
//		draganddrop.click();
//		Thread.sleep(3000);
//		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
//		
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("mobile:dragGesture", ImmutableMap.of("elementId", 
//				((RemoteWebElement)source).getId(), "endX", 644, "endY", 671));
		
		

		
		
//		Thread.sleep(3000);
//		WebElement dropdown = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
//		dropdown.click();
//		Thread.sleep(3000);
//		//to perform scroll opeation
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		build.stop();
//		Thread.sleep(3000);
//		WebElement name = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
//		name.sendKeys("Mani");
//		Thread.sleep(3000);
//		WebElement sumbit = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
//		sumbit.click();
//		Thread.sleep(3000);
//		WebElement addtocart = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart'])[1]"));
//		addtocart.click();
//		Thread.sleep(3000);	
//		WebElement atc = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
//		atc.click();
//		Thread.sleep(3000);	
//		WebElement sendme = driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']"));
//		sendme.click();
//		Thread.sleep(3000);	
//		WebElement website = driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed"));
//		website.click();
//		
//		Thread.sleep(10000);
//		Set<String> alltabIds = driver.getContextHandles();
//		System.out.println(alltabIds);
//		List<String> all = new ArrayList();
//		all.addAll(alltabIds);
//		
//		//to switch the control
//		uiAutomator2Option.setChromedriverExecutable("C:\\Users\\admin\\eclipse-workspace\\UsersSet\\src\\test\\resources\\chromedriver.exe");
//		driver.context(all.get(1));
//		
//		
//		Thread.sleep(3000);
//		driver.findElement(By.id("APjFqb")).sendKeys("Application");
		
//		Thread.sleep(5000);
//		WebElement letsshop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
//		letsshop.click();
//		
//		WebElement toastMessage = driver.findElement(By.xpath("//android.widget.Toast"));
//		String attribute = toastMessage.getAttribute("name");
//		System.out.println(attribute);
//		if(attribute.equals("Please enter your name")) {
//			
//			System.out.println("Toast message is validated");
//		}
//		else {
//			
//		System.out.println("Toast message is validated");	
//		}
			
		
		
		
		
			
		}
		
//		Thread.sleep(3000);
//		WebElement viewsElement = driver.findElement(AppiumBy.accessibilityId("Views"));
//		viewsElement.click();
//
//		Thread.sleep(2000);
//		WebElement autocomplete = driver.findElement(AppiumBy.accessibilityId("Auto Complete"));
//		autocomplete.click();
//
//		Thread.sleep(2000);
//		WebElement ScreenTop = driver.findElement(AppiumBy.accessibilityId("1. Screen Top"));
//		ScreenTop.click();
//
//		Thread.sleep(2000);
//		WebElement textbox = driver.findElement(By.id("io.appium.android.apis:id/edit"));
//		//textbox.sendKeys("Application");
//
//		Thread.sleep(2000);
//		WebElement GivemeFocus = driver.findElement(AppiumBy.accessibilityId("Give me Focus"));
//		GivemeFocus.click();
//		driver.setClipboardText("Application");
//		textbox.sendKeys(driver.getClipboardText());
//		
//		Thread.sleep(2000);
//		//to perform key Action 
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		
////		Thread.sleep(2000);
//		//to perform key action
////		driver.pressKey(new KeyEvent(AndroidKey.CONTACTS));
//	
		
		
		
	
	
	
	
	}

