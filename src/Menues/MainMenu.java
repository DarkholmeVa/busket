package Menues;

import java.util.Scanner;


public class MainMenu {
    public static void mainMenu(){
        System.out.println( "1)Goods" + "\n" +
                            "2)Basket" + "\n" +
                            "3)Buy");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                GoodsMenu.goodsMenu();
                break;
            case 2:
                BasketMenu.basketMenu();
                break;
            case 3:
                BasketMenu.basketMenu();
                System.out.println("Done!");
                return;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }

}
