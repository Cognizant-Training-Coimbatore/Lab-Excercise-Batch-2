package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java programs\\selenium exampls\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://examples.codecharge.com/store/Default.php");
		String title=driver.getTitle();
	    String rtitle="Online Bookstore";
		if(title.equals(rtitle)==true)
		{
			System.out.println("verified");
		}		
		Select box=new Select(driver.findElement(By.name("category_id")));
		box.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		WebElement link1=driver.findElement(By.linkText("Web Database Development"));
		link1.click();
		String Qty=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(Qty);
		driver.findElement(By.name("Insert1")).click();
		WebElement del=driver.findElement(By.name("Delete1_1"));
		if(del.isSelected()==true)
		{
			System.out.println("delete is On");
		}
		else
			System.out.println("delete is off");
	       driver.quit();	
	}

}
