package com.assesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class BaseTest {
	WebDriver driver;
	
	@BeforeTest
	
	public void before() throws MalformedURLException, InterruptedException {
	
			UiAutomator2Options options=new UiAutomator2Options();
			options.setDeviceName("jugal");
//			options.setApp("D:\\appium\\apk file\\General-Store.apk");
			options.setApp("D:\\appium\\apk file\\facebook_lite_v321.0.0.13.113.apk");
			 driver=new AndroidDriver
					(new URL("http://127.0.0.1:4723/"),options);
			 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 Thread.sleep(2000);
			}
//	public void dragndrop(WebElement source) {
//		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
//			    "elementId", ((RemoteWebElement) source).getId(),
//			    "endX", 719,
//			    "endY", 960));
//	}
//	
//	public void longPressAction(WebElement ele)
//	{
//		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
//				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
//						"duration",2000));
//	}
//	
//	public void swipeAction(WebElement ele,String direction)
//	{
//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement)ele).getId(),
//			 
//			    "direction", direction,
//			    "percent", 0.15
//			));		
//	}
//	public void seekbar(WebElement slider) {
//		
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))
//		.release()
//		.perform();
//
//		
//		int xAxisStartPoint=slider.getLocation().getX();
//		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();
//		int yAxisStartPoint=slider.getLocation().getY();
//		
//		
//		TouchAction action=new TouchAction(driver);
//		
//		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))
//		.moveTo(PointOption.point(xAxisEndPoint-50,yAxisStartPoint))
//		.release()
//		.perform();
//		
//		//Get start point of seekbar.
//	       int startX = seekBar.getLocation().getX();
//	       System.out.println(startX);
//	    
//	      //Get vertical location of seekbar.
//	       int startY = seekBar.getLocation().getY();
//	       System.out.println(startY);
//	    
//	       //Get end point of seekbar.
//	       int endX = seekBar.getSize().getWidth();
//	       System.out.println(endX);
//	    
//	    
//	       //Set seekbar move to position.
//	       //endX * 0.6 means at 60% of seek bar width.
//	      //endX * 0.9 means at 100% of seek bar width.
//	       int moveToXDirectionAt = (int) (endX * 0.90);
//	       System.out.println("Moving seek bar at " + moveToXDirectionAt+" In X direction.");
//	    
//	       //Moving seekbar using TouchAction class.
//	       TouchAction act=new TouchAction(driver);
//	       act.press(PointOption.point(startX,startY)).moveTo(PointOption.point(moveToXDirectionAt,startY)).release().perform();
//	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
		
	}




}
