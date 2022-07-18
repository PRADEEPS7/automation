package com.selenium_Project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_Course\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

		/*
		 * List<WebElement> indiarow =
		 * driver.findElements(By.xpath("//table[1]/tbody[1]/tr[7]/td[15]")); for (int i
		 * = 0; i < indiarow.size(); i++) { String india_Population =
		 * indiarow.get(i).getText(); System.out.println(india_Population); }
		 */

		/*
		 * List<WebElement> india_Alldata =
		 * driver.findElements(By.xpath("//table[1]/tbody[1]/tr[7]/td"));
		 * System.out.println(india_Alldata.size()); for (int i = 0; i <
		 * india_Alldata.size(); i++) { * String india_data =
		 * india_Alldata.get(i).getText(); System.out.println(india_data ); * }
		 */

		List<WebElement> Alldata = driver.findElements(By.xpath("//table/tbody[1]"));
		for (int i = 0; i < Alldata.size(); i++) {
			String coronadata = Alldata.get(i).getText();
			System.out.println(coronadata);
		}
	}
}
