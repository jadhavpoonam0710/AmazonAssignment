package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();
			String path = System.getProperty("user.dir") + "//src//main//java//configLayer//config.properties";
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver-win32\\chromedriver.exe");		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	}



