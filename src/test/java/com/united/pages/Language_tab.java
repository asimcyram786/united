package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hook.driver;

public class Language_tab {

    @FindBy(xpath = "//*[@id=\"localization-language-selector\"]")
    private WebElement language_selector_option;


    @FindBy(xpath = "//*[@id=\"localization-content-wrapper\"]/div[2]/div[1]/div/div/ul/li")
    private List<WebElement> dropDown_language;

    public List<WebElement> getDropDown_language() {
        return dropDown_language;
    }

    @FindBy(xpath = "//*[@id=\"localization-content-wrapper\"]/div[3]/button")
    private WebElement language_change_btn;

    public WebElement getLanguage_change_btn() {
        return language_change_btn;
    }



    public WebElement getLanguage_selector_option() {
        return language_selector_option;
    }

    public Language_tab(){
        PageFactory.initElements(driver,this);
    }
}
