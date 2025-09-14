package Lesson_10_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = ("//*[@id=\"cookie-agree\"]"))
    WebElement acceptCookieButton;

    @FindBy(xpath = ("//div[@class = 'pay__wrapper']//h2"))
    WebElement blockTitle;

    @FindBy(xpath = ("//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/'] "))
    WebElement infoLink;

    @FindBy(xpath = ("//button[@class = 'button button__default ']"))
    WebElement buttonContinue;

    @FindBy(xpath = ("//input[@class = 'phone']"))
    WebElement inputPhone;

    @FindBy(xpath = ("//input[@placeholder = 'Сумма']"))
    WebElement inputCash;

    @FindBy(xpath = ("//input[@placeholder = 'E-mail для отправки чека']"))
    WebElement mailInput;

    @FindBy(xpath = ("//iframe[@src = 'https://checkout.bepaid.by/widget_v2/index.html']"))
    public WebElement frameallowpaymentrequest;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void asseptCookie(){
        try {
            WebElement clickCookie = acceptCookieButton;
            clickCookie.click();
            System.out.println("Куки найдены");
        } catch (Exception e) {
            System.out.println("Куки не найдены");
        }

    }
    public String getBlockTitleText(){
        return blockTitle.getText().replace("\n", " ");
    }
    public void clickInfoLink(){
        infoLink.click();
    }
    public void continueButtonClick(){
        buttonContinue.click();
    }
    public void interPhone(String phone){
        inputPhone.sendKeys(phone);
    }
    public void interCash(String cash){
        inputCash.sendKeys(cash);
    }
    public void interMail(String mail){
        mailInput.sendKeys(mail);
    }

    public WebElement getContinueButton(){
        return buttonContinue;
    }
    public String getContinueButtonText(){
        return buttonContinue.getText();
    }


    }




