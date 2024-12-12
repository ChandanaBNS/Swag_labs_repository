package com.test;

import static org.testng.Assert.assertSame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.elementStore;

public class swagTest {
	WebDriver driver;
	elementStore es;

	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		es = new elementStore(driver);
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.manage().window().maximize();
	}

	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("TESTCASE_1:Login Functionality check!");
		es.usernameField("standard_user");
		es.passwordField("secret_sauce");
		es.loginButton();
		Thread.sleep(4000);
		String expectedTitle = "Swag Labs";
		String esTitle = driver.getTitle();
		System.out.println(esTitle);
		Assert.assertEquals(esTitle, expectedTitle);// Page title validation

	}

	@Test
	public void testCase2() throws InterruptedException {
		System.out.println("TESTCASE_2: Dropdown Functionality check!");
		testCase1();
		Thread.sleep(4000);
		es.dropDownBoxFieldValue("product_sort_container", "az");
		Thread.sleep(4000);
		es.dropDownBoxFieldIndex("product_sort_container", 1);
		Thread.sleep(4000);
		es.dropDownBoxFieldVisibleText("product_sort_container", "Price (low to high)");
		
		Thread.sleep(4000);
		es.dropDownBoxFieldValue("product_sort_container", "hilo");
		Thread.sleep(4000);
	}

	@Test
	public void testCase3() throws InterruptedException {

		System.out.println("TESTCASE_3:Select product to add for cart!");
		testCase1();
		Thread.sleep(4000);
		es.productOne();
		Thread.sleep(4000);
		es.addToCartButton();

	}

	@Test
	public void testCase4() throws InterruptedException {
		System.out.println("TESTCASE_4:Adding information for checkingout!");
		testCase3();
		Thread.sleep(3000);
		es.shoppingCartClick();
		Thread.sleep(3000);
		es.checkOutButton();
		Thread.sleep(3000);
		es.firstNameField("ABC");
		es.lastNameField("EFG");
		es.postalCodeField("78727");
		Thread.sleep(3000);
		es.continueButton();
		Thread.sleep(4000);

	}

	@Test
	public void testCase5() throws InterruptedException {
		System.out.println("TESTCASE_5:Adding information for checkingout!");
		testCase4();
		es.finishButton();
		Thread.sleep(3000);
		es.orderCompleteStatus();

	}

	@AfterMethod
	public void browserClose() {
		driver.close();
		driver.quit();
	}

}
