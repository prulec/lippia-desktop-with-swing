package com.crowdar.examples.services;

import com.crowdar.examples.constants.CalculatorConstants;
import net.sourceforge.marathon.javadriver.JavaDriver;
import net.sourceforge.marathon.javadriver.JavaProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CalculatorService {

    public static WebDriver driver;

	private CalculatorService() {}

    public static void openAppAndDriver() {
        JavaProfile profile = new JavaProfile(JavaProfile.LaunchMode.EXECUTABLE_JAR);
        profile.setExecutableJar("jar/Calculadora-Basica.jar");
        profile.setStartWindowTitle("Calculadora");
        driver = new JavaDriver(profile);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void plus() {
        driver.findElement(By.cssSelector(CalculatorConstants.SEVEN)).click();
        driver.findElement(By.cssSelector(CalculatorConstants.PLUS)).click();
        driver.findElement(By.cssSelector(CalculatorConstants.EIGHT)).click();
        driver.findElement(By.cssSelector(CalculatorConstants.EQUAL)).click();
    }

    public static void result() {
        String resultText = getResult();
        closeDriver();
        Assert.assertEquals(resultText,"15,00", "The result is different than expected...");
    }

    public static String getResult() {
        WebElement result = driver.findElement(By.cssSelector(CalculatorConstants.CALCULATOR_RESULTS));
        return result.getText().trim();
    }

}
