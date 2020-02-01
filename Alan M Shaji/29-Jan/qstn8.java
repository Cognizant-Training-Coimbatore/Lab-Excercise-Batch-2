package seleniumDriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qstn8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("sarath@mail.com");
		password.sendKeys("password");
		WebElement logIN=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		logIN.click();
		Thread.sleep(1000);
		
		WebElement search_bar=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		search_bar.click();
		Thread.sleep(1000);
		
		search_bar.sendKeys("14.1-inch Laptop");
		Thread.sleep(1000);
		
		
		WebElement search=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]"));
		search.click();
		Thread.sleep(1000);
		
		WebElement addToCart=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
		addToCart.click();
		Thread.sleep(3000);
		
		WebElement cart=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a"));
		cart.click();
		Thread.sleep(2000);
	
		
		WebElement check=driver.findElement(By.id("termsofservice"));
		check.click();
		Thread.sleep(1000);

		
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		/*
		WebElement address=driver.findElement(By.xpath("//*[@id=\"billing-address-select\"]"));
		checkout.click();
		Thread.sleep(1000);
		
		address.sendKeys("ABC,A,B,32232");
		
		*/
		WebElement cont1=driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
		cont1.click();
		Thread.sleep(1000);
	
		WebElement cont2=driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		cont2.click();
		Thread.sleep(1000);
		
		WebElement cont3=driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));
		cont3.click();
		Thread.sleep(1000);
		
		
		WebElement cont4=driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input"));
		cont4.click();
		Thread.sleep(1000);
		
		WebElement cont5=driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input"));
		cont5.click();
		Thread.sleep(1000);
		
		WebElement cont6=driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));
		cont6.click();
		Thread.sleep(5000);

		WebElement cont7=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input"));
		cont7.click();
		Thread.sleep(1000);
		
		
		Thread.sleep(6000);
		driver.quit();
	}

	}

