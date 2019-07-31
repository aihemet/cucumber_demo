package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElemants {


    public HomePageElemants() { PageFactory.initElements(Driver.getDriver(),this);}




    //fleet,
    //Vehicle,
    //Customer,Account, contact

    @FindBy( xpath="//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleet;

    @FindBy( xpath="//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement vehicle;


    @FindBy( xpath ="//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement Customers;

    @FindBy(xpath = "/html/body")
    public WebElement Accounts;


    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement forlogout;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/ul/li[5]/a")
    public WebElement logoutButton;


}









