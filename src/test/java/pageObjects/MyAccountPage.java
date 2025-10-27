package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {

		super(driver);

	}

	By visibleText = By.xpath("//h2[normalize-space()='My Account']");
	By logoutBt = By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']");

	public boolean isMyAccountPageExists() {

		try {

			return (driver.findElement(visibleText).isDisplayed());
		} catch (Exception e) {

			return false;

		}

	}

	public void clickLogout() {

		driver.findElement(logoutBt).click();
	}

}
