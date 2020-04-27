import org.junit.Test;

public class UtilClassTest {
    @Test
    public void test01_register(){
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.register();
    }

    @Test
    public void test02_login(){
        LoginPage loginPage = new LoginPage();
        loginPage.pressLogin();
    }
}
