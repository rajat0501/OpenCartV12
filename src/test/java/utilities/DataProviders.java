package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	// DataProvider 1

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {

		String path = ".\\testData\\Opencart_LoginData.xlsx"; // taking xl file from testData

		ExcelUtility xlUtil = new ExcelUtility(path); // creating an object for XLUtility

		int totalrows = xlUtil.getRowCount("Sheet1");
		int totalcols = xlUtil.getCellCount("Sheet1", 1);

		String loginData[][] = new String[totalrows][totalcols];// created for two dimensional array which can store
																// data

		for (int i = 1; i <= totalrows; i++) // 1 // read the data from xl storing in tow dimensional array
		{
			for (int j = 0; j < totalcols; j++)// 0 // i is rows j is col
			{

				loginData[i - 1][j] = xlUtil.getCellData("Sheet1", i, j); // 1, 0

			}

		}
		
		return loginData; // returning two dimensional array

	}
	
	// DataProvider 2
	
	// DataProvider 3
	
	// DataProvider 4
	
}
