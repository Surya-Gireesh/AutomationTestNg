package com.obsqura.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	public void checkBox() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxButton = driver.findElement(By.cssSelector("input[id=gridCheck]"));
		checkBoxButton.click();
		boolean isSelect = checkBoxButton.isSelected();
		
		// mutliple checkboxdemo
		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[id=check-box-one]"));
		checkBoxOne.click();
		boolean isSelectCheckboxOne=checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.cssSelector("input[id=check-box-two]"));
		checkBoxTwo.click();
		boolean isSelectCheckboxTwo=checkBoxTwo.isSelected();
		WebElement checkBoxThree=driver.findElement(By.cssSelector("input[id=check-box-three]")); 
		
		WebElement checkBoxFour=driver.findElement(By.cssSelector("input[id=check-box-four]"));
		
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		
	}

	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		checkbox.drivercloseOrQuit();
	}

}
