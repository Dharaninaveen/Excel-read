package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClassDataPara {

	@Test(dataProvider="sendData")
	public void createLeadRun(String company,String fName,String lName,String number) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(number);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider
	public String[][] sendData() {
		String[][] data=new String[3][4];
		data[0][0]="TestLeaf";
		data[0][1]="Dharani";
		data[0][2]="R";
		data[0][3]="99345";
		
		data[1][0]="TestLeaf";
		data[1][1]="Hari";
		data[1][2]="R";
		data[1][3]="98";
		
		
		data[2][0]="TestLeaf";
		data[2][1]="Sheriba";
		data[2][2]="T";
		data[2][3]="99";
		
		return data;
		
	}
}
