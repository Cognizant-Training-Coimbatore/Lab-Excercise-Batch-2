package feb12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports report = new ExtentReports("Testcase3");
		ExtentTest test = report.startTest("testcase_3");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/testcase3.html.htm");
		Select c1=new Select(driver.findElement(By.xpath("/html/body/select[1]")));
		Select c2=new Select(driver.findElement(By.xpath("/html/body/select[2]")));
		int l = c1.getOptions().size();
		int m = c2.getOptions().size();
		String s2;
		int i=0;
		int count=0;
		for(i=0;i<l;i++)
		{
			c1.selectByIndex(i);
			String s1=c1.getFirstSelectedOption().getText();
			for(int j=0;j<m;j++)
			{
				c2.selectByIndex(i);
				s2=c2.getFirstSelectedOption().getText();
				if(s2.contains(s1))
				{
					System.out.println("fail");
					count=1;
				}
				else
				{
					System.out.println("fail");
				}
				
			}
			if(count==1)
			{
				test.log(LogStatus.FAIL, "fail");
			}
			else
			{
				test.log(LogStatus.PASS, "pass");
			}
			Thread.sleep(3000);
			driver.quit();
		}

	}

}
