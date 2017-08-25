package Data;


public class Produce {
    public int id;
    public String name;
    public int price;
    public int count;
    public int result;

    public Produce(String name, int price, int count, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.count = count;
        this.result = count * price;
    }

    public Produce() {
    }
}
