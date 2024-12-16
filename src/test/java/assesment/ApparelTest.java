package assesment;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ApparelTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationteststore.com/");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & accessories')])[2]")).isDisplayed();
		
	}
}
