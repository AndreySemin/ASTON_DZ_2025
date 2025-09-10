package Lesson_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayPage {
    WebDriver driver;

    @FindBy(xpath = ("//*[@id=\"cookie-agree\"]"))
    WebElement acceptCookieButton;
    @FindBy(xpath = ("//button[@class = 'button button__default ']"))
    static WebElement buttonContinue;

    @FindBy(xpath = ("//input[@class = 'phone']"))
    static WebElement inputPhone;

    @FindBy(xpath = ("//input[@placeholder = 'Сумма']"))
    static WebElement inputCash;

    @FindBy(xpath = ("//input[@placeholder = 'E-mail для отправки чека']"))
    static WebElement mailInput;

    @FindBy(xpath = ("//iframe[@style='visibility: visible;'][1]"))
    WebElement frameallowpaymentrequest;

    public PayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void asseptCookie() {
        try {
            WebElement clickCookie = acceptCookieButton;
            clickCookie.click();
            System.out.println("Куки найдены");
        } catch (Exception e) {
            System.out.println("Куки не найдены");
        }
    }

    public static void continueButtonClick(){
        buttonContinue.click();
    }
    public static void interPhone(String phone){
        inputPhone.sendKeys(phone);
    }
    public static void interCash(String cash){
        inputCash.sendKeys(cash);
    }
    public static void interMail(String mail){
        mailInput.sendKeys(mail);
    }
    public boolean testInterPhone(){
        return inputPhone.isDisplayed();
    }
    public boolean testInterCash(){
        return inputCash.isDisplayed();
    }
    public boolean testinterMail(){
        return mailInput.isDisplayed();
    }
}

