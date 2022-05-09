package starter.Calculator;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Calculator {

  AndroidDriver driver;
  public void openHomePage() {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
    caps.setCapability(MobileCapabilityType.NO_RESET, true);
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    caps.setCapability(MobileCapabilityType.APP, "/home/hammurabi/Downloads/Telegram Desktop/app.apk");

    try {
      AndroidDriver  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
      this.driver = driver;
    } catch (Exception e) {
    }
  }

  public void putEmail(String email) {
    driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextEmail")).sendKeys(email);
  }

  public void putPassword(String password) {
    driver.findElement(By.id("com.loginmodule.learning:id/textInputEditTextPassword")).sendKeys(password);
  }

  public void clickLogin() {
    driver.findElement(By.id("com.loginmodule.learning:id/appCompatButtonLogin")).click();
  }

  public String errorMessage() {
    return driver.findElement(By.id("com.loginmodule.learning:id/snackbar_text")).getText();
  }


}
