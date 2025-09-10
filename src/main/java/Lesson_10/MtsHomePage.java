package Lesson_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtsHomePage {
    WebDriver driver;

    @FindBy(xpath = ("//*[@id=\"cookie-agree\"]"))
    WebElement acceptCookieButton;
    @FindBy(xpath = ("//button[@class = 'button button__default ']"))
    WebElement buttonContinue;

    @FindBy(xpath = ("//input[@class = 'phone']"))
    WebElement inputPhone;

    @FindBy(xpath = ("//input[@placeholder = 'Сумма']"))
    WebElement inputCash;

    @FindBy(xpath = ("//input[@placeholder = 'E-mail для отправки чека']"))
    WebElement mailInput;

    @FindBy(xpath = ("//span[@class = 'select__arrow']"))
    WebElement menu;
// Услуги связи
    @FindBy(xpath = ("//span[@class = 'select__now'][text()='Услуги связи']"))
    WebElement communicationServices;

    @FindBy(xpath = ("//input[@id ='connection-phone'][@placeholder='Номер телефона']"))
    WebElement connectionPhoneNumber;

    @FindBy(xpath = ("//input[@id = 'connection-sum'][@placeholder='Сумма']"))
    WebElement connectionSumm;

    @FindBy(xpath = ("//input[@id= 'connection-email'][@placeholder ='E-mail для отправки чека']"))
    WebElement connectionEmail;

    // Домашний Интернет
    @FindBy(xpath = ("//span[@class='select__now'][text() = 'Домашний интернет']"))
    WebElement homeInternet;

    @FindBy(xpath = ("//input[@id = 'internet-phone'][@placeholder = 'Номер абонента']"))
    WebElement internetPhoneNumber;

    @FindBy(xpath = ("//input[@id = 'internet-sum' ][@placeholder = 'Сумма']"))
    WebElement homeInternetSumm;

    @FindBy(xpath = ("//input[@id ='internet-email'][@placeholder = 'E-mail для отправки чека']"))
    WebElement homeInternetEmail;

    //Рассрочка

    @FindBy(xpath = ("//span[@class='select__now'][text() = 'Рассрочка']"))
    WebElement installmentPlan;

    @FindBy(xpath = ("//input[@id = 'score-instalment'][@placeholder = 'Номер счета на 44']"))
    WebElement accountNumber44;

    @FindBy(xpath = ("//input[@id='instalment-sum'][@placeholder = 'Сумма']"))
    WebElement summAccountNumber44;

    @FindBy(xpath = ("//input[@id = 'instalment-email'][@placeholder = 'E-mail для отправки чека']"))
    WebElement instalmentEmail;


    //Задолженности
    @FindBy(xpath = ("//span[@class = 'select__now'][text() = 'Задолженность']"))
    WebElement arrears;

    @FindBy(xpath = ("//input[@id = 'score-arrears'][@placeholder = 'Номер счета на 2073']"))
    WebElement scoreArrears2073;

    @FindBy(xpath = ("//input[@id = 'arrears-sum'][@placeholder = 'Сумма']"))
    WebElement arrearsSum;

    @FindBy(xpath = ("//input[@id = 'arrears-email'][@placeholder = 'E-mail для отправки чека']"))
    WebElement arrearsEmail;

    public MtsHomePage(WebDriver driver) {
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







    public void clickMenu(){
        menu.click();
    }
    public boolean testCommunicationServices(){
        return communicationServices.isDisplayed();
    }
    public boolean testPlaceholderPhoneNumber(){
        return connectionPhoneNumber.isDisplayed();
    }
    public boolean testConnectionSumm(){
        return connectionSumm.isDisplayed();
    }
    public boolean testConnectionEmail(){
        return connectionEmail.isDisplayed();
    }
    public boolean testHomeInternet(){
        return homeInternet.isDisplayed();
    }
    public boolean testinternetPhoneNumber(){
        return internetPhoneNumber.isDisplayed();
    }
    public boolean testHomeInternetSumm(){
        return homeInternetSumm.isDisplayed();
    }
    public boolean testHomeInternetEmail(){
        return homeInternetEmail.isDisplayed();
    }
    public boolean testinstallmentPlan(){
        return installmentPlan.isDisplayed();
    }
    public boolean testInstallmentPlan(){
        return installmentPlan.isDisplayed();
    }
    public boolean testAccountNumber44(){
       return accountNumber44.isDisplayed();
    }
    public boolean testSummAccountNumber44(){
       return summAccountNumber44.isDisplayed();
    }
    public boolean testInstalmentEmail(){
       return instalmentEmail.isDisplayed();
    }
    public boolean testArrears(){
       return arrears.isDisplayed();
    }
    public boolean testScoreArrears2073(){
       return scoreArrears2073.isDisplayed();
    }
    public boolean testArrearsSum(){
       return arrearsSum.isDisplayed();
    }
    public boolean testArrearsEmail(){
       return arrearsEmail.isDisplayed();
    }





}
