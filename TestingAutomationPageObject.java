package br.com.meowlenium.pageobjects;

import br.com.meowlenium.framework.widgets.web.IElement;
import br.com.meowlenium.framework.widgets.web.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestingAutomationPageObject {
    private WebDriver driver;

    public TestingAutomationPageObject(WebDriver driver){
        this.driver = driver;
    }

    public IElement usernameTextField(){
        return new Element(this.driver, By.id("username"));
    }
    
    public IElement myAccountLink(){
        return new Element(this.driver, By.xpath("//*[@id='menu-item-50']/a)"));
    }

    public IElement passwordLoginTextField(){
        return new Element(this.driver, By.id("password"));
    }

    public IElement loginButton(){
        return new Element(this.driver, By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/input[3]"));
    }
}
