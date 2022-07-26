package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		//Download and set the path
		WebDriverManager.chromedriver().setup();
												
		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
												
		//Load the URL
		driver.get("https://www.ajio.com/");
												
		//Maximize the window
		driver.manage().window().maximize();
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags"+Keys.ENTER);
		
		//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		
		Thread.sleep(5000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		//Print the count of the items Found
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total items found: "+count);
		
		//Get the list of brand of the products displayed in the page and print the list
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brandnames = new ArrayList<String>();
		for (WebElement string : brands) {
			String names = string.getText();
			brandnames.add(names);
		}
		System.out.println("List of all bag's brand names:\n"+brandnames);
		
		//Get the list of names of the bags and print it
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagnames = new ArrayList<String>();
		for (WebElement string1 : bags) {
			String names1 = string1.getText();
			bagnames.add(names1);
		}
		System.out.println("List of all bag names:\n"+bagnames);
		

	}

}
