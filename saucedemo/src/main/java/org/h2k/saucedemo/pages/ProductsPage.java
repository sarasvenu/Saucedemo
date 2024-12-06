package org.h2k.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String addToCart() {
	 	//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//return 	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).getText();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		return driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).getText();
		
		
		//driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		//return driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")).getText();
		
		
		
	}
	public String navigateToCart() {
	 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,0)");
		
		//driver.findElement(By.id("shopping_cart_link")).click();
		//return driver.findElement(By.id("inventory_item_name")).getText();
		
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		return driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();   //element not interactable exception
		//return driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		//return driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).getText();
		//return driver.findElement(By.linkText("Sauce Labs Backpack")).getText();
		
		//return driver.findElement(By.xpath("//div[@class='cart_desc_label']")).getText();  
		
		
	}
}
