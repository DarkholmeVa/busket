package Data;

import java.util.ArrayList;


public class ProduceList {
    private static ArrayList<Produce> produceList = new ArrayList<>();

    public static void addProduce(Produce produce){
        produceList.add(produce);
    }

    public static void showProduceList(){
        for (Produce produce : produceList){
            System.out.println(produce.id + ")" + produce.name + "\n" +
                                "Price: " + produce.price);
        }
    }

    public static boolean validateId(int id){
        for (Produce produce : produceList){
            if (produce.id == id){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Produce> getProduceList() {
        return produceList;
    }
}
