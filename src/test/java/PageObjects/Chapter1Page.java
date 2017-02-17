package PageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by ydidenko on 16.02.2017.
 */
public class Chapter1Page {

//    private SelenideElement text;

    public HomePage clickHomePageLink() {
        $(By.xpath("//a[@href='/']")).click();
        return page(HomePage.class);
    }


}
