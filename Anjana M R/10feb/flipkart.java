import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwihh5HK3MbnAhUKDisKHYtiBAEYABAAGgJzZg&ohost=www.google.com&cid=CAESQOD2YqUct1Z9-_5SLALmTVTpbeIybxVvief9Nb2YUjHGpPG3kz2HlVrYC4QujUAM-ai_o-6O0OqKfptDnWL3RxQ&sig=AOD64_09I9TgI9DIz6bpzp4GYrTfYRQdxQ&q=&ved=2ahUKEwjq4YjK3MbnAhVixjgGHY2TBAMQ0Qx6BAgIEAE&adurl=");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7025795508");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("a123456#");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.name("q")).sendKeys("sling bag");
	  Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[3]/div/div[4]/div/a/div[1]/div/div/div/img")).click();
	    Thread.sleep(5000);
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();
	    Thread.sleep(5000);
	    driver.quit();
	
	}
	

}
