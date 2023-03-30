import java.lang.constant.Constable;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        CofeMashine cm1 = new CofeMashine("ТЦ Глобус");

        HashMap<String, Cofe> menu = new HashMap<>();  // Создаем меню кофеавтомата
    
        menu.put("Espresso", new Espresso("espresso",50,80,3.7));
        menu.put("Americano", new Americano("americano",150, 80, 4));
        menu.put("Latte", new Latte("latte", 120, 60, 4.9,20));

        System.out.println("Имеем в наличии : ");
       
         for (HashMap.Entry entry: menu.entrySet()) {
             System.out.println(entry.getValue());
          }

System.out.println( menu.get("Latte").getMilk());

          System.out.println("\n"+cm1+"\n");
          cm1.Cook(menu.get("Espresso"));
          cm1.Cook(menu.get("Latte"));
          if (cm1.isCook(menu.get("Latte"))) {
            cm1.Cook(menu.get("Latte"));
          } else {
            System.out.println("Извините, данный кофе закончлся ");
          }
cm1.Cook(menu.get("Americano"));
          if (cm1.isCook(menu.get("Latte"))) {
            cm1.Cook(menu.get("Latte"));
          } else {
            System.out.println("Извините, данный кофе закончлся ");
          }
          cm1.Otchet();  
          //System.out.println(cm1.isCook(menu.get("Latte")));
        //System.out.println("\n"+cm1);

    
    }
}