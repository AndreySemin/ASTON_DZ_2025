package Lesson_9_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Mts_test {
    private WebDriver driver;
    private HomePage homePage;
    private PayPage payPage;

    @BeforeTest
    void setup() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        waitForPageLoad(driver);
        homePage = new HomePage(driver);
        homePage.asseptCookie();
        payPage = new PayPage(driver);

    }
    private void waitForPageLoad(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




    @Test(priority = 1)
    public void titleText(){
        String text1 = "Онлайн пополнение ";
        String text2 = " без комиссии";
        String actualText = homePage.getBlockTitleText();
        if (actualText.contains(text1) & actualText.contains(text2)) {
            System.out.println("Текст присутствует " + actualText);
        } else {
            System.out.println("Текст отсутствует " + actualText);
        }
    }
    @Test(priority = 2)
    public void testMoreInfoLink() {
        waitForPageLoad(driver);
        homePage.clickInfoLink();
        ExpectedConditions.urlContains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"),
                "Failed to navigate to 'Подробнее о сервисе' page. Current URL: " + currentUrl);

        driver.navigate().back();
        ExpectedConditions.urlToBe("https://www.mts.by/");
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.mts.by/", "Failed to return to the home page after clicking 'Подробнее о сервисе'");
    }
    @Test(priority = 3)
    public void testLogoPay(){
        Assert.assertNotNull(payPage.getLogos());
    }
    @Test(priority = 4)
    private void testButtonContinue(){
        String continueButtonText = homePage.getContinueButtonText();
        Assert.assertEquals(continueButtonText,"Продолжить");
        Assert.assertTrue(homePage.getContinueButton().isDisplayed());
    }
    @Test(priority = 5)
    private void testContinueButtonClick(){
        homePage.interPhone("297777777");
        homePage.interCash("300");
        homePage.interMail("input@mai.ru");
        homePage.continueButtonClick();
        waitForPageLoad(driver);
        ExpectedConditions.frameToBeAvailableAndSwitchToIt(homePage.frameallowpaymentrequest);
    }





    }



