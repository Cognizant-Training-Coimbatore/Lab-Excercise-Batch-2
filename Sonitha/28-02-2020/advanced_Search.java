package shaadiApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class advanced_Search 
{
	private WebDriver driver;
	
	//page URL
	private static String url="https://www.shaadi.com/search?search_type=smart_search&loc=top-nav";
	public advanced_Search(WebDriver driver)
	{
		this.driver = driver;
		driver.get(url);
		PageFactory.initElements(driver,this);
		
	}
	
	public void test2() throws InterruptedException
	{
		 

		  driver.findElement(By.id("gender-Female")).click();
		  Select sel = new Select(driver.findElement(By.id("agefrom")));
		  sel.getFirstSelectedOption();
		  
		  Select sel1 = new Select(driver.findElement(By.id("ageto")));
		  sel1.selectByValue("24");
		  Thread.sleep(1000);
		  Select heightfrom = new Select(driver.findElement(By.id("heightfrom")));
		  heightfrom.selectByIndex(9);
		  Thread.sleep(1000);
		  Select heightto = new Select(driver.findElement(By.id("heightto")));
		  heightto.selectByIndex(17);
		  Thread.sleep(1000);
		  
		
		 WebElement maritalstatusdropdown = driver.findElement(By.id("ddOptHolder_maritalstatus"));
		 maritalstatusdropdown.click();
		
		 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_maritalstatus\"]/ul/li[2]")).click();
		 maritalstatusdropdown.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("photograph-Visible")).click();
		 
		 WebElement religion = driver.findElement(By.xpath("//*[@id=\"ddSelOptHolder_community\"]"));
		 religion.click();
		 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_community\"]/ul/li[3]")).click();
		 religion.click();
		 Thread.sleep(2000);
		
		 driver.findElement(By.id("children-No")).click();
		 driver.findElement(By.id("photograph-Visible")).click();
		 
			WebElement mothertongue = driver.findElement(By.xpath("//*[@id=\"ddSelOptHolder_mothertongue\"]"));
			 mothertongue.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_mothertongue\"]/ul/li[3]")).click();
			 mothertongue.click();
			 Thread.sleep(2000);

			 driver.findElement(By.id("children-No")).click();
			 driver.findElement(By.id("photograph-Protected")).click();
			 
			 WebElement caste= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_caste\"]"));
			 caste.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_caste\"]/ul/li[4]")).click();
			 caste.click();
			 Thread.sleep(2000);
		 
			 driver.findElement(By.id("children-No")).click();
			 
			 //Location and Grew up in details
			 driver.findElement(By.id("location_details")).click();
			 
			 WebElement country= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_countryofresidence\"]"));
			 country.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_countryofresidence\"]/ul/li[4]")).click();
			 country.click();
			 Thread.sleep(2000);
			 
           driver.findElement(By.id("children-No")).click();
			 
			 WebElement state= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_stateofresidence\"]"));
			 state.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_stateofresidence\"]/ul/li[4]")).click();
			 state.click();
			 Thread.sleep(2000);
			 
           driver.findElement(By.id("children-No")).click();
			 
			 WebElement city= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_nearest_city\"]"));
			 city.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_nearest_city\"]/ul/li[4]")).click();
			 city.click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("children-No")).click();
			 
			 WebElement residency= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_residencystatus\"]"));
			 residency.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_residencystatus\"]/ul/li[2]")).click();
			 residency.click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("children-No")).click();
			 
			 WebElement countrygrewup= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_grew_up_in\"]"));
			 countrygrewup.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_grew_up_in\"]/ul/li[4]")).click();
			 countrygrewup.click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("children-No")).click();
			 driver.findElement(By.xpath("//*[@id=\"smart\"]/div[1]/div/div[12]")).click();
			 
			 WebElement education= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_education\"]"));
			 education.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_education\"]/ul/li[4]")).click();
			 education.click();
			 Thread.sleep(2000);
			 //ok
			 
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			   js.executeScript("window.scrollBy(0,1000)");
			 driver.findElement(By.id("avchat-Yes")).click();
			 
			 WebElement educationarea= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_education_area\"]"));
			 educationarea.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_education_area\"]/ul/li[4]")).click();
			 educationarea.click();
			 Thread.sleep(5000);
			 
			 driver.findElement(By.id("avchat-Yes")).click();
			 
			 WebElement workingwith= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_working_with\"]"));
			 workingwith.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_working_with\"]/ul/li[4]")).click();
			 workingwith.click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("avchat-Yes")).click();
			 
			 WebElement occupation_area= driver.findElement(By.xpath("//*[@id=\"ddOptHolder_occupation_area\"]"));
			 occupation_area.click();
			 driver.findElement(By.xpath("//*[@id=\"ddOptionHolder_occupation_area\"]/ul/li[4]")).click();
			 occupation_area.click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("avchat-Yes")).click();
			 driver.findElement(By.id("annualincome_applicable-")).click();
			 driver.findElement(By.xpath("//*[@id=\"habit_details\"]")).click();
	
			 
			 driver.findElement(By.id("dietarray-OccasionallyNon-VegNon-Veg")).click();
			 driver.findElement(By.id("smokearray-No")).click();
			 driver.findElement(By.id("drinkarray-No")).click();
			 driver.findElement(By.id("bodytypearray-Slim")).click();
			 driver.findElement(By.id("complexionarray-VeryFairFair")).click();
			 driver.findElement(By.id("avchat-Yes")).click();
			 driver.findElement(By.id("postedbyarray-Self")).click();
			 
			 driver.findElement(By.xpath("//*[@id=\"smart\"]/div[4]/a/span[1]")).click();
			 Thread.sleep(5000);
			
	}
}
