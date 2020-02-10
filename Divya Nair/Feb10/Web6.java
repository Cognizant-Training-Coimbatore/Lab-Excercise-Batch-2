import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		Thread.sleep(1000);
		WebElement table=driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		Thread.sleep(1000);
		System.out.println(rows.size());
		WebElement tablecol=driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody/tr[1]"));
		List<WebElement> col=tablecol.findElements(By.tagName("th"));
		Thread.sleep(1000);
		System.out.println(col.size());
		driver.quit();

	}

}
