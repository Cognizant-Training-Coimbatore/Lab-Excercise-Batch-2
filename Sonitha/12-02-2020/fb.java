package repository;

import java.io.File;
import java.io.FileInputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class fb {

	public static void main(String[] args) throws DocumentException, InterruptedException 
	{
       File ip = new File("C:\\Users\\Admin\\Desktop\\java prgms\\JavaSeleniumnew\\src\\repository\\b.xml");
       SAXReader fil= new SAXReader();
       Document doc = fil.read(ip);
        String url = doc.selectSingleNode("//fb/url").getText();
        String uid = doc.selectSingleNode("//fb/uid").getText();
        String pwd = doc.selectSingleNode("//fb/pwd").getText();
        String btn = doc.selectSingleNode("//fb/btn").getText();
        String uidv = doc.selectSingleNode("//fb/uidv").getText();
        String pwdv = doc.selectSingleNode("//fb/pwdv").getText();
         
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java prgms\\JavaSeleniumnew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id(uid)).sendKeys(uidv);
		driver.findElement(By.id(pwd)).sendKeys(pwdv);
		driver.findElement(By.xpath(btn)).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
