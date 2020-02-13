package feb_12_pgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class pgm_5 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm5.html");
		ExtentTest test=report.startTest("pgm_5");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement table1=driver.findElement(By.xpath("/html/body/table"));
		List<WebElement> columns=table.findElements(By.tagName("tr"));
		System.out.println(columns.size());
		List<WebElement> res=driver.findElements(By.name("r1"));
		res.get(1).click();
		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		driver.quit();
	}

}
