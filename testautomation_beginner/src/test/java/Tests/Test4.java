package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        //String url = driver.navigate();
        //System.out.println(url);


        //Elementin tıklanabilir olup olmadığını kontrol ettik.
        WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();
        if(isEnabled){
            yesRadioButtonLabel.click();
            System.out.println("Clicked Radio Button!!");
        }

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

        //Elementin seçili olup olmadığını kontrol ettik.
        boolean isSelected = yesRadioButton.isSelected();
        if(isSelected){
            System.out.println("Yes Selected");
        }

        WebElement output = driver.findElement(new By.ByCssSelector(".mt-3"));
        System.out.println(output.getText());







    }
}