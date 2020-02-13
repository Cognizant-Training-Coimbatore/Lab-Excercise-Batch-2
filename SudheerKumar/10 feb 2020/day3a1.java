import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3a1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver","Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/cts/day3.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		driver.quit();// TODO Auto-generated method stub// TODO Auto-generated method stub

	}

}
