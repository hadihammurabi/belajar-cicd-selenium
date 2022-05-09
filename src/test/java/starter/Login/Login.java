package starter.Login;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.thucydides.core.annotations.Step;

public class Login {
    WebDriver web;

    public Login() {
        ChromeOptions opts = new ChromeOptions();
        opts.setHeadless(true);
        web = new ChromeDriver(opts);
    }

    @Step("I as on the login page")
    public void onTheLoginPage() throws Exception {
        web.get("https://qa.alta.id/auth/login");
        Thread.sleep(5000);
    }
    @Step("I enter my username and password correctly")
    public void enterUsernameAndPassword(String email, String password) {
        List<WebElement> inputs = web.findElements(By.cssSelector("form input"));

        if (inputs.size() == 2) {
            inputs.get(0).sendKeys(email);
            inputs.get(1).sendKeys(password);
        }
    }
    @Step("I click sign in button")
    public void clickLoginButton() throws Exception {
        WebElement button = web.findElement(By.cssSelector("form button"));
        button.click();

        Thread.sleep(5000);
    }
    @Step("I am on the home page")
    public void onTheHomePage(){
        String url = web.getCurrentUrl();
        assertEquals(url, "https://qa.alta.id/");
    }
    @Step("Please enter a valid username")
    public void enterAValidUsername(){
        System.out.println("Please enter a valid username");
    }
    @Step("I enter my username")
    public void enterMyUsername(){
        System.out.println("I enter my username");
    }
    @Step("The password you provided must have at least 6 characters")
    public void enterAValidMyPassword(){
        System.out.println("The password you provided must have at least 6 characters");
    }
    @Step("I enter my password")
    public void enterMyPassword(){
        System.out.println("I enter my password");
    }
    @Step("Click button forgot password")
    public void clinkButton(){
        System.out.println("Click button forgot password");
    }
    @Step("I as on the forgot password")
    public void theForgetPassword(){
        System.out.println("I as on the forgot password");
    }
    @Step("I enter my email or phone correctly")
    public void enterMyEmailOrPhoneCorrectly(){
        System.out.println("I enter my email or phone correctly");
    }
    @Step("I click reset password button")
    public void clickResetPasswordButton(){
        System.out.println("I click reset password button");
    }
    @Step("A as on the we sent code to your email")
    public void codeToYourEmail(){
        System.out.println("A as on the we sent code to your email");
    }
    @Step("I enter 6 digit code")
    public void enter6DigitCode(){
        System.out.println("I enter 6 digit code");
    }
    @Step("I click submit button")
    public void clickSubmitButton(){
        System.out.println("I click submit button");
    }
    @Step("I am on the choose a new password")
    public void chooseANewPassword(){
        System.out.println("I am on the choose a new password");
    }
    @Step("I enter my new password and retype new password")
    public void enterMyNewPasswordAndRetypeNewPassword(){
        System.out.println("I enter my new password and retype new password");
    }
}
