package batch2Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day_3_program_1_we_table {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		WebElement table=driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody"));
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		driver.quit();
	}

}
