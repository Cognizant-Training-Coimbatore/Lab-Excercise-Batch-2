import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program8_no_of_clms {

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		WebElement table= driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement>clms=table.findElements(By.tagName("td"));
		System.out.println(clms.size());
				
		driver.quit();

	}

}
