package br.com.meowlenium.testcases;

import br.com.meowlenium.framework.utils.bases.BaseTest;
import br.com.meowlenium.framework.webdrivers.DriverManager;
import br.com.meowlenium.pageobjects.TestingAutomationPageObject;
import com.github.javafaker.Faker;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingAutomationTest extends BaseTest
{
    private WebDriver driver;
    private Faker faker;
    private TestingAutomationPageObject page;


    @Before
    public void init(){
        this.driver = DriverManager.getDriver();
        driver.get("http://practice.automationtesting.in/");
        this.faker = new Faker();
        this.page = new TestingAutomationPageObject(driver);
    }

    @Test(description = "Teste de Registrar Usuário",priority = 4)
    public void registerTest()
    {    
    }
}