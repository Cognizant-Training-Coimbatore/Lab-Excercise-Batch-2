package selenium_examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\javaprograms\\\\selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
		

	}

}
