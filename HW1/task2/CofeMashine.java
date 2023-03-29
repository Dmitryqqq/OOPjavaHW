//import java.util.ArrayList;
//import java.util.HashMap;

//import javax.swing.Spring;

public class CofeMashine {
    private int water;
    private int cofe;
    private int milk;
    private double money;
    private String name;
    //private ArrayList<Cofe> rezalt = new ArrayList<>();
    

    
    public CofeMashine (String name){
        this.water = 19500;
        this.cofe = 3000;
        this.milk = 500;
        this.money =0;
        this.name = name;


    }


    public int getCofe() {
        return cofe;
    }
    public double getManey() {
        return money;
    }
    public int getMilk() {
        return milk;
    }
    public String getName() {
        return name;
    }
    public int getWater() {
        return water;
    }
    public void setCofe(int cofe) {
        this.cofe = cofe;
    }
    public void setManey(double money) {
        this.money = money;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public Cofe searchProduct(String name) {
        // for (HashMap item : menu) {
        //     if (item.getName().equals(name)) {
        //         return item;
        //     }
        // }
        return null;
    }
    public void Cook (String name){
        this.water -= menu.get(name).getVolume();
        // this.cofe = 3000;
        // this.milk = 500;
        // this.money =0;
        
    }


    public Boolean isCook (String name ){


        return false;
    }


    @Override
    public String toString() {
        
        return String.format("Автомат: %s: Вода: %d мл. Кофе: %d гр.Молоко: %d мл. Выручка: %.2f руб."
        , name,water,cofe,milk,money);
    }

 
}
