//import java.util.function.ToDoubleBiFunction;

public class Espresso extends Cofe{
    private int milk;
    //private double cofe;
    public Espresso (String name, int volume, int temperature, double prise){
        super(name, volume, temperature, prise);
        //this.cofe = super.cofe();
        this.milk =0;
        
    }
   
    
    @Override
    public String toString() {
        
        return String.format("Espresso- %s" ,super.toString());
    }
}
