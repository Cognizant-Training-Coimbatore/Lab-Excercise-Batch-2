package feb_12;

import java.io.File;

import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class FB_test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_FB.html");
		ExtentTest test=report.startTest("Extent_Report");
		
		File ip=new File("E:\\javanewwork space\\selenium examples\\src\\feb_12\\fb.xml");
		SAXReader fil=new SAXReader();
		org.dom4j.Document doc=fil.read(ip);

		String url=doc.selectSingleNode("//fb1/url").getText();
		String uid=doc.selectSingleNode("//fb1/uid").getText();
		String pwd=doc.selectSingleNode("//fb1/pwd").getText();
		String btn=doc.selectSingleNode("//fb1/btn").getText();
		String uidv=doc.selectSingleNode("//fb1/uidv").getText();
		String pwdv=doc.selectSingleNode("//fb1/pwdv").getText();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(uid)).sendKeys(uidv);
		driver.findElement(By.id(pwd)).sendKeys(pwdv);
		driver.findElement(By.xpath(btn)).click();
		Thread.sleep(4000);
		if(uidv!=null)
		{
			test.log(LogStatus.PASS,"Pass");
			
		}
		else
		{
			test.log(LogStatus.FAIL,"fail");
		}
		if(pwdv==null)
		{
			test.log(LogStatus.PASS,"Pass");
		}
		else
		{
			test.log(LogStatus.FAIL,"fail");
		}
		report.endTest(test);
		report.flush();
		
		driver.quit();
		
		
	}

}
