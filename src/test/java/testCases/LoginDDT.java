package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

/* Data is valid - login success - test pass - logout
 * Data is valid - login failed - test fail
 * 
 * Data is invalid - login success - test fail -logout
 * Data is invaild - login failed - test pass
 */

public class LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = utilities.DataProviders.class, groups = "Datadriven") // Getting
																												// data
																												// provider
																												// from
	// different
	// class.
	public void verify_loginDDT(String email, String pwd, String exp) {

		logger.info("***** Starting LoginDDT ******");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			// LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLoginButton();

			// MyAccountPage
			MyAccountPage macc = new MyAccountPage(driver);
			boolean targetPage = macc.isMyAccountPageExists();

			if (exp.equalsIgnoreCase("Valid")) {

				if (targetPage == true) {

					macc.clickLogout();
					Assert.assertTrue(true);

				} else {

					Assert.assertTrue(false);

				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {

				if (targetPage == true) {

					macc.clickLogout();
					Assert.assertTrue(false);

				} else {

					Assert.assertTrue(true);

				}

			}

		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("***** Finished LoginDDT ******");
	}
}
