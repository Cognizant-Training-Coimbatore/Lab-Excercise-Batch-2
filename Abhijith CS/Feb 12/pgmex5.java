import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

public class pgmex5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ExtentReports report = new ExtentReports("rep_ex4.html");
		//ExtentTest test=report.startTest("pgmex4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/ABHIJITH%20C%20S/exercise/testcase5.html.html");
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement table1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> cols = table1.findElements(By.tagName("td"));
		System.out.println(cols.size());
		List<WebElement> op =driver.findElements(By.name("r1"));
		op.get(1).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
