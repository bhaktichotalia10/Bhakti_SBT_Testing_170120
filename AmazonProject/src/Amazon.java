import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//search grocery product
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("grocery");
		WebElement search = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		search.click();
		WebElement groceryItem = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/span/a/div/img"));
		groceryItem.click();
		
		//Add to cart product 1
		Set<String> id1 = driver.getWindowHandles();
        Iterator<String> it1 = id1.iterator();
        String parentId1 = it1.next();
        String childId1 = it1.next();
        driver.switchTo().window(childId1);
        driver.findElement(By.id("add-to-cart-button")).click();
		
		//search apparel
        driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("women top");
		WebElement search1 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		search1.click();
		WebElement apparelItem = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div/span/a/div/img"));
		apparelItem.click();
		
		//Add to cart product 2
		Set<String> id2 = driver.getWindowHandles();
        Iterator<String> it2 = id2.iterator();
        String parentId2 = it2.next();
        String childId2 = it2.next();
        String childId3 = it2.next();
        driver.switchTo().window(childId3);
        driver.findElement(By.id("add-to-cart-button")).click();
        
        //search mobile phone
        driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		WebElement search2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		search2.click();
		WebElement mobile = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/span/div/div[1]/div/div/div/ol/li[1]/div/div/span/a/div/img"));
		mobile.click();
		
		//Add to cart product 3
		Set<String> id3 = driver.getWindowHandles();
        Iterator<String> it3 = id3.iterator();
        String parentId3 = it3.next();
        String childId4 = it3.next();
        String childId5 = it3.next();
        String childId6 = it3.next();
        driver.switchTo().window(childId6);
        driver.findElement(By.id("add-to-cart-button")).click();
        
        //search kitchen item
        driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sugar");
		WebElement search3 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		search3.click();
		WebElement kitchen = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div/div/span/a/div/img"));
		kitchen.click();
		
		//add to cart product 4
		Set<String> id4 = driver.getWindowHandles();
        Iterator<String> it4 = id4.iterator();
        String parentId4 = it4.next();
        String childId7 = it4.next();
        String childId8 = it4.next();
        String childId9 = it4.next();
        String childId10 = it4.next();
        driver.switchTo().window(childId10);
        driver.findElement(By.id("add-to-cart-button")).click();
        
        //view cart
        WebElement viewcart = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[4]/div/div/div/span[1]/span/span/a"));
		viewcart.click();
	}
}
