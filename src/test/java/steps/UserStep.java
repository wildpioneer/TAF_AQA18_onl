package steps;

import pages.LoginPage;

public class UserStep {
    private LoginPage loginPage;

    public void login(String email, String psw) {
        loginPage.getEmailInput().setValue(email);
        loginPage.getPassword().val(psw);
        loginPage.getLogInButton().click();
    }

    public LoginPage loginIncorrect(String email, String psw) {
        login(email, psw);

        return loginPage;
    }
}
