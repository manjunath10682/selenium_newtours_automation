package com.newtours.com;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTests {

	public WebDriver driver;
	//public WebDriver driver = new FirefoxDriver();

	//@BeforeMethod
	//public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium_drivers\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//Reporter.log("Starting the applicaton", true);
		//driver.get("https://www.google.co.in/");
	//}

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1014807\\eclipse-workspace\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Login process started", true);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("manju123");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");	
		driver.findElement(By.xpath("//input[@name='login']")).click();	
		Thread.sleep(5000);
		System.out.println("Login successful");
		driver.close();
	}
	
	@Test
	public void FlightBooking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1014807\\eclipse-workspace\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Flight booking process started", true);
		//driver.findElement(By.xpath("//a[text()='Flights")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();	
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();	
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("TestMember1");	
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Test");	
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(5000);
		System.out.println("Flight booking is successful");
		driver.close();
	}
	
	@Test
	public void CruiseBooking() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1014807\\eclipse-workspace\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Crise booking process started", true);
		driver.findElement(By.xpath("//a[text()='Cruises']")).click();		
		driver.findElement(By.xpath("//img[@alt='Reservations Open']")).click();		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");		
		driver.findElement(By.xpath("//input[@name='login']")).click();		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();		
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();		
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("TestMember1");		
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Test");		
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		Thread.sleep(5000);
		System.out.println("Cruise booking is successful");	
		driver.close();
	}
	@Test
	public void BrokenLinks() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1014807\\eclipse-workspace\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		System.out.println("Total links are "+links.size()); 
		for(int i=0; i<links.size(); i++) {
		 WebElement element = links.get(i);
		 String url=element.getAttribute("href");
		 verifyLink(url); 
		 driver.close();
		 } 
		 }
		 
		 //public WebDriver driver = new FirefoxDriver();
	
	//@BeforeMethod
	//public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\selenium_drivers\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//Reporter.log("Starting the applicaton", true);
		//driver.get("https://www.google.co.in/");
	//}
	
	@Test
	public void Register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\m1014807\\eclipse-workspace\\Automation\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Starting the applicaton", true);
		driver.get("http://www.newtours.demoaut.com/");
		Reporter.log("Registartion process started", true);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Manju");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("MT");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Manjunath@test.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Test2");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560071");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560071");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manju123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(6000);
		System.out.println("Registration successful");
		driver.close();
	}

		public static void verifyLink(String urlLink) {
		  try {
		 URL link = new URL(urlLink);
		 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		httpConn.setConnectTimeout(2000);
		 httpConn.connect();
		if(httpConn.getResponseCode()== 200) { 
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 if(httpConn.getResponseCode()== 404) {
		 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
		 }
		 }
		 catch (Exception e) {
		 //e.printStackTrace();
		 }
		 }
		
}
