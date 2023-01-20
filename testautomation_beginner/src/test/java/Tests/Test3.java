package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        //String url = driver.navigate();
        //System.out.println(url);

        //Elementin tıklanabilir olup olmadığını kontrol ediyoruz.
        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println(isEnabled);

        //Eğer element tıklanabilir değilse try catch methodu ile ilgili adımı atlamış oluyoruz.
        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        try{
            sportCheckbox.click();
        }
        catch(ElementClickInterceptedException e){
            sportCheckboxLabel.click();
            System.out.println("Entered catch block!");
        }

        //Elementin seçilip seçilmediğini kontrol ediyoruz.
        boolean isSelected = sportCheckbox.isSelected();
        System.out.println(isSelected);

    }
}