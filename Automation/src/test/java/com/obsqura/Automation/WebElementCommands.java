package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void webElementCommands()
	{
		WebElement  enterMessage =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessage.sendKeys("Surya");
		WebElement  showMsgButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsgButton.click();
		WebElement  yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	    String yourMsgText=yourMessage.getText();
	    String classNameShow=showMsgButton.getAttribute("class");
	    String idShowmsg=showMsgButton.getAttribute("id");
	    String processId=showMsgButton.getAttribute("fdprocessedid");
	    String tagName=showMsgButton.getTagName();
	    enterMessage.clear();
	    String backGrndClr=showMsgButton.getCssValue("background-color");
	    String colorShow=showMsgButton.getCssValue("color");
	    String fontWgt=showMsgButton.getCssValue("font-weight");
	}
	public void verifyTwoInputFields()
	{
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		enterValueA.sendKeys("5");
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		enterValueB.sendKeys("5");
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement totalAandB=driver.findElement(By.id("message-two"));
		
		
	
	}

	public static void main(String[] args) {
		
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.webElementCommands();
		webelementcommands.verifyTwoInputFields();
        webelementcommands.drivercloseOrQuit();
	}


}
