package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccountPage extends BasePage {

	public RegisterAccountPage(WebDriver driver) {

		super(driver);
	}

	By fname = By.xpath("//input[@id='input-firstname']");
	By lname = By.xpath("//input[@id='input-lastname']");
	By email = By.xpath("//input[@id='input-email']");
	By telPhone = By.xpath("//input[@id='input-telephone']");
	By pwd = By.xpath("//input[@id='input-password']");
	By cnPwd = By.xpath("//input[@id='input-confirm']");
	By btagree = By.xpath("//input[@name='agree']");
	By btcon = By.xpath("//input[@value='Continue']");
	By confirmationMessage = By.xpath("//h1[text()='Your Account Has Been Created!']");

	public void setFirstName(String firstName) {

		driver.findElement(fname).sendKeys(firstName);

	}

	public void setLastName(String lastName) {

		driver.findElement(lname).sendKeys(lastName);
	}

	public void setEmail(String inEmail) {

		driver.findElement(email).sendKeys(inEmail);
	}

	public void setTelephone(String inTelephone) {

		driver.findElement(telPhone).sendKeys(inTelephone);
	}

	public void setPassword(String inpwd) {

		driver.findElement(pwd).sendKeys(inpwd);
	}

	public void setConfirmPassword(String cninpwd) {

		driver.findElement(cnPwd).sendKeys(cninpwd);
	}

	public void clickAgreeBt() {

		driver.findElement(btagree).click();
	}

	public void clickConfirmBt() {

		driver.findElement(btcon).click();
	}

	public String getConfirmationMsg() {

		try {
			return driver.findElement(confirmationMessage).getText();
		} catch (Exception e) {
			return e.getMessage();
		}

	}

}
