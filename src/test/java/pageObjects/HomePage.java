package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {

		super(driver);
	}

	By btMyAccount = By.xpath("//span[normalize-space()='My Account']");
	By btRegister = By.xpath("(//a[normalize-space()='Register'])[1]");
	By btLogin = By.xpath("(//a[normalize-space()='Login'])[1]");

	public void clickMyAccount() {

		driver.findElement(btMyAccount).click();
	}

	public void clickRegister() {

		driver.findElement(btRegister).click();
	}

	public void clickLogin() {

		driver.findElement(btLogin).click();
	}

}
