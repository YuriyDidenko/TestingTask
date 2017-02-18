import PageObjects.Chapter1Page;
import PageObjects.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProvTest {

    @Test(description = "checks availability of text", dataProvider = "textDataProvider")
    public void testTextAvailability(String providersText) {

        HomePage homePage = open("http://book.theautomatedtester.co.uk/", HomePage.class);
        // would be good to check if opening was successful

        Chapter1Page chapter1Page = homePage.clickChapter1Link();
        // would be good to check here too

        // made in such way, because we check only text on the page, not special element.
        $(By.xpath("//*")).shouldHave(text(providersText));

        chapter1Page.clickHomePageLink();
        // would be good to check here too
    }

    @DataProvider
    public Object[][] textDataProvider() {
        final String verifiableText = "Assert that this text is on the page";
        return new Object[][]
                {
                        {verifiableText}
                };
    }
}
