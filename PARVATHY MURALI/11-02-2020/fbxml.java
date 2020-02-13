package repository;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class fbxml 
{

	public static void main(String[] args) throws DocumentException 
	{
		File ip=new File("C:\\Users\\Admin\\Desktop\\java parvathym\\project_selenium\\src\\repository\\FB.xml");
		SAXReader file=new SAXReader();
		Document doc=file.read(ip);
		String url=doc.selectSingleNode("//fb/url").getText();
		String uid=doc.selectSingleNode("//fb/uid").getText();
		String pwd=doc.selectSingleNode("//fb/pwd").getText();
		String btn=doc.selectSingleNode("//fb/btn").getText();
		String uidv=doc.selectSingleNode("//fb/uidv").getText();
		String passv=doc.selectSingleNode("//fb/passv").getText();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		

	}

}
