package com.united.utilies;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.united.base.Hook.driver;

public class Common {

    public static void waitUntil(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        }
        catch (Exception I){
        }
    }
    public  static void highlight_element(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style','background:;border:4px solid red;');",element);
    }
    }

