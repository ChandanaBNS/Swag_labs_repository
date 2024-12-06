package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class elementStore {

	// Global variable
	public WebDriver driver;

	// driver initialization constructor
	public elementStore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	WebElement usernameTextField;

	@FindBy(id = "password")
	WebElement passwordTextField;

	@FindBy(id = "login-button")
	WebElement loginButton;

	@FindBy(className = "product_sort_container")
	WebElement dropDownBoxFieldElement;

	@FindBy(id = "first-name")
	WebElement firstNameField;

	@FindBy(id = "last-name")
	WebElement lastNameField;

	@FindBy(id = "postal-code")
	WebElement postalCodeField;

	@FindBy(xpath ="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement continueButton;

	@FindBy(id = "item_4_title_link")
	WebElement productFour;

	@FindBy(id = "item_0_title_link")
	WebElement productZero;

	@FindBy(id = "item_1_title_link")
	WebElement productOne;

	@FindBy(id = "item_5_title_link")
	WebElement productFive;

	@FindBy(id = "item_2_title_link")
	WebElement productTwo;

	@FindBy(id = "item_3_title_link")
	WebElement productThree;

	@FindBy(xpath ="//*[@id=\"inventory_item_container\"]/div/div/div/button")
	WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/svg")
	WebElement shoppingCartClick;

	public void usernameField(String value1) {
		usernameTextField.sendKeys(value1);
	}

	public void passwordField(String value2) {
		passwordTextField.sendKeys(value2);
	}

	public void loginButton() {
		loginButton.click();
	}

	public void dropDownBoxFieldIndex(String value3, int index) {
		Select value = new Select(dropDownBoxFieldElement);
		value.selectByIndex(index);
	}

	public void dropDownBoxFieldValue(String value4, String value5) {
		Select value = new Select(dropDownBoxFieldElement);
		value.selectByValue(value5);
	}

	public void dropDownBoxFieldVisibleText(String value4, String value6) {
		Select value = new Select(dropDownBoxFieldElement);
		value.selectByVisibleText(value6);
	}

	public void firstNameField(String value7) {
		firstNameField.sendKeys(value7);
	}

	public void lastNameField(String value8) {
		lastNameField.sendKeys(value8);
	}

	public void postalCodeField(String value9) {
		postalCodeField.sendKeys(value9);
	}

	public void continueButton() {
		continueButton.click();
	}

	public void productZero() {
		productZero.click();
	}

	public void productOne() {
		productOne.click();
	}

	public void productTwo() {
		productTwo.click();
	}

	public void productThree() {
		productThree.click();
	}

	public void productFour() {
		productFour.click();
	}

	public void productFive() {
		productFive.click();
	}

	public void addToCartButton() {
		addToCartButton.click();
	}
	
	public void shoppingCartClick() {
		shoppingCartClick.click();
	}

}
