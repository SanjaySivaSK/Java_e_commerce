package Java_e_commerce.view;

import static Java_e_commerce.utils.Utils.println;

public class LoginPage {
    public void printInvalidCredentials() {
        try {
            println("#---------------------#");
            println("Invalid Credentials!!!");
            println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
