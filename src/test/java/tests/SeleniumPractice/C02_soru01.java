package tests.SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_soru01 {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //chromedriver","src/drivers/chromedriver.exe
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com.tr");
        System.out.println(driver.getTitle()); //Amazon.com. Spend less. Smile more.

        String expectedKelime = "alisveris";
        String pageSource = driver.getPageSource();

        if (pageSource.contains(expectedKelime)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.close();

    }




}
