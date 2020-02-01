import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program10_sample_html {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Anjana/sample.html");
		Thread.sleep(1000);
		
		Select product=new Select(driver.findElement(By.xpath("/html/body/select")));
		
	  boolean b=product.getOptions().contains("Mango");
	  System.out.println(b);
	  int size=product.getOptions().size();
	  System.out.println(size);
	  int i;
	  
	  try
	  {
		  for(i=0;i<size;i++)
		  {
			  product.selectByIndex(i);
			  String st=product.getFirstSelectedOption().getText();
			  if(st.contentEquals("Mango"))
			  {
	
			System.out.println("mango exists");
			break;
			  }
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("Mango doesn't exist");
	  }
	  
	 
	  String s=Integer.toString(size);
	  int count=0; 
	  WebElement text_box=driver.findElement(By.id("txt1"));
	  text_box.sendKeys(s);
	  List<WebElement> link=driver.findElements(By.tagName("a"));
	  int link_no=link.size();
	  System.out.println(link_no);
	  List<WebElement> check_box=driver.findElements(By.cssSelector("input[type='checkbox']"));
	  int check_box_no=check_box.size();
	  System.out.println(check_box_no);
	  String linkp=Integer.toString(link.size());
	  WebElement text_box1=driver.findElement(By.id("t2"));
	  text_box1.sendKeys(linkp);
	  Random rand=new Random();
	  int ra=rand.nextInt(3);
	  String val="check"+ra;
	  driver.findElement(By.id(val)).click();
	  Thread.sleep(1000);
	  System.out.println(val);
	 
	  if(ra==1)
	  {
		  System.out.println("Music");
		  System.out.println("Spirituals");
	  }
	  if(ra==2)
	  {
		  System.out.println("Sports");
		  System.out.println("Spirituals");
	  }
	  if(ra==3)
	  {
		  System.out.println("Sports");
		  System.out.println("Music");
		 
	  }
	  Thread.sleep(1000);
	  String title=driver.getTitle();
	  System.out.println("Title :"+title);
	  driver.quit();
	  //List<WebElement >boxes=driver.findElement(By.xpath("//*[@id=\"checkbox\"]"));
	  //int s=boxes.Size();
	  //System.out.println(s);
	  
	  
	}

}
