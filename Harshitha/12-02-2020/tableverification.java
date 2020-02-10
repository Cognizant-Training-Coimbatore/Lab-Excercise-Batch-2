

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableverification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\table1.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		Thread.sleep(2000);
		driver.quit();
		
	}

}
