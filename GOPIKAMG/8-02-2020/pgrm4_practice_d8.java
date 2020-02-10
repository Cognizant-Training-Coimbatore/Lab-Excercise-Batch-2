import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgrm4_practice_d8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://examples.codecharge.com/Store/Default.php");
		   if(driver.getTitle().equalsIgnoreCase("Online Bookstore"))
				 
			   System.out.println("Title verified");
		   Select combo1=new Select(driver.findElement(By.name("category_id")));
		   combo1.selectByVisibleText("Databases");
		   driver.findElement(By.name("DoSearch")).click();
		   WebElement link1=driver.findElement(By.linkText("Web Database Development"));
		   link1.click();
		   String s=driver.findElement(By.name("quantity")).getAttribute("value");
		   System.out.println(Integer.parseInt(s));
		   driver.findElement(By.name("Insert1")).click();
		   WebElement rememberme=driver.findElement(By.name("Delete1_1"));
			  boolean res=rememberme.isSelected();
			  if(res==true)
			  {
				  System.out.println("Checkbox on");
			  }
			  else
			  {
				  System.out.println("checkbox off");
				  rememberme.click();
				  Thread.sleep(5000);
			  }
			  
		   Thread.sleep(5000);
		   
		   driver.quit();
	}

}
