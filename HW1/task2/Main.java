import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        CofeMashine cm1 = new CofeMashine("ТЦ Глобус");

        HashMap<String, Cofe> menu = new HashMap<>();
    
        //menu.put("sdf",15);
        menu.put("Espresso", new Espresso("espresso",50,80,3.7));
        menu.put("Americano", new Americano("americano",150, 80, 4));

        System.out.println("Имеем в наличии");
        //System.out.println(menu);
        //System.out.println(menu.get("Espresso"));
         for (HashMap.Entry entry: menu.entrySet()) {

             System.out.println(entry.getValue());
         
          }
    System.out.println("\n"+cm1);

    
    }
}