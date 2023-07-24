package com.obsqura.TestNgFramework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualsSample()
	{
		String input="Surya";
		String expected="Your Message : "+input;
		WebElement  enterMessage =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enterMessage.sendKeys(input);
		WebElement  showMsgButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		showMsgButton.click();
		WebElement  yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	    String yourMsgText=yourMessage.getText();
	    assertEquals(expected,yourMsgText,"Expected message is not "+expected);	
	}
	@Test
	public void assertNotEqualsSample()
	{
		String expected="abc";
		String actual="def";
		assertNotEquals(expected,actual,"expected and actual are same");
	}
	@Test
	public void assertTrueSample()
	{
		WebElement  showMsgButton =driver.findElement(By.xpath("//button[@id='button-one']"));	
		boolean isShowMessageButtonDisplayed=showMsgButton.isDisplayed();
		boolean isShowMessageButtonEnabled=showMsgButton.isEnabled();
		assertTrue(isShowMessageButtonDisplayed,"show message button is not displayed");
	}
	@Test
	public void assertFalseSample()
	{
		boolean value=false;
		assertFalse(value,"value is true");
	}
	@Test
	public void assertNullSample() {
		String value=null;
		assertNull(value,"value is not null");
	}
	@Test
	public void assertNotNullSample() {
		String value="abc";
		assertNotNull(value,"value is null");
	}

}
