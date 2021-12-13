package com.united.test_runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/united"},
        tags = "@Sanity",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class CukesRunner extends AbstractTestNGCucumberTests {





}


//@smoke
//@Sanity