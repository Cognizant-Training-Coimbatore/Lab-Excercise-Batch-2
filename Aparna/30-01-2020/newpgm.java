package webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chrome.exe"); //which browser to use
		WebDriver driver=new ChromeDriver();     
		driver.get("");
		String s=driver.getTitle();
		System.out.println(s); 
		System.out.println("length of string= " +s.length());
		String d=driver.getCurrentUrl();
		System.out.println(d);
		if(s==d)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		System.out.println(driver.getPageSource());
		String f=driver.getPageSource();
		System.out.println("length" +f.length());
		
		driver.quit();
	}

}
