package feb1;

import java.awt.List;
import java.util.Random;
import java.util.zip.InflaterInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/sample.html");
		Select product= new Select(driver.findElement(By.xpath("/html/body/select")));
		

		int size=product.getOptions().size();//Number of values in combo box
		for(int i=0;i<size;i++)
		{
		product.selectByIndex(i);
		String s=product.getFirstSelectedOption().getText();
		if(s.equals("Mango"))
		{
		System.out.println("mango option is available");
		break;
		}
		Thread.sleep(2000);
		}
		String a=Integer.toString(size);
		for(int i=0;i<size;i++)
		{
			
		}
		WebElement textbox=driver.findElement(By.id("txt1"));//text box
		textbox.sendKeys(a);//Print to text box
		System.out.println(size );
		java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
		int nolink=links.size();//Number of links
		java.util.List<WebElement> checkbox=driver.findElements(By.cssSelector("input[type='checkbox']"));//find checkbox
		int checkboxsize=checkbox.size();
		System.out.println("Number of check boxes :"+checkboxsize);
		WebElement textbox2=driver.findElement(By.id("t2"));
		String linkno=Integer.toString(nolink);
		textbox2.sendKeys(linkno);
		Thread.sleep(2000);
		Random rand= new Random();
		int ranmdom=rand.nextInt(3);
		String hobbie="check"+ranmdom;
		driver.findElement(By.id(hobbie)).click();
		Thread.sleep(2000);
		System.out.println("Hobbies not selected");
		if(ranmdom==1)
		{
			System.out.println("Music");
			System.out.println("Spirituals");
		}
		if(ranmdom==2)
		{
			System.out.println("Sports");
			System.out.println("Spirituals");
		}
		if(ranmdom==3)
		{
			System.out.println("Music");
			System.out.println("Sports");
		}
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
	}

}
