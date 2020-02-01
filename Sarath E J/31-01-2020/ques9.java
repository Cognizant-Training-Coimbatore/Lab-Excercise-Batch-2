package webdriverdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ques9 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		
		WebElement email,password;
		email = driver.findElement(By.name("Email"));
		password = driver.findElement(By.name("Password"));
		email.sendKeys("jomon@xyz.com");
		password.sendKeys("jomongeorge");
		
		WebElement rem = driver.findElement(By.name("RememberMe"));
		rem.isSelected();
		
		WebElement log = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		log.click();
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		search.click();
		search.sendKeys("laptop");
		Thread.sleep(2000);
		
	
		WebElement sea = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		sea.click();
		Thread.sleep(2000);
		
		
		WebElement cart = driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement car = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a"));
		car.click();
		Thread.sleep(2000);
		
		
		Select product = new Select(driver.findElement(By.name("CountryId")));
		product.selectByVisibleText("India");
		
		WebElement term = driver.findElement(By.id("termsofservice"));
		term.click();
		
		WebElement out = driver.findElement(By.id("checkout"));
		out.click();
		
		Select co = new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
		co.selectByVisibleText("India");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
		city.sendKeys("city");
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
		add.sendKeys("coim");
		
		WebElement xyz = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
		xyz.sendKeys("123");
		
		WebElement yy = driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
		yy.sendKeys("2222");
		
		
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		cont.click();

	}

}
