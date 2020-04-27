import org.openqa.selenium.By;

public class RegistrationPage {
    public void register(){
        ElementHandler.sendKeysToElement(By.id("reg"), "hello");
    }
}