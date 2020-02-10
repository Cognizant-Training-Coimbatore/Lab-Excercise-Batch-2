import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3_q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[4]/table/tbody"));
		List rows=table.findElements(By.tagName("tr"));
		if(rows.size()==3)
			System.out.println("Row verification successfull");
		else
			System.out.println("Row verification unsuccessfull");
		Thread.sleep(2000);
		driver.quit();
	}

}
