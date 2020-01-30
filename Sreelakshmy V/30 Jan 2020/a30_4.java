import java.lang.reflect.GenericDeclaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a30_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		String s=driver.getTitle();
		String s1=driver.getCurrentUrl();
		System.out.println("Title=" +s);
		System.out.println("Title length=" +s.length());
		System.out.println("Url="+s1);
		System.out.println("Url length=" +s1.length());
		if("https://jpetstore.cfapps.io/".equals(s1))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");
		}
		String s2=driver.getPageSource();
		GenericDeclaration s3=driver.getClass();
		Thread.sleep(3000);
		System.out.println("page source=" +s2);
		System.out.println("page class=" +s3);
		System.out.println("page source length=" +s2.length());
		driver.quit();
}
}
