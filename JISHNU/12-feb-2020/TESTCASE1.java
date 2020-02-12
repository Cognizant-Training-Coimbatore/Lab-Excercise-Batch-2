package feb_12;

import java.io.File;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TESTCASE1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("testcase1.html");
		ExtentTest test= report.startTest("testcase1");
		
		File ip=new File("E:\\javanewwork space\\selenium examples\\src\\feb_12\\testcase1.xml");
		SAXReader fil=new SAXReader();
		org.dom4j.Document doc=fil.read(ip);
		String url=doc.selectSingleNode("//testcase1/url").getText();
		String tid=doc.selectSingleNode("//testcase1/tid").getText();
		String tv=doc.selectSingleNode("//testcase1/tv").getText();
		String btnid=doc.selectSingleNode("//testcase1/btnid").getText();
		String tid2=doc.selectSingleNode("//testcase1/tid2").getText();
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(tid)).sendKeys(tv);
		driver.findElement(By.id(btnid)).click();
		String s=driver.findElement(By.id(tid2)).getAttribute("value");
		System.out.println(s);
		if(tv.length()==Integer.parseInt(s))
		{
			test.log(LogStatus.PASS, "correct length");
		}
		else
		{
			test.log(LogStatus.FAIL, "incorrect string length");
		}
		Thread.sleep(3000);
		report.endTest(test);
		report.flush();
		driver.quit();
		
		
		
		
		
	}

}
