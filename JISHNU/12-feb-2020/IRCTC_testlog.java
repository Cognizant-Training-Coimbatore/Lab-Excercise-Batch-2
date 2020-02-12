package feb_12;

import java.awt.List;
import java.io.File;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class IRCTC_testlog {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExtentReports report=new ExtentReports("Report_IRCTC.html");
		ExtentTest test=report.startTest("Extent_Report");
		
		File ip=new File("E:\\javanewwork space\\selenium examples\\src\\feb_12\\irctc.xml");
		SAXReader fil=new SAXReader();
		org.dom4j.Document doc=fil.read(ip);

		String url=doc.selectSingleNode("//irctc/url").getText();
		String from=doc.selectSingleNode("//irctc/from").getText();
		String to=doc.selectSingleNode("//irctc/to").getText();
		String fromv=doc.selectSingleNode("//irctc/fromv").getText();
		String tov=doc.selectSingleNode("//irctc/tov").getText();
		String btn=doc.selectSingleNode("//irctc/btn").getText();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath(from)).sendKeys(fromv);
		Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")));
		dropdown.selectBy("KANNUR - CAN");
		 
		driver.findElement(By.xpath(btn)).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
