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
		// TODO Auto-generated method stub
		File ip=new File("C:\\Users\\admin\\Desktop\\Java\\Selenium\\src\\repository\\fb.xml");
		SAXReader fil=new SAXReader();
		Document doc=fil.read(ip);
		String url=doc.selectSingleNode("//fb/url").getText();
		String uid=doc.selectSingleNode("//fb/uid").getText();
		String pwd=doc.selectSingleNode("//fb/pwd").getText();
		String uidv=doc.selectSingleNode("//fb/uidv").getText();
		String pwdv=doc.selectSingleNode("//fb/pwdv").getText();
		String btn=doc.selectSingleNode("//fb/btn").getText();


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.id(uid)).sendKeys(uidv);
		driver.findElement(By.id(pwd)).sendKeys(pwdv);
		driver.findElement(By.xpath(btn)).click();
	}

}
