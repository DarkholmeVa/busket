package Menues;

import Data.BasketList;
import Data.ProduceList;

import java.util.Scanner;


public class BasketMenu {
    public static void basketMenu(){
        if (BasketList.getBasketList().size() == 0){
            System.out.println("Basket is empty!");
            MainMenu.mainMenu();
        }
        BasketList.showProduceList();
        System.out.println("0)back" + "\n"  );
        System.out.println("Enter the id to remove:");
        Scanner scn = new Scanner(System.in);
        int selectedId = scn.nextInt();
        if (selectedId == 0) {
            MainMenu.mainMenu();
        }else if(BasketList.validateId(selectedId)){
            System.out.println("Enter the count products:");
            int count = scn.nextInt();
            BasketList.removeProduce(selectedId,count);
            MainMenu.mainMenu();
        }else {
            System.out.println("No such element!!!");
            basketMenu();
        }
    }
}
