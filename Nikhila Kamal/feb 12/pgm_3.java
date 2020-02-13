package feb_12_pgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class pgm_3 {

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report=new ExtentReports("Report_pgm3.html");
		ExtentTest test=report.startTest("pgm_3");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase.3.html.htm");
		Select country=new Select(driver.findElement(By.id("country1")));
		country.selectByVisibleText("India");
		//int size1=country.getOptions().size();
		Select countryto=new Select(driver.findElement(By.id("country2")));
		//int size2=countryto.getOptions().size();
		countryto.selectByVisibleText("Qatar");
		String p=country.getFirstSelectedOption().getText();
		String p1=countryto.getFirstSelectedOption().getText();
		
		if(p.equals(p1))
		{
			test.log(LogStatus.FAIL,"failed");
		}
		else
		{
			test.log(LogStatus.PASS,"passed");
		}
		report.endTest(test);
		report.flush();
		Thread.sleep(5000);
		driver.quit();

	}

}
