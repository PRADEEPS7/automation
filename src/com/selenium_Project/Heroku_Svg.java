package com.selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku_Svg {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Course\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heroku.com/");

		WebElement icon = driver.findElement(By.xpath("(//*[local-name()='svg' and@ class=\"icon fill-purple\"])[1]"));
		icon.click();

		WebElement icon1 = driver.findElement(By.xpath("(//*[local-name()='svg'])[18]"));
		icon1.click();
		System.out.println("done");
	}

}
