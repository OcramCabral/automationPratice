package br.com.meowlenium.testcases;

import br.com.meowlenium.framework.utils.bases.BaseTest;
import br.com.meowlenium.framework.webdrivers.DriverManager;
import br.com.meowlenium.pageobjects.AutomationPracticeBatistaPageObject;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPracticeBatista extends BaseTest
{
    @Test(
            description = "Pratica de automação",
            priority = 4
    )
    public void automationPractice()
    {
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://automacaocombatista.herokuapp.com/users/new");

        Faker faker = new Faker();
      

        AutomationPracticeBatistaPageObject page = new AutomationPracticeBatistaPageObject(driver);
        page.firstNameTextField().setText(faker.name().firstName());
        page.lastNameTextField().setText(faker.name().lastName());
        page.emailTextField().setText(faker.internet().safeEmailAddress());
        page.addressTextField().setText(faker.address().fullAddress());
        page.universityTextField().setText(faker.gameOfThrones().dragon());
        page.profileTextField().setText(faker.name().bloodGroup());
        page.genderTextField().setText(faker.yoda().toString());
        page.ageTextField().setText(faker.number().digit());
        page.submitButton().click();
        Assert.assertEquals(page.signUpMessageSucess().getText(), "Usuário Criado com sucesso");

    }
}