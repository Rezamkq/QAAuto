import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class TestBoxTest {

    @Test
    void fillerTest(){
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = 1000000;


        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("firstName");
        $("#lastName").setValue("lastName");

        $("#userEmail").setValue("SomeEmail@mail.com");
        $(Selectors.byText("Male")).click();
        // $("#gender-radio-1").click();
        $(Selectors.byText("Sports")).click();
        $("#userNumber").setValue("8888888888");







    }

}
