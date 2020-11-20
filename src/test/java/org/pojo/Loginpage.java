package org.pojo;

import org.bassclass.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Loginpage extends BassClass {
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;

	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="search")
	private WebElement btclick;

	private WebElement getUsername() {
		return username;
	}

	private WebElement getPassword() {
		return password;
	}

	private WebElement getBtclick() {
		return btclick;
	}
}
