package repository;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) throws DocumentException, InterruptedException {
		File ip=new File("C:\\Users\\Admin\\Desktop\\Java programs\\selenium exampls\\src\\repository\\fb.xml");
		SAXReader file=new SAXReader();
		Document doc=file.read(ip);
		String url=doc.selectSingleNode("//fb/url").getText();
		String userid=doc.selectSingleNode("//fb/userid").getText();
		String pswd=doc.selectSingleNode("//fb/pswd").getText();
		String btn=doc.selectSingleNode("//fb/btn").getText();
		String useridv=doc.selectSingleNode("//fb/useridv").getText();
		String pswdv=doc.selectSingleNode("//fb/pswdv").getText();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\java programs\\\\selenium exampls\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(userid)).sendKeys(useridv);
		driver.findElement(By.id(pswd)).sendKeys(pswdv);
		driver.findElement(By.xpath(btn)).click();
		Thread.sleep(5000);
		driver.quit();
		//driver.findElement(By.id(userid)).sendKeys();
	}

}
