package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_Q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement element = driver.findElement(By.linkText("Enter the Store"));
		element.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		Thread.sleep(2000);
		fish.click();
		WebElement fishcode = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		Thread.sleep(2000);
		fishcode.click();
		WebElement add = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		Thread.sleep(2000);
		add.click();
		WebElement qty = driver.findElement(By.id("lines0.quantity"));
		Thread.sleep(2000);
		qty.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
	}

}
