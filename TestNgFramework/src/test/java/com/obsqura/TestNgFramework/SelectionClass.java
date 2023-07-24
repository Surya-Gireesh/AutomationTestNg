package com.obsqura.TestNgFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectionClass extends Base{
	@Test
	public void dropDownWithSelectClass()
	{
		//FindElements findelements=new FindElements();
		//findelements.menu("Select Input");
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		select.selectByIndex(1);
		select.selectByVisibleText("Green");
		select.selectByValue("Yellow");
		List <WebElement> options=select.getOptions();
		
		
	}

}
