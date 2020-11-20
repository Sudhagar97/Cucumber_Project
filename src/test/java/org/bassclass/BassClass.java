package org.bassclass;

import org.apache.poi.common.usermodel.Fill;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BassClass {

	public static WebDriver driver;
	
	public static void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", 
        		"D:\\Users\\Dell\\sudha\\eclipse-workspace\\Cucumbar\\Drivers\\chromedriver.exe");
	}
	
	public static void loadURL(String url) {
        driver.get(url);
	}
	
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);

	}   
	
	public static void butClick(WebElement e, String click) {
		e.click();
        
	}
}
