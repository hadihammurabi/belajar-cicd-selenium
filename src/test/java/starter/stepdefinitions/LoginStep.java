package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Calculator.Calculator;
import starter.Login.Login;

public class LoginStep {
    @Steps
    Login login;

    @Given("I as on the login page")
    public void onTheLoginPage() throws Exception {

        login.onTheLoginPage();
    }
    @When("I enter my {} and {} correctly")
    public void enterUsernameAndPassword(String email, String password) {

        login.enterUsernameAndPassword(email, password);
    }
    @And("I click sign in button")
    public void clickLoginButton() throws Exception {
        login.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){

        login.onTheHomePage();
    }
    // @And("Please enter a valid username")
    // public void enterAValidUsername(){
    //     login.enterAValidUsername();
    // }
    // @And("I enter my username")
    // public void enterMyUsername(){
    //     login.enterMyUsername();
    // }
    // @And("The password you provided must have at least 6 characters")
    // public void enterAValidMyPassword(){
    //     login.enterAValidMyPassword();
    // }
    // @And("I enter my password")
    // public void enterMyPassword() {
    //     login.enterMyPassword();
    // }
    // @And("Click button forgot password")
    // public void clinkButton(){
    //     login.clinkButton();
    // }
    // @When("I as on the forgot password")
    // public void theForgetPassword(){
    //     login.theForgetPassword();
    // }
    // @And("I enter my email or phone correctly")
    // public void enterMyEmailOrPhoneCorrectly(){
    //     login.enterMyEmailOrPhoneCorrectly();
    // }
    // @And("I click reset password button")
    // public void clickResetPasswordButton(){
    //     login.clickResetPasswordButton();
    // }
    // @And("A as on the we sent code to your email")
    // public void codeToYourEmail(){
    //     login.codeToYourEmail();
    // }
    // @And("I enter 6 digit code")
    // public void enter6DigitCode(){
    //     login.enter6DigitCode();
    // }
    // @And("I click submit button")
    // public void clickSubmitButton(){
    //     login.clickSubmitButton();
    // }
    // @Then("I am on the choose a new password")
    // public void chooseANewPassword(){
    //     login.chooseANewPassword();
    // }
    // @And("I enter my new password and retype new password")
    // public void enterMyNewPasswordAndRetypeNewPassword(){
    //     login.enterMyNewPasswordAndRetypeNewPassword();
    // }

    // @Steps
    // Calculator calc;

    // @Given("I on the home page")
    // public void onTheCalculatorHomePage() {
    //   calc.openHomePage();
    // }
    // @When("I put email {}")
    // public void putEmail(String email) {
    //   calc.putEmail(email);
    // }
    // @And("I put password {}")
    // public void putPassword(String password) {
    //   calc.putPassword(password);
    // }
    // @And("I click login")
    // public void clickLogin() {
    //   calc.clickLogin();
    // }
    // @Then("I got error")
    // public void gotError(){
    //     String errorMessage = calc.errorMessage();
    //     System.out.println(errorMessage);
    // }   
}
