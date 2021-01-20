package br.com.meowlenium.testcases;

import br.com.meowlenium.framework.utils.bases.BaseTest;
import br.com.meowlenium.framework.webdrivers.DriverManager;
import br.com.meowlenium.pageobjects.TestingAutomationPageObject;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingAutomationTest extends BaseTest
{
    @Test(
            description = "Pratica de automação",
            priority = 4
    )
    public void automationPractice()
    {
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");

        Faker faker = new Faker();
      


    }
}