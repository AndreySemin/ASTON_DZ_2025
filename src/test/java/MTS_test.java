import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MTS_test {
    WebDriver driver;

    By blockName = By.xpath("//div[@class = 'pay__wrapper']//h2"); //Название блока

    By visa = By.xpath("//img[@alt = 'Visa']"); //Логотип visa
    By verifiedVisa = By.xpath("//img[@alt = 'Verified By Visa']"); //Логотип VerifiedVisa
    By masterCard = By.xpath("//img[@alt = 'MasterCard']"); //Логотип MasterCard
    By MasterCardSecure = By.xpath("//img[@alt = 'MasterCard Secure Code']");//Логотип MasterCard Secure Code
    By bellcard = By.xpath("//img[@alt = 'Белкарт']"); // Логотип Белкарт
    By servise = By.xpath("//a[@href = '/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']"); // Подробнее о сервисе
    By inputPhone = By.xpath("//input[@class = 'phone']");//Ввод телефона
    By imputSumm = By.xpath("//input[@placeholder = 'Сумма']"); // Сумма платежа
    By imputMail = By.xpath("//input[@placeholder = 'E-mail для отправки чека']"); // Почта

    By buttonContinue = By.xpath("//button[@class = 'button button__default ']");
    static final String Visa = "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg";
    static final String VerifiedVisa = "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg";
    static final String MasterCard = "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg";
    static final String MasterSecure = "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg";
    static final String BellCard = "https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg";

    @BeforeTest
    void setup() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");


        driver = new ChromeDriver();
        driver.get("https://www.mts.by");
        try {
            WebElement clickCookie = driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]"));
            clickCookie.click();
            System.out.println("Куки найдены");
        } catch (Exception e) {
            System.out.println("Куки не найдены");
        }
    }

    @Test
    public void nameBlock() {
        WebElement block = driver.findElement(blockName);
        if (block != null) {
            Actions actions = new Actions(driver);
            actions.moveToElement(block).perform();
            String text1 = "Онлайн пополнение ";
            String text2 = " без комиссии";
            String actualText = block.getText().replace("\n", " ");
            if (actualText.contains(text1) & actualText.contains(text2)) {
                System.out.println("Текст присутствует " + actualText);
            } else {
                System.out.println("Текст отсутствует " + actualText);
            }

        } else {
            System.err.println("Нет текста");
        }
    }

    @Test
    public void checkLogoVisa() {
        WebElement logoVisa = driver.findElement(visa);
        Assert.assertEquals(logoVisa.getAttribute("src"), Visa);
    }

    @Test
    public void checkLogoVisaVerified() {
        WebElement logoVisaVerified = driver.findElement(verifiedVisa);
        Assert.assertEquals(logoVisaVerified.getAttribute("src"), VerifiedVisa);
    }

    @Test
    public void checkMaster() {
        WebElement logoMaster = driver.findElement(masterCard);
        Assert.assertEquals(logoMaster.getAttribute("src"), MasterCard);
    }

    @Test
    public void checkMacterCardSecure() {
        WebElement logoSecure = driver.findElement(MasterCardSecure);
        Assert.assertEquals(logoSecure.getAttribute("src"), MasterSecure);
    }

    @Test
    public void checkBellCard() {
        WebElement logoBellCard = driver.findElement(bellcard);
        Assert.assertEquals(logoBellCard.getAttribute("src"), BellCard);
    }

    @Test
    public void aboutService()  {
        WebElement lernAboutService = driver.findElement(servise);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        lernAboutService.click();
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/")) {
            System.out.println("Успешно перешли на страницу Подробнее о сервисе");
        } else {
            System.out.println("Переход на страницу не выполнен");
        }
        WebElement back = driver.findElement(By.xpath("//span[@itemprop ='name']"));
        back.click();
    }
    @Test(priority = 8)
    public void input(){
        WebElement phone = driver.findElement(inputPhone);
        WebElement cash = driver.findElement(imputSumm);
        WebElement mail = driver.findElement(imputMail);

        phone.sendKeys("297777777");
        cash.sendKeys("200");
        mail.sendKeys("input@mail.ru");
        WebElement button = driver.findElement(buttonContinue);
        button.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String curentUrl = driver.getCurrentUrl();
        if(curentUrl.contains("https://www.mts.by/")){
            System.out.println("Поля заполнены проверка выполнена");
        }
        else {
            System.out.println("Поля не заполнены ");
        }
        driver.quit();
    }
}

