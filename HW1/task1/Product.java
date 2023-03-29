public class Product {
    private String name;
    private double price;
    //private int counter;
    private int value;

   
    public Product(String name, double price, int value) {
        this.name = name;
        this.price = price;
        //counter=value;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean sellCounter() {
       // this.counter--;
        this.value--;
        return value>0;
       // return counter>0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price*2;
    }

    @Override
    public String toString() {
        return String.format("%s : %.2f р. %d упаковок в автомате", name, price, value);
    }
}
