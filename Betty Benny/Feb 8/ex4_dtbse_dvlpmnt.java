package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_dtbse_dvlpmnt {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.getTitle();
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		WebElement login=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input"));
		login.click();
		driver.findElement(By.linkText("Web Database Development")).click();
		String a=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println("value = "+a);
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		boolean t= driver.findElement(By.name("Delete1_1")).isSelected();
	    if(t==true)
	   {
		   System.out.println("delete ckeckbox is selected");
	   }
	   else
	   {
		   System.out.println("delete checkbox is not selected");
	   }
		Thread.sleep(5000);
		driver.quit();
		login.click();
		
		// TODO Auto-generated method stub

	}

}
