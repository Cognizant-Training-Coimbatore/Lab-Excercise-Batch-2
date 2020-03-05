import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class basicSearch {

	WebDriver driver;
	Select brideorgroom,ageFrom,ageTo,heightFrom,heightTo,community;
	
	basicSearch(WebDriver driver) {
		this.driver=driver;
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
	
	void selectCommunity(String s)
	{
		community = new Select(driver.findElement(By.id("ddlcaste")));
		community.selectByVisibleText(s);
	}
	
	void clickSearch()
	{
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnklogin")).click();
	}

}
