package appiumtests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try{
			openCalculator();
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		  
		cap.setCapability("deviceName", "TECNO POP 2 Power");
		cap.setCapability("udid", "042461195A014422");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.transsion.calculator");
		cap.setCapability("appActivity", "com.transsion.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		driver.findElement(By.id("com.transsion.calculator:id/digit_2")).click();
		driver.findElement(By.id("com.transsion.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.transsion.calculator:id/digit_6")).click();
		driver.findElement(By.id("com.transsion.calculator:id/eq")).click();
		
		System.out.println("Application Started...");
		
	}

}
