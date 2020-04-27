import org.openqa.selenium.By;

public class LoginPage {
    public void pressLogin(){
        ElementHandler.clickElement(By.id("login"));
    }
}