package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day13_FirstDriverClass {

    @Test
    public void firstDriverTest(){

        Driver.getDriver().get("https://www.amazon.com");// or
        //Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
        Driver.getDriver().navigate().to("https://www.google.com");// or
        //Driver.getDriver().navigate().to(ConfigurationReader.getProperty("google_url"));
        System.out.println("Google Title : "+Driver.getDriver().getTitle());
        Driver.closeDriver();
    }
}
