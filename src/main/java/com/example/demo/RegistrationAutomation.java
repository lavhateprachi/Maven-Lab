package com.example.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationAutomation {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the registration page
            driver.get("https://demo.automationtesting.in/Register.html");

            // Fill in the form
            WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstName.sendKeys("John");

            WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
            lastName.sendKeys("Doe");

            WebElement address = driver.findElement(By.tagName("textarea"));
            address.sendKeys("123 Main Street");

            WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
            email.sendKeys("john.doe@example.com");

            WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
            phone.sendKeys("1234567890");

            WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
            gender.click();

            WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
            hobbies.click();

            WebElement submitButton = driver.findElement(By.id("submitbtn"));
            submitButton.click();

            // Wait for a few seconds to see the result
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser window
            driver.quit();
        }
    }
}
