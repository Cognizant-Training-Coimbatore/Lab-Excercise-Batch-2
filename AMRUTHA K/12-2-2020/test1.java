package labexecise1222020;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExtentReports report= new ExtentReports("test1.html");
	     ExtentTest test=report.startTest("test1");
	     
	    
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("C:\\Users\\Admin\\Downloads\\testcase1.html");
         WebElement ab=driver.findElement(By.id("t1"));
         ab.sendKeys("amrutha");
          System.out.println();
         driver.findElement(By.id("b1")).click();
         WebElement aa=driver.findElement(By.id("t2"));
         String a=ab.getAttribute("value");
         int b=a.length();
         String d=String.valueOf(b);
         String c=aa.getAttribute("value");
         Integer v=Integer.valueOf(c);
          if(b==v){
        	test.log(LogStatus.PASS, "same length displayed");
              }
          else {
        	  test.log(LogStatus.FAIL, "different length displayed");
          }
	
          report.endTest(test);
  		report.flush();
  		driver.quit();
  		
}}
