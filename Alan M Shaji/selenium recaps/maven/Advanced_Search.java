import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Advanced_Search {

	WebDriver driver;
	WebElement username,password;
	Select brideorgroom,ageFrom,ageTo,heightFrom,heightTo,community;
	String URL = "https://www.chavaramatrimony.com/quick-serach-mobile.aspx";
	Advanced_Search(WebDriver driver) {
	this.driver=driver;
	}

	void launch() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
	}
	void selectBrideOrGroom(String s)
	{
	brideorgroom = new Select(driver.findElement(By.id("ddlgender")));
	brideorgroom.selectByVisibleText(s);
	}

	void selectAgeFrom(String s)
	{
	ageFrom = new Select(driver.findElement(By.id("ddlagefrom")));
	ageFrom.selectByVisibleText(s);
	}

	void selectAgeTo(String s)
	{
	ageTo = new Select(driver.findElement(By.id("ddlageto")));
	ageTo.selectByVisibleText(s);
	}

	void selectHeightFrom(String s)
	{
	heightFrom = new Select(driver.findElement(By.id("ddlhfrom")));
	heightFrom.selectByVisibleText(s);
	}

	void selectHeightTo(String s)
	{
	heightTo = new Select(driver.findElement(By.id("ddlhto")));
	heightTo.selectByVisibleText(s);
	}

	void selectCommunity(String s) throws InterruptedException
	{
	community = new Select(driver.findElement(By.id("ddlcaste")));
	community.selectByVisibleText(s);
	}
	void clickOnSearch() throws InterruptedException
	{
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnklogin")).click();
		Thread.sleep(1900);
	}
	void screenshots() throws IOException, InterruptedException {
		Thread.sleep(4000);
		TakesScreenshot scrShot =((TakesScreenshot)driver);
         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         File DestFile=new File("D:\\Screenshots\\AdvancedSearch.png");
         FileUtils.copyFile(SrcFile, DestFile);
	}

}
