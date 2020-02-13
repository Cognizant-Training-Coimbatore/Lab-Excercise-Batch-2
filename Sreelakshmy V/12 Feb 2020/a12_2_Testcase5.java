package extentreport1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class a12_2_Testcase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Results4.html");
		ExtentTest test=report.startTest("a12_2_Testcase4");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase5.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
	 int r=(rows.size());
	System.out.println(r);
	WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]"));
	List<WebElement> rows1=table.findElements(By.tagName("td"));
	int q=(rows1.size());
	System.out.println(q);
	if((r!="")&&(q!=""))
	{
		
	}
	}

}
