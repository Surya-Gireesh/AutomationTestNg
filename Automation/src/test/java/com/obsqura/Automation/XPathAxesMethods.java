package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathAxesMethods extends Base{
	public void xpathAxesMethods() {
		//parent
		WebElement  parent =driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement  selectAllParent =driver.findElement(By.xpath("//input[@id='button-two']//parent::form"));
		WebElement  checkBoxOneParent =driver.findElement(By.xpath("//input[@id='check-box-one']//parent::div"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement  msgTwoParent =driver.findElement(By.xpath("//div[@id='message-two']//parent::form"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement  getFirstSelectedParent =driver.findElement(By.xpath("//button[@id='button-first']//parent::form"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		//child
		WebElement  child =driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement  selectAllChild =driver.findElement(By.xpath("//form[@method='POST']//child::input[@id='button-two']"));
		WebElement  checkBoxOneChild =driver.findElement(By.xpath("//div[@class='form-check']//child::input[@id='check-box-one']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement  msgTwoChild =driver.findElement(By.xpath("//form[@method='POST']//child::div[@id='message-two']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement  getFirstSelectedChild =driver.findElement(By.xpath("//form[@method='POST']//child::button[@id='button-first']"));
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement  following =driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement  preceding =driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
	
		
		WebElement  ancestor =driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
		WebElement  descedant =driver.findElement(By.xpath("//div[@class='card']//descendant::label[@for='inputEmail4']"));
		WebElement  fsib =driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input"));
		
		WebElement  indexing =driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		
	
	}

	public static void main(String[] args) {
		XPathAxesMethods xpathaxesmethods=new XPathAxesMethods();
		xpathaxesmethods.initializeBrowser();
		xpathaxesmethods.xpathAxesMethods();
		xpathaxesmethods.drivercloseOrQuit();
		
		
		

	}


}
