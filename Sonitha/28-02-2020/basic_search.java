package shaadiApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class basic_search
	{
		private WebDriver driver;
	
		//page URL
		private static String url="https://www.shaadi.com/search?search_type=basic_search&loc=top-nav";
		public basic_search(WebDriver driver)
		{
			this.driver = driver;
			driver.get(url);
			PageFactory.initElements(driver,this);
			
		}

		public void test1() throws InterruptedException
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
				 
				 driver.findElement(By.xpath("//*[@id=\"basic\"]/div[4]/a/span[1]")).click();
			  
			
		}

}
