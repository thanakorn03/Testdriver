package webdriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestDriver {

	@Disabled
	void testSearchByKeyword1() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().setSize(new Dimension(1050, 840));
	        driver.findElement(By.id("APjFqb")).sendKeys("scnpru");
	        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	        String actual = driver.findElement(By.xpath("//*[@id=\"_P-hjZ5ifN9OhseMPztzT6Q8_41\"]/div[1]/div[2]/div[1]/div/div/h2/span")).getText();
	       // System.out.println("Result ="+result);
	        String expected = "คณะวิทยาศาสตร์และเทคโนโลยี มหาวิทยาลัยราชภัฏนครปฐม";
	        assertEquals(expected,actual);
	        driver.close();
	}
	@Disabled
	void testSearchByKeyword2() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().setSize(new Dimension(1050, 840));
	        driver.findElement(By.id("APjFqb")).sendKeys("kru");
	        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	        String actual = driver.findElement(By.xpath("//*[@id=\"_P-hjZ5ifN9OhseMPztzT6Q8_41\"]/div[1]/div[2]/div[1]/div/div/h2/span")).getText();
	       // System.out.println("Result ="+result);
	        String expected = "มหาลัยราชภัฎกาญจบุรี";
	        assertEquals(expected,actual);
	        driver.close();
	}
	@Test
	void testSearchCalculator() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().setSize(new Dimension(1050, 840));
	        driver.findElement(By.id("APjFqb")).sendKeys("7+5");
	        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	        String actual = driver.findElement(By.id("cwos")).getText();
	       // System.out.println("Result ="+result);
	        String expected = "12";
	        assertEquals(expected,actual);
	        driver.close();
	}

}
