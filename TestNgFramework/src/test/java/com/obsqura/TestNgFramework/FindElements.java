package com.obsqura.TestNgFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base{
	@Test
	public void menu(String input)
	{   
		
		List<WebElement> menuList=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		
		menuList.size();
		for(WebElement menu:menuList)
		{
			String menuText=menu.getText();
			if(menuText.equals(input))
			{
				menu.click();
				break;
			}
		}
		
	}
	@Test
	public void findElementsOfSelDev()
	{   
		
		driver.navigate().to("https://www.selenium.dev/pt-br/");
		String input="Other";
		WebElement english=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
		english.click();
		List<WebElement> menuListSelDev=driver.findElements(By.xpath("//ul[contains(@class,'dropdown')]//li"));
		
		
		for(WebElement menu:menuListSelDev)
		{
			String menuText=menu.getText();
			if(menuText.equals("Português (Brasileiro)"))
			{
				menu.click();
				break;
			}
		}
		
	}

}
