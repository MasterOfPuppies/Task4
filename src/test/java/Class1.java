import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by EgorZhuravlev on 7/13/2016.
 */
public class Class1 {


    private static final By INPUT_USERNAME_CSS = By.cssSelector("#Username");
    private static final By INPUT_USERNAME_XPATH = By.xpath("//div[@id='Username']");
    private static final By INPUT_PASSWORD_CSS = By.cssSelector("#Password");
    private static final By INPUT_PASSWORD_XPATH = By.xpath("//div[@id='Password']");
    private static final By REMEMBERME_LABEL_CSS = By.cssSelector(".editor-chbox>span");
    private static final By REMEMBERME_LABEL_XPATH = By.xpath("//div[@class='remember-chBox']/span");
    private static final By REMEMBERME_INPUT_CSS = By.cssSelector(".remember-chBox>label>span");
    private static final By REMEMBERME_INPUT_XPATH = By.xpath("//div[@class='remember-chBox']/label/span");
    private static final By LOGIN_CSS = By.cssSelector("#SubmitButton");
    private static final By LOGIN_XPATH = By.xpath("//div[@id='SubmitButton']");
    private static final By SIGNOUT_CSS = By.cssSelector(".sign-out-span>a>ins");
    private static final By SIGNOUT_XPATH = By.xpath("//div[@class='menu-links']/span[@class='sign-out-span']/a/ins");
    private static final By ALL_LINKS_OFFICES_CSS = By.cssSelector("a[href*='#Office-Chapaeva']");
    private static final By ALL_LINKS_OFFICES_XPATH = By.xpath("//a[contains(text(),'Chapaeva')]");
    private static final By CHAPAEVA118_LINK_OFFICE_CSS = By.cssSelector("a[href='#Office-Chapaeva 118']");
    private static final By CHAPAEVA118_LINK_OFFICE_XPATH = By.cssSelector("//a[contains(@href,'#Office-Chapaeva 118')]");
    private static final By LUNCHVOTING_CSS = By.cssSelector(".lunchvoting");
    private static final By LUNCHVOTING_XPATH = By.xpath("//a[@href='https://lunchvoting.issoft.by/']");
    private static final By VACATION_TAB = By.xpath("//a[@id='vacationMenu']");
    private static final By TO_XPATH = By.xpath("//div[@id='thirdContainer']/span");
    private static final By TO_CSS = By.cssSelector("#thirdContainer>span");
    private static final By CC_XPATH = By.xpath("//div[@id='fourthContainer']/span");
    private static final By CC_CSS = By.cssSelector("#fourthContainer>span");
    private static final By COMPANY_TAB = By.cssSelector("#companyMenu");//li[contains(@class,'company-record')]
    private static final By COMPANIES_CSS = By.cssSelector(".company-record");
    private static final By COMPANIES_XPATH = By.xpath("//li[contains(@class,'company-record')]");
    private static final By CONTACTS_CSS = By.cssSelector(".tab-link-contact");
    private static final By CONTACTS_XPATH = By.xpath("//a[contains(@class,'tab-link-contact')]");

    @Test
    public static void test1() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://192.168.100.26/");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement inputUsername = driver.findElement(INPUT_USERNAME_CSS);
        WebElement inputPassword = driver.findElement(INPUT_PASSWORD_CSS);
        WebElement loginButton = driver.findElement(LOGIN_CSS);


        inputUsername.sendKeys("EugenBorisik");
        inputPassword.sendKeys("1");
        loginButton.click();

        WebElement vacationTab = driver.findElement(VACATION_TAB);
        vacationTab.click();

        WebElement companyTab = driver.findElement(COMPANY_TAB);
        companyTab.click();



        driver.close();
    }

}
