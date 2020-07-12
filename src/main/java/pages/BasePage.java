package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;
    protected String url;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForJSToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        ExpectedCondition<Boolean> jQueryLoad = driver -> {
            try {
                return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
            }
            catch (Exception e) {
                return true;
            }
        };

        ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState")
                                                                                   .toString().equals("complete");

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }


}
