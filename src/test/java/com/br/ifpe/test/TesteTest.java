package com.br.ifpe.test;


// Generated by Selenium IDE
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeAll
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterAll
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void teste() {
		driver.get("https://portal.ifpe.edu.br/");
		driver.manage().window().setSize(new Dimension(550, 692));
		{
			WebElement element = driver.findElement(By.cssSelector(".wp-image-446"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".wp-image-446"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".wp-image-445"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".btn-menu-toggle")).click();
		driver.findElement(By.cssSelector(".header > .container")).click();
		driver.findElement(By.cssSelector(".slider-wrapper")).click();
		driver.findElement(By.cssSelector(".area-social")).click();
		driver.findElement(By.cssSelector(".home")).click();
		driver.close();
	}
}
