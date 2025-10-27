package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {

		super(driver);

	}
	
	By emaiInput = By.xpath("//input[@id='input-email']");
	By passInput = By.xpath("//input[@id='input-password']");
	By loginButton = By.xpath("//input[@value='Login']");
	
	public void setEmail(String email) {

		driver.findElement(emaiInput).sendKeys(email);
	}
	
	public void setPassword(String pass) {

		driver.findElement(passInput).sendKeys(pass);
	}
	
	public void clickLoginButton() {

		driver.findElement(loginButton).click();
	}

	
	
}
