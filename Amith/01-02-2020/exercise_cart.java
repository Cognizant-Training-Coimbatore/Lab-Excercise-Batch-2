package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise_cart {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.click();
		search.sendKeys("laptop");
		WebElement searchbutton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		searchbutton.click();
		WebElement addcart=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
		addcart.click();
		WebElement gocart=driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a"));
		gocart.click();
		WebElement acc=driver.findElement(By.id("termsofservice"));
		acc.click();
		WebElement out=driver.findElement(By.id("checkout"));
		out.click();
		WebElement gst=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]"));
		gst.click();
		WebElement name1=driver.findElement(By.id("BillingNewAddress_FirstName"));
		name1.sendKeys("amith");
		WebElement name2=driver.findElement(By.id("BillingNewAddress_LastName"));
		name2.sendKeys("c");
		WebElement email=driver.findElement(By.id("BillingNewAddress_Email"));
		email.sendKeys("amithpalappatttttta@gmail.com");
		WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));
		company.sendKeys("cts");
		Select product=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		product.selectByValue("India");
		
		Thread.sleep(3000);

	}
	

}
