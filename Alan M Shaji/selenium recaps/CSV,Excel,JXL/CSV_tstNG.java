import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class CSV_tstNG {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String dates,date,month,year;
		String line="";
		String splitby=",";
		BufferedReader br=null;
		br=new BufferedReader(new FileReader("D:/test.csv"));
		line=br.readLine();
			while((line=br.readLine())!=null)
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.redbus.in/");
				String[] data=line.split(splitby);

				WebElement dq=driver.findElement(By.xpath("//*[@id=\"src\"]"));
				dq.sendKeys(data[0]);
				Thread.sleep(1000);
				dq.sendKeys(Keys.ENTER);
				WebElement d=driver.findElement(By.xpath("//*[@id=\"dest\"]"));
				d.sendKeys(data[1]);
				Thread.sleep(1000);
				d.sendKeys(Keys.ENTER);
				dates = data[2];
				String[] cal= dates.split(" ");
				date = cal[0].replaceAll("[^0-9]", "");
				month = cal[1]; 
				year = cal[2];
				  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div")).click();
				  while(true)
				  {
					  if(month.contains(driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().split(" ")[0]))
					  { 
						  WebElement calender=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody"));
						  List<WebElement> allDates = calender.findElements(By.tagName("tr"));
						  for (int i = 2; i < allDates.size(); i++) {
							  List<WebElement> allDate = allDates.get(i).findElements(By.tagName("td"));
							  for (int j = 0; j < allDate.size(); j++) {
								  if(date.equals(allDate.get(j).getText()))
								  {
									  allDate.get(j).click();
									  break;
								  }
							  	}
							  }
						  break;
					  }
					  else
					  {
						  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
					  }
					  
				  }		  
				  
					dates = data[3];
					String[] cal1= dates.split(" ");
					date = cal1[0].replaceAll("[^0-9]", "");
					month = cal1[1]; 
					year = cal1[2];
					  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div")).click();
				  while(true)
				  {
					  if(month.contains(driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]")).getText().split(" ")[0]))
					  { 
						  WebElement calender=driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody"));
						  List<WebElement> allDates = calender.findElements(By.tagName("tr"));
						  for (int i = 2; i < allDates.size(); i++) {
							  List<WebElement> allDate = allDates.get(i).findElements(By.tagName("td"));
							  for (int j = 0; j < allDate.size(); j++) {
								  if(date.equals(allDate.get(j).getText()))
								  {
									  allDate.get(j).click();
									  break;
								  }
							  	}
							  }
						  break;
					  }
					  else
					  {
						  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
					  }
					  
				  }		  	
				  
				  
				  driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
				  Thread.sleep(7000);
				  driver.quit();
			  	}
				
			br.close();	
				
			}
			
	}

