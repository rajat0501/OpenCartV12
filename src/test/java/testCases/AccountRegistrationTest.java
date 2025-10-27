package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterAccountPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	@Test(groups = { "Regression", "Master" })
	public void Register() {

		logger.info("*****  Starting AccountRegistrationTest *****");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link");
			hp.clickRegister();
			logger.info("Clicked on Register Link");
			RegisterAccountPage rp = new RegisterAccountPage(driver);
			logger.info("Providing customer details");
			rp.setFirstName(randomString().toUpperCase());
			rp.setLastName(randomString().toUpperCase());
			rp.setEmail(randomString() + "@gmail.com");
			rp.setTelephone(randomNumber());
			String password = randomAlphaNumeric();
			rp.setPassword(password);
			rp.setConfirmPassword(password);
			rp.clickAgreeBt();
			rp.clickConfirmBt();
			logger.info("Validating expected message.");
			String confmsg = rp.getConfirmationMsg();
			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);

			} else {
				logger.error("Test failed..");
				logger.debug("Debug logs..");
				Assert.assertTrue(false);
			}
			// Assert.assertEquals(confmsg, "Your Account Has Been Created!!!");
		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("***** Finished AccountRegistrationTest *****");

	}

}
