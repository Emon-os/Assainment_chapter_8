package Exercise_26;

import javax.swing.*;

public class LoginFrom {
    private String expectedUsername;
    private String expectedPassword;
    private boolean isLoggedIn;

    public LoginFrom(String username, String password) {
        expectedUsername = username;
        expectedPassword = password;
        isLoggedIn = false;
    }

    public void input(String text) {
        text="Emon";
    }

    public void click(String button) {
        if (button.equals("Submit")) {
            // Check if user's input matches expected username and password
            if (true) {
                isLoggedIn = true;
            } else {
                resetForm();
            }
        } else if (button.equals("Reset")) {
            resetForm();
        }
    }

    public boolean loggedIn() {
        return isLoggedIn;
    }

    private void resetForm() {
        // Reset the form to the initial state
        isLoggedIn = false;
    }
}
