import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_feb10_eg1class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/asha/webdrive.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> rows=table.findElements(By.tagName("td"));
		System.out.println(rows.size());
		driver.quit();
		
		

	}

}
