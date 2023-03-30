import java.util.ArrayList;
import java.util.HashMap;

//import javax.swing.Spring;

public class CofeMashine {
    private int water;
    private double cofe;
    private int milk;
    private double money;
    private String name;
    private ArrayList<Cofe> list_rez = new ArrayList<>();
    //private Cofe but1;

    
    public CofeMashine (String name){
        this.water = 19500;
        this.cofe = 3000;
        this.milk = 30;
        this.money =0;
        this.name = name;


    }
    // HashMap<String, Cofe> menu = new HashMap<>();
    
    // menu.put("Espresso", new Espresso("espresso",50,80,3.7));
    // menu.put("Americano", new Americano("americano",150, 80, 4));


    public double getCofe() {
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
    public void Cook (Cofe name){
        System.out.println("Готовлю "+name);
        this.water -= name.getVolume();
        this.cofe -= name.getCofe();
        this.milk -= name.getMilk();
        this.money += name.getPrise();
        list_rez.add(name);
    }

    public void Otchet(){
        System.out.println("Автоматом : "+name+" реализовано: ");
        for ( Cofe element : list_rez) {
            System.out.println(element);
        }
        System.out.printf("Выручка составила : %.2f руб.",money);
        
    }


    public Boolean isCook (Cofe name){
        if (this.water >= name.getVolume()){
            if(this.cofe >= name.getCofe()){
                if (this.milk >= name.getMilk()) {
                    return true;
                }
            }
        }
        
        return false;
    }


    @Override
    public String toString() {
        
        return String.format("Автомат: %s: Вода: %d мл. Кофе: %.2f гр.Молоко: %d мл. Выручка: %.2f руб."
        , name,water,cofe,milk,money);
    }

 
}
