import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.drtiver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will give delay in each steps.
driver.get("http://demowebshop.tricentis.com");
driver.findElement(By.linkText("Log in1")).click();
driver.quit();

	}

}
