public class Dolfin extends Mammal implements Swimable{
    public Dolfin(String name){
        super(name);
    }

    @Override
    public String speak() {
        
        return "ПииК-К-К";
    }

    @Override
    public String feed() {
       
        return "Fish";
    }
    
    @Override
    public int swimSpeed() {
               return 30;
    }
}
