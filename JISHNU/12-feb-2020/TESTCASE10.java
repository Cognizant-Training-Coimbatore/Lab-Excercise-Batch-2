package feb_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTCASE10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase10.html");
		driver.findElement(By.id("b1")).click();
		Alert alert=driver.switchTo().alert();
		String s=alert.getText();
		alert.accept();
		String sub=s.substring(s.length()-2);
		System.out.println(sub);
		driver.findElement(By.id("t1")).sendKeys(sub);
		driver.findElement(By.id("b2")).click();
		String res=driver.findElement(By.id("result")).getText();
		System.out.println(res);
		driver.quit();

	}

}
