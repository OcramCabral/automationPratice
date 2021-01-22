package br.com.meowlenium.testcases;

import br.com.meowlenium.framework.utils.bases.BaseTest;
import br.com.meowlenium.framework.webdrivers.DriverManager;
import br.com.meowlenium.pageobjects.TestingAutomationPageObject;
import com.github.javafaker.Faker;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingAutomationTest extends BaseTest
{
    @Test(
            description = "Lista items de venda",
            priority = 1
    )
    public void automationPracticeListItems()
    {
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");

        TestingAutomationPageObject page = new TestingAutomationPageObject(driver);

        page.shopMenu().click();
    }

    @Test(
            description = "Adicionando um item no carrinho de compra",
            priority = 2
    )
    public void automationPractice()
    {
        WebDriver driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");


        Faker faker = new Faker();
        Random r = new Random();
        TestingAutomationPageObject page = new TestingAutomationPageObject(driver);

        page.shopMenu().click();
        page.selectSeleniumBook().click();
        page.inputBooks().setText("5");
        page.addToBasket().click();
        page.viewBasket().click();
        Assert.assertEquals(page.confirmationViewBasket().getText(), "Basket Totals");   
    }
}