package Java_e_commerce.view;

import Java_e_commerce.utils.StringUtil;

import static Java_e_commerce.utils.Utils.println;

public class RegisterPage {

    public void printRegistrationSuccessful() {
        try {
            println("#---------------------#");
            println(StringUtil.REGISTRATION_SUCCESSFUL);
            println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void passwordMisMatch() {
        try {
            println("#---------------------#");
            println(StringUtil.PASSWORD_MISMATCH);
            println("#---------------------#");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
