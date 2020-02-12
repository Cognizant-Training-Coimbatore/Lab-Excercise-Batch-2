package webDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/test/blaa.html");
				WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
				List<WebElement> rows=table.findElements(By.tagName("td"));
				System.out.println(rows.size());
				Thread.sleep(5000);
				driver.quit();

	}

}
