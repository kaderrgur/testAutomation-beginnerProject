package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        //String url = driver.navigate();
        //System.out.println(url);

        //Opsiyon bir
        String checkboxValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement checkBox = driver.findElement(new By.ByCssSelector(checkboxValue));
        checkBox.click();

        //Opsiyon iki
        //WebElement checkBox2 = driver.findElement(new By.ByCssSelector("label[for='tree-node-home'] span.rct-checkbox svg"));
        //checkBox2.click();

        //Elementi otomasyona tekrar buldurduk.
        checkBox = driver.findElement(new By.ByCssSelector(checkboxValue));

        //Checkbox class ismini getAattribute ile buldurup Stringe atadık.
        String checkBoxClass = checkBox.getAttribute("class");

        //equals ile verilen class ismi ile bulunan class ismini karşılaştırmış olduk.
        if (checkBoxClass.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked!");
        }
        else{
            System.out.println("Checkbox is unchecked!");
        }

    }

}
