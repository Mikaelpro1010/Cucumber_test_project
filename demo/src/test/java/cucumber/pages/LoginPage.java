package cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage {
    
    public LoginPage(){
        this.driver = new ChromeDriver();
        this.driver.get("");
        this.driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(2))
        .pageLoadTimeout(Duration.ofSeconds(10));
    }
}
