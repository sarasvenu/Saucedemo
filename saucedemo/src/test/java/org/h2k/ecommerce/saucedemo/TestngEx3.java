package org.h2k.ecommerce.saucedemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestngEx3 {

	@Test(groups= {"sanity","regression"})
	public void login(){//failed
		
		assertEquals(false,true);

	}
	@Test(dependsOnMethods={"login"},alwaysRun=true)//skipped
	public void search(){

	}
	@Test(dependsOnMethods={"search"},alwaysRun=true)//skipped
	public void addToCart(){

	} 
}