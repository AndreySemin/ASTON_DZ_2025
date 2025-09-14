package Lesson_10_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PayPage {
    WebDriver driver;

    @FindBy(xpath = "//div[contains(@class, 'pay__partners')]//img")
    List<WebElement> logos;

    public PayPage(WebDriver driver){
        this.driver =  driver;
        PageFactory.initElements(driver,this);
    }
    public List<WebElement> getLogos() {
        return logos;
    }
}
