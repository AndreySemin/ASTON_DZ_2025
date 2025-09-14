package Lesson_10_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MtsTest_1 {
    private WebDriver driver;
    private MtsHomePage mtsHomePage;
    private Actions action;

    @BeforeTest
    void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        waitForPageLoad(driver);
        mtsHomePage = new MtsHomePage(driver);
        mtsHomePage.asseptCookie();
        action = new Actions(driver);


    }
    private void waitForPageLoad(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test(priority = 1)
    public void checkCommunicationServices() throws InterruptedException{
        action.moveToElement(driver.findElement(By.className("pay__partners")));
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        // Проверка что Услуги связи выбран
        Assert.assertTrue(mtsHomePage.testCommunicationServices(),"'Услуга связи' выбран" );
        //Проверка значения в поле Номер телефона
        Assert.assertTrue(mtsHomePage.testPlaceholderPhoneNumber(), "Поле 'Номер телефона' присутствует");
        // Проверка значения в поле Сумма
        Assert.assertTrue(mtsHomePage.testConnectionSumm(),"Поле 'Сумма' присутствует");
        // Проверка значения в поле Email
        Assert.assertTrue(mtsHomePage.testConnectionEmail(), "Поле 'E-mail для отправки чека' присутствует'=");

    }

    @Test(priority = 2)
    public void checkHomeInternet(){
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        mtsHomePage.clickMenu();
        // Нажимает на Домашний интернет
        driver.findElement(By.xpath("//li[@class = 'select__item']")).click();
        waitForPageLoad(driver);
        Assert.assertTrue(mtsHomePage.testHomeInternet(), "поле 'Домашний интернет' выбрано");
        Assert.assertTrue(mtsHomePage.testinternetPhoneNumber(),"Поле 'Номер абонента' присутствует");
        Assert.assertTrue(mtsHomePage.testHomeInternetSumm(),"Поле 'Cумма' присутствует");
        Assert.assertTrue(mtsHomePage.testHomeInternetEmail(),"Поле 'E-mail для отправки чека' присутствует ");
    }
    @Test(priority = 3)
    public void checInstallmentPlan(){
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        mtsHomePage.clickMenu();
        // Нажимает на Рассрчка
        driver.findElement(By.xpath("//li[@class = 'select__item']/p[text() ='Рассрочка']")).click();
        waitForPageLoad(driver);
        Assert.assertTrue(mtsHomePage.testInstallmentPlan(),"Поле 'Рассрочка' выбрано");
        Assert.assertTrue(mtsHomePage.testAccountNumber44(),"Поле 'Номер Счета на 44' присутстсвует");
        Assert.assertTrue(mtsHomePage.testSummAccountNumber44(), "Поле 'Сумма' присутствует");
        Assert.assertTrue(mtsHomePage.testInstalmentEmail(), "Поле 'E_mail для отправки чека' присутcтвует");

    }
    @Test(priority = 4)
    public void checkArrears(){
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        mtsHomePage.clickMenu();
        // Нажимает на Задолженность
        driver.findElement(By.xpath("//li[@class = 'select__item']/p[text() ='Задолженность']")).click();
        waitForPageLoad(driver);
        Assert.assertTrue(mtsHomePage.testArrears(),"Поле 'Задолженнасть' выбрано");
        Assert.assertTrue(mtsHomePage.testScoreArrears2073(), "Поле 'Номер счета на 2073' присутствует");
        Assert.assertTrue(mtsHomePage.testArrearsSum(), " Поле 'Сумма' присутствует");
        Assert.assertTrue(mtsHomePage.testArrearsEmail(),"Поле 'E-mail для отправки чека' присутствует");
        driver.quit();
    }



}
