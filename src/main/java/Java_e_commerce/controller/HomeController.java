package Java_e_commerce.controller;

import Java_e_commerce.utils.Utils;
import Java_e_commerce.controller.impl.IHomeController;
import Java_e_commerce.view.HomePage;

public class HomeController implements IHomeController {

   private final HomePage homePage;

    public HomeController() {
        homePage=new HomePage();
    }

    @Override
    public void printMenu() {

        homePage.printMenu();

    }
}
