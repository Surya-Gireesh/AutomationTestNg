package com.obsqura.TestNgFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base{
	@Test
	public void testCase1()
	{
		System.out.println("testcase");
	}
	@Test
	public void testCase2()
	{
		System.out.println("testcase2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
}
