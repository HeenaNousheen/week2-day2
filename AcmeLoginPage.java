package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLoginPage {
	public static void main(String[] args) {
		/* Load url "https://acme-test.uipath.com/login"
		2. Enter email as "kumar.testleaf@gmail.com"
		3. Enter Password as "leaf@12"
		4. Click login button
		5. Get the title of the page and print
		6. Click on Log Out
		7. Close the browser (use -driver.close())
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String titlePrint = driver.getTitle();
		System.out.println(titlePrint);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
	}

}
