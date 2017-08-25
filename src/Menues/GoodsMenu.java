package Menues;

import Data.BasketList;
import Data.ProduceList;

import java.util.Scanner;


public class GoodsMenu {
    public static void goodsMenu(){
        ProduceList.showProduceList();
        System.out.println("0)back" + "\n"  );
        Scanner scn = new Scanner(System.in);
        int selectedId = scn.nextInt();
        if (selectedId == 0 || !ProduceList.validateId(selectedId)){
            MainMenu.mainMenu();
        }else if(ProduceList.validateId(selectedId)){
            System.out.println("Enter the amount of product:");
            int amountProduct = scn.nextInt();
            BasketList.addProduce(selectedId, amountProduct);
            MainMenu.mainMenu();
        }
        scn.close();
    }
}
