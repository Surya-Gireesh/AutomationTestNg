package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathLocator extends Base {
	public void xPath()
	{
		WebElement showMessageButtonone=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement showMessageButtontwo=driver.findElement(By.xpath("//button[@id='button-two']"));
		
		
		//contains text or and
		WebElement  contains =driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement  text =driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement  orUse =driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
		WebElement  andUse =driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		
		
		
		
		
		
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");		
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		WebElement multipleCheckboxDemoButton=driver.findElement(By.xpath("//div[@class='card-header']"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement submitFormButton=driver.findElement(By.xpath("//button[@type='submit']"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		
		//using starts_with
		WebElement showMessageButton1=driver.findElement(By.xpath("//button[starts-with(@id,'button-on')]"));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement mb_sec=driver.findElement(By.xpath("//div[starts-with(@class,'mb')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		WebElement submitButton=driver.findElement(By.xpath("//button[starts-with(@type,'sub')]"));
		WebElement clearFix=driver.findElement(By.xpath("//section[starts-with(@class,'clear')]"));
		
	}

	public static void main(String[] args) {
		
		XPathLocator xpathlocator=new XPathLocator();
		xpathlocator.initializeBrowser();
		xpathlocator.xPath();
		xpathlocator.drivercloseOrQuit();
		

	}


}
