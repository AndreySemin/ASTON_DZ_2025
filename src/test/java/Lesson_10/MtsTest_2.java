package Lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MtsTest_2 {
    private WebDriver driver;
    private PayPage payPage;
    private Actions action;

    @BeforeTest
    void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        waitForPageLoad(driver);
        payPage = new PayPage(driver);
        payPage.asseptCookie();
        action = new Actions(driver);
    }

    private void waitForPageLoad(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    private void testInter() {
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        PayPage.interPhone("297777777");
        PayPage.interCash("200");
        PayPage.interMail("input@mai.ru");
        PayPage.continueButtonClick();

    }

    @Test(priority = 2)
    private void checkSumm() throws InterruptedException {
        driver.switchTo().frame(payPage.frameallowpaymentrequest);
        Thread.sleep(5000);
        WebElement sum = driver.findElement(By.xpath("//div[@class='pay-description__cost']/span[text() = '200.00 BYN'] "));
        Assert.assertTrue(sum.isDisplayed(),"Сумма не состветствует");
    }
    @Test(priority = 3)
    private void checkSummButton(){
        WebElement summButton = driver.findElement(By.xpath("//button[@class='colored disabled'][text()=' Оплатить  200.00 BYN ']"));
        Assert.assertTrue(summButton.isDisplayed(), "Сумма не соответствует");
    }
    @Test(priority = 4)
    private void checkPhoneNumber(){
        WebElement phoneNumber = driver.findElement(By.xpath("//div[@class ='pay-description__text']/span[contains (text(),  'Номер:375297777777')]"));
        Assert.assertTrue(phoneNumber.isDisplayed(),"Номер телефона не соответствует");
    }
    @Test(priority = 5)
    private void checkTextNumberCard(){
        WebElement textNumberCard = driver.findElement(By.xpath("//label[@class='ng-tns-c2312288139-1 ng-star-inserted'][text() = 'Номер карты']"));
        Assert.assertTrue(textNumberCard.isDisplayed(), "Номер карты не отображается");
    }
    @Test(priority = 6)
    private void checkValidityPeriod(){
        WebElement textValidityPeriod = driver.findElement(By.xpath("//label[@class='ng-tns-c2312288139-4 ng-star-inserted'][text() = 'Срок действия']"));
        Assert.assertTrue(textValidityPeriod.isDisplayed(),"Срок действия не отображается");
    }
    @Test(priority = 7)
    private void checkTextCvc(){
        WebElement textCvc = driver.findElement(By.xpath("//label[@class='ng-tns-c2312288139-5 ng-star-inserted'][text() = 'CVC']"));
        Assert.assertTrue(textCvc.isDisplayed(),"CVC не отображается");
    }
    @Test(priority = 8)
    private void checkNameSurname(){
        WebElement textNameSurname = driver.findElement(By.xpath("//label[@class='ng-tns-c2312288139-3 ng-star-inserted'][text() = 'Имя и фамилия на карте']"));
        Assert.assertTrue(textNameSurname.isDisplayed(),"Имя и Фамилия на карте, Не отображается");
    }
    @Test(priority = 9)
    private void checkVisa(){
        WebElement visaIcon = driver.findElement(By.xpath("//img[@class='ng-tns-c891095944-0 ng-star-inserted']"));
        Assert.assertTrue(visaIcon.isDisplayed(), "Икона Visa не отображается");
    }
    @Test(priority = 10)
    private void checkMasterCard(){
        WebElement masterCardIcon = driver.findElement(By.xpath("//img[@class='ng-tns-c891095944-0 ng-star-inserted']"));
        Assert.assertTrue(masterCardIcon.isDisplayed(), "Икона МasterCard не отображается");
    }
    @Test(priority = 11)
    private void checkBelkart(){
        WebElement belkart = driver.findElement(By.xpath("//img[@class='ng-tns-c891095944-0 ng-star-inserted']"));
        Assert.assertTrue(belkart.isDisplayed(),"Икона Belkart не отображается");
    }
    @Test(priority = 12)
    private void checkMirCard(){
        WebElement MirCard = driver.findElement(By.xpath("//div[@class='cards-brands cards-brands_random ng-tns-c891095944-0 ng-star-inserted']"));
        Assert.assertTrue(MirCard.isDisplayed(),"Икона MirCard не отображается");
        driver.quit();
    }



}

