package org.h2k.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout()
	{
		//logout
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();  //open menu
		driver.findElement(By.id("logout_sidebar_link")).click();  //click on logout 
	}

}
