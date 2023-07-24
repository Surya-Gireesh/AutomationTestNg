package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void locatorUsingId() {
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement selectAllButton   = driver.findElement(By.id("button-two"));
		WebElement showSelectedValueButton = driver.findElement(By.id("button-one"));
		WebElement messageTwo = driver.findElement(By.id("message-two"));
		//WebElement muitlSelectField = driver.findElement(By.id("multi-select-field"));
		//WebElement getFirstSelectedButton   = driver.findElement(By.id("button-first"));
		//WebElement getAllSelectedButton   = driver.findElement(By.id("button-all"));
		
	}

	public void locatorUsingClass() {
		WebElement clearfix = driver.findElement(By.className("clearfix"));
		WebElement mbsec = driver.findElement(By.className("mb-sec"));
		WebElement mt= driver.findElement(By.className("mt-5"));
		WebElement copy= driver.findElement(By.className("copyright"));
		
	}

	public void locatorUsingCss() {
		WebElement cssUsingidandtag = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssUsingidandtags = driver.findElement(By.cssSelector("div#message-one"));
		
		WebElement cssUsingClassandTag = driver.findElement(By.cssSelector("section.clearfix"));
		WebElement cssUsingClassandTags = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement cssUsingClassandTagg = driver.findElement(By.cssSelector("div.copyright"));
		
		WebElement cssUsingTagandAttribute = driver.findElement(By.cssSelector("section[class=clearfix]"));
		WebElement cssUsingTagandAttributes = driver.findElement(By.cssSelector("div[class=copyright]"));
		
		WebElement cssUsingTagClassandAttribute = driver.findElement(By.cssSelector(" div.my-2[id=message-one]"));
		
		
	}

	public void locatorUsingLinkText() {
		WebElement linkText = driver.findElement(By.linkText("Radio Buttons Demo"));
		//WebElement linkTexts = driver.findElement(By.linkText(" Input Form"));
		WebElement linkTexts = driver.findElement(By.linkText("Select Input"));
		
		
		
	}

	public void locatorUsingPartialLinkText() {
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Radio Buttons "));
		//WebElement partialLinkTexts = driver.findElement(By.partialLinkText(""));
		WebElement partialLinkTexts = driver.findElement(By.partialLinkText("Select"));
	}

	public static void main(String[] args) {
		Locators locators = new Locators();
	
		locators.initializeBrowser();
		locators.locatorUsingId();
		locators.locatorUsingClass();
		locators.locatorUsingCss();
		locators.locatorUsingLinkText();
		locators.locatorUsingClass();
		locators.drivercloseOrQuit();

	}

}
