package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPageElements;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login_sd {


    @Given("OPEN THE LOG IN PAGE")
    public void open_THE_LOG_IN_PAGE() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @Then("user log in with username and password")
    public void user_log_in_with_username_and_password() {
        LoginPageElements loginPageElements= new LoginPageElements();
        loginPageElements.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }

    @Then("user on the home page")
    public void user_on_the_home_page() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(Driver.getDriver().getTitle());
    Driver.closeDriver();

    }





    @Then("manager log in with username and password")
    public void manager_log_in_with_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
       LoginPageElements loginPageElements=new LoginPageElements();
       loginPageElements.login(ConfigurationReader.getProperty("StoreManager_username"),ConfigurationReader.getProperty("StoreManager_password"));
    }

    @Then("manager on the home page")
    public void manager_on_the_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       Thread.sleep(300);
        System.out.println(Driver.getDriver().getTitle());
       Driver.closeDriver();
    }


}
