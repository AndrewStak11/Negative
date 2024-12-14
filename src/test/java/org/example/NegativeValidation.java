package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class NegativeValidation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://skillfactory.ru/");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.t-input-group.t-input-group_nm > div > input")).sendKeys("000122");
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.t-input-group.t-input-group_em > div > input")).sendKeys("Something@");
            driver.findElement(By.cssSelector("#input_1676828667932")).sendKeys("(851) 393-9");
            driver.findElement(By.cssSelector("#form625408054 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}