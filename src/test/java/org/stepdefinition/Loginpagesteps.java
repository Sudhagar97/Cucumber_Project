package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagesteps {
	static WebDriver driver;
	@Given("user has to be there in fb page")
	public void user_has_to_be_there_in_fb_page() {
	   System.setProperty("webdriver.chrome.driver",
			   "D:\\Users\\Dell\\sudha\\eclipse-workspace\\Cucumbar\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	}

	@When("user as to fill username and password")
	public void user_as_to_fill_username_and_password(io.cucumber.datatable.DataTable string) {
	    throw new cucumber.api.PendingException();
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.id("loginbutton")).click();
       	}

	@Then("user has to navigate to homepage")
	public void user_has_to_navigate_to_homepage() {
		System.out.println("user as to navigate to Home");
	}


}
