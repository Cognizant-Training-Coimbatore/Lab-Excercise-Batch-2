package batch2Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3_enter_into_textbox {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/ctsapp.html");
System.out.println(driver.getTitle());
driver.findElement(By.id("txt1")).sendKeys("parvati123");
Thread.sleep(2000);
String s=driver.findElement(By.id("txt1")).getAttribute("value");
System.out.println(s.length());
driver.quit();
	}

}
