package feb10;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9400914637");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9496239883");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("ipad 6th gen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")).click();
		Thread.sleep(10000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		String s=driver.getCurrentUrl();
		System.out.println(s);
		//driver.findElement(By.name("q")).sendKeys("ipad 7th gen");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[3]/div/form/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"CNTCT3F4510DD26CE44EEA8B6FD33A\"]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();
		Thread.sleep(7000);
		//driver.quit();
	}

}
