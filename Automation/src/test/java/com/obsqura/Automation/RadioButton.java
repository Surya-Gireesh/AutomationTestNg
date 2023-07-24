package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
	public void radioButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleButton=driver.findElement(By.cssSelector("input[id=inlineRadio1]"));
		WebElement femaleButton=driver.findElement(By.cssSelector("input[id=inlineRadio2]"));
		femaleButton.click();
		boolean femaleIsSelect=femaleButton.isSelected();
		WebElement showSelectButton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		showSelectButton.click();
		WebElement message=driver.findElement(By.cssSelector("div[id=message-one]"));
		message.getText();
	}

	public static void main(String[] args) {
		RadioButton radiobutton=new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();
		radiobutton.drivercloseOrQuit();
		

	}

}
