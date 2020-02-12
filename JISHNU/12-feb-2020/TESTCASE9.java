package feb_12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTCASE9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase9.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		WebElement item=table.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[5]"));
		System.out.println(item.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
