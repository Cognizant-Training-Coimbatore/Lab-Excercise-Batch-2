




import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("abcd789@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("abcd1234");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
MultiScreenShot screen =new MultiScreenShot("D:\\stani\\","feb11_screenshot");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver.get("https://www.google.com/");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver,driver.findElement(By.xpath("//*[@id=\"body\"]/center")));
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Samsung");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
    Thread.sleep(5000);
    for (String handle: driver.getWindowHandles()) {
    	   System.out.println(handle);
    	   driver.switchTo().window(handle);

    	  }
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
    
    driver.quit();
  }
}
