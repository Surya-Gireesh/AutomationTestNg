package com.obsqura.TestNgFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SimpleInputFormDemo extends Base {
	@Test
	public void verifyTwoInputFields()
	{   
		
		int enterTextFieldValueA=15;
		int enterTextFieldValueB=15;
		int total=enterTextFieldValueA+enterTextFieldValueB;
		String expected=("Total A + B : "+String.valueOf(total));
		WebElement enterValueA=driver.findElement(By.id("value-a"));
		enterValueA.sendKeys(String.valueOf(enterTextFieldValueA));
		WebElement enterValueB=driver.findElement(By.id("value-b"));
		enterValueB.sendKeys(String.valueOf(enterTextFieldValueB));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement totalAandB=driver.findElement(By.id("message-two"));
		String toalAandBText=totalAandB.getText();
		assertEquals(expected,toalAandBText,"Expected value is not "+expected);	
	
	}
	@Test
	public void verifyColorOfShowMessageButton()
	{   
		//String expected=String.format("#%02x%02x%02x", 255,255,255);
		String expected="rgba(255, 255, 255, 1)";
		WebElement  showMsgButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsgButton.click();
		String actualColorShowButton=showMsgButton.getCssValue("color");
		assertEquals(expected,actualColorShowButton,"Expected color is not "+expected);	
		
		
	}
	@Test
	public void verifyFontSizeOfShowMessageButton()
	{   
		String expectedfontSize="16px";
		WebElement  showMsgButton =driver.findElement(By.xpath("//button[@id='button-one']"));
	    showMsgButton.click();
	    String actualFontSizeShowButton=showMsgButton.getCssValue("font-size");
	    assertEquals(expectedfontSize,actualFontSizeShowButton,"Expected fontsize is not "+expectedfontSize);	
	}
	@Test
	public void verifyFontWeightOfGetTotalButton()
	{
		String expectedFontWeightOfGetTotalButton="400";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		String actualFontWeightOfGetTotalButton=getTotalButton.getCssValue("font-weight");
		assertEquals(expectedFontWeightOfGetTotalButton,actualFontWeightOfGetTotalButton,"Expected fontwt is not "+expectedFontWeightOfGetTotalButton);	
	}
	

}
