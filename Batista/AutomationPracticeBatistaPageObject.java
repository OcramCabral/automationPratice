package br.com.meowlenium.pageobjects;

import br.com.meowlenium.framework.widgets.web.IElement;
import br.com.meowlenium.framework.widgets.web.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPracticeBatistaPageObject {
    private WebDriver driver;

    public AutomationPracticeBatistaPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public IElement firstNameTextField() {
        return new Element(this.driver, By.id("user_name"));
    }

    public IElement lastNameTextField() {
        return new Element(this.driver, By.id("user_lastname"));
    }

    public IElement emailTextField() {
        return new Element(this.driver, By.id("user_email"));
    }

    public IElement addressTextField() {
        return new Element(this.driver, By.id("user_address"));
    }

    public IElement universityTextField() {
        return new Element(this.driver, By.id("user_university"));
    }
    
    public IElement profileTextField() {
        return new Element(this.driver, By.id("user_profile"));
    }

    public IElement genderTextField() {
        return new Element(this.driver, By.id("user_gender"));
    }

    public IElement ageTextField() {
        return new Element(this.driver, By.id("user_age"));
    }

    public IElement submitButton() {
        return new Element(this.driver, By.name("commit"));
    }
    
    public IElement signUpMessageSucess() {
        return new Element(this.driver, By.id("notice"));
    }


}