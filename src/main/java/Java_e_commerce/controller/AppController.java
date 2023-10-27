package Java_e_commerce.controller;

import Java_e_commerce.view.WelcomePage;
import Java_e_commerce.controller.impl.IAppController;

public class AppController implements IAppController {

    private final WelcomePage welcomePage;
    private final AuthController authController;

    public AppController() {
        welcomePage = new WelcomePage();
        authController = new AuthController(this);
    }

    @Override
    public void init() {
        welcomePage.welcome();
        authController.authMenu();
    }

    public void printAuthMenu() {
        welcomePage.printAuthMenu();
    }
}
