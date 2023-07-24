package com.obsqura.TestNgFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

    @BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\Downloads\\TestNgFramework\\src\\main\\java\\com\\obsqura\\TestNgFramework\\Resources\\chromedriver.exe" );
        driver=new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        driver.manage().window().maximize();
	}
    @AfterMethod
	public void drivercloseOrQuit()
	{
		//driver.close();
		driver.quit();
	}

	
}
