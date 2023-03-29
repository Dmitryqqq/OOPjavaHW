//import java.util.function.ToDoubleBiFunction;

public class Espresso extends Cofe{
    //private double cofe;
    public Espresso (String name, int volume, int temperature, double prise){
        super(name, volume, temperature, prise);
        //this.cofe = super.cofe();
        
        
    }
    
    @Override
    public String toString() {
        
        return String.format("Espresso- %s" ,super.toString());
    }
}
