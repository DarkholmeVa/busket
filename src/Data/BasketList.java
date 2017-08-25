package Data;

import java.util.ArrayList;


public class BasketList {
    private static ArrayList<Produce> basketList = new ArrayList<>();

    public static void addProduce(int id, int count){
        for (Produce produce : ProduceList.getProduceList()){
            if (produce.id == id){
                basketList.add(produce);
            }
        }
        for (Produce produce : basketList){
            if (produce.id == id){
                produce.count = count;
                produce.result = count * produce.price;
            }
        }
    }
    public static void showProduceList(){
        int total = 0;
        for (Produce produce : basketList){
            System.out.println(produce.id + ")" + produce.name + "\n" +
                    "Price: " + produce.price + "\n" +
                    "Amount: " + produce.count + "\n" +
                    "Result: " + produce.result);
            total += produce.result;
        }
        System.out.println("Total: " + total);
    }

    public static boolean validateId(int id) {
        for (Produce produce : basketList) {
            if (produce.id == id) return true;
        }

        return false;
    }

    public static void removeProduce(int id, int count) {
        Produce produce = null;
        for (int i = 0; i < basketList.size(); i++) {
            produce =  basketList.get(i);
            if (produce.id == id) break;

        }
        if (count < produce.count){
            basketList.remove(produce);
            Produce produce1 = new Produce(produce.name, produce.price, produce.count - count, produce.id);
            basketList.add(produce1);
        }else {
            basketList.remove(produce);
        }
    }

    public static ArrayList<Produce> getBasketList() {
        return basketList;
    }
}
