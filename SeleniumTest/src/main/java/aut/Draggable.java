package aut;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement eledrag = driver.findElementByXPath("//div[@id='draggable']");
		WebElement eledroppable = driver.findElementByXPath("//div[@id='droppable']");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(eledrag, eledroppable).click().perform();
		driver.close();
	}

}
