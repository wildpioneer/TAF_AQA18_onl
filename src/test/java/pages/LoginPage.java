package pages;

import baseEntities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    // Блок описания локаторов для эментов
    @FindBy (id = "name")
    public WebElement emailInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (id = "button_primary")
    public WebElement logInButton;

    @FindBy (className = "error-text")
    public WebElement errorText;

    // Блок иницализации страницы
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Блок атомарных методов
}
