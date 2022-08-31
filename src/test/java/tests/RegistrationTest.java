package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {


        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();

            driver.get("https://community.element14.com/");

            Thread.sleep(3000);

            driver.findElement(By.cssSelector("[id=onetrust-accept-btn-handler]")).click();

            driver.findElement(By.xpath("(//span[@class='register_text'])[1]")).click();

            driver.findElement(By.cssSelector("[id=fragment-46_username]")).sendKeys("AsenaKbn");

            driver.findElement(By.cssSelector("[name=fragment-46_email]")).sendKeys("asenakeban@hotmail.com");

            driver.findElement(By.cssSelector("[name=fragment-46_password]")).sendKeys("1234567aZ");

            driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1234567aZ");

            Select select = new Select(driver.findElement(By.cssSelector("[id=fragment-46_profileFieldsForm_717170147_country")));
            select.selectByValue("GB");

            driver.findElement(By.cssSelector("[id=fragment-46_profileFieldsForm_1835267210_first-name")).sendKeys("Asena");

            driver.findElement(By.xpath("//input[@id='fragment-46_profileFieldsForm_614460147_last-name']")).sendKeys("Keban");

            driver.findElement(By.cssSelector("[name=fragment-46_acceptAgreement]")).click();

            driver.findElement(By.xpath("//html/body/div[2]/div[3]/div[1]/div/div/span")).click();

            driver.findElement(By.cssSelector(".button")).click();

            driver.quit();






        }



    }


