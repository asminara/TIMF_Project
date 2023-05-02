import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log_In {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		//Given Software Link
		driver.get("https://timf.imikrof.com/");
		//Add Browser on Maximize Size
		driver.manage().window().maximize();
		
		//Add Email Id Of Log In Panel
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("");
		// Add Pass for Log iN
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("");
		
		WebElement login= driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
		login.click();
	}

}
