package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");//to open the web page
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		WebElement fish,abv,addcart,add;
		
		fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		abv=driver.findElement(By.linkText("FI-SW-01"));
		abv.click();
		Thread.sleep(2000);
		addcart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addcart.click();
		Thread.sleep(2000);
		add=driver.findElement(By.id("lines0.quantity"));
		add.sendKeys("0");
		Thread.sleep(2000);
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}
