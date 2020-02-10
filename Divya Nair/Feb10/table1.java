import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/html%20program.html");
		Thread.sleep(1000);
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> col=table.findElements(By.tagName("td"));
		Thread.sleep(1000);
		System.out.println(col.size());
		driver.quit();

	}

}
