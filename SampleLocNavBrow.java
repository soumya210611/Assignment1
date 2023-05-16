package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleLocNavBrow {
	public WebDriver driver;

	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\soumy\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resourses\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.yahoo.com/");
	}
	public void locatorsId() {
		driver.findElement(By.id("ybar-sbq"));
		driver.findElement(By.id("root_1"));
		driver.findElement(By.id("root_2"));
		driver.findElement(By.id("root_5"));
		driver.findElement(By.id("root_8"));

		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.findElement(By.className("form-group"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.className("card-header"));
		driver.findElement(By.className("my-2"));
		driver.findElement(By.className("list-group-item"));
	
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.name("q"));
		driver.findElement(By.name("robots"));
		driver.findElement(By.name("twitter:creator"));
		driver.findElement(By.name("twitter:app:country"));
		driver.findElement(By.name("twitter:app:name:iphone"));
		driver.quit();
		
	}

	public static void main(String[] args) {
		SampleLocNavBrow sampleLocNavBrow = new SampleLocNavBrow();
		sampleLocNavBrow.browser();
		sampleLocNavBrow.locatorsId();

	}
}
