package com.obsqura.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;


	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\Automation\\src\\main\\java\\com\\obsqura\\Automation\\Resources\\chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	public void drivercloseOrQuit()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		

		Base base = new Base();
		base.initializeBrowser();
		base.drivercloseOrQuit();
	}

}
