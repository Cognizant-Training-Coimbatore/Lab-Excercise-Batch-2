package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement st=driver.findElement(By.linkText("Enter the Store"));
		st.click();
		String s=driver.getTitle();
		WebElement st1=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		st1.click();
		WebElement obj=driver.findElement(By.linkText("FI-SW-01"));
		obj.click();
		Thread.sleep(5000);
		WebElement st3=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		st3.click();
		WebElement qnt;
		qnt=driver.findElement(By.id("lines0.quantity"));
		qnt.clear();
		qnt.sendKeys("10");
		System.out.println(s);
		driver.quit();

	}

}
