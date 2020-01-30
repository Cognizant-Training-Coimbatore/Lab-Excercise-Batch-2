package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2new {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //which browser to use
				WebDriver driver=new ChromeDriver();     
				driver.get("http://jpetstore.cfapps.io/");//open webpage
				WebElement login=driver.findElement(By.linkText("Enter the Store"));  //to give link
				login.click();   //open page  and will click on login on next page
				Thread.sleep(2000);
				WebElement login1=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));  //to give link
				login1.click();
				Thread.sleep(2000);
				WebElement fish,cart,add;
				fish=driver.findElement(By.linkText("F1-SW-01"));
				fish.click();
				Thread.sleep(2000);
				cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
				cart.click();
				Thread.sleep(2000);
				add=driver.findElement(By.id("lines0.quantity"));
				add.sendKeys("0");
				Thread.sleep(2000);
				String s=driver.getTitle();
				System.out.println(s); 
				driver.quit();
	}

}
