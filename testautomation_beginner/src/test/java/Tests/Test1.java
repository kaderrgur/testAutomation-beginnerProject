package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();


            driver.get("https://demoqa.com/text-box");
            driver.manage().window().maximize();

            //String url = driver.navigate();
            //System.out.println(url);

            WebElement nameElement = driver.findElement(By.id("userName"));
            nameElement.click();
            nameElement.sendKeys("Kader");

            WebElement emailElement = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
            emailElement.click();
            emailElement.sendKeys("kader.gur@hangikredi.com");

            WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[id='currentAddress']"));
            currentAddress.click();
            currentAddress.sendKeys("Istanbul, Turkey");

            WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
            permanentAddress.click();
            permanentAddress.sendKeys("Istanbul, Turkey");

            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();

            WebElement nameText = driver.findElement(By.xpath("//div/p[@id='name']"));
            String name = nameText.getText();
            System.out.println(name);
    }




}
