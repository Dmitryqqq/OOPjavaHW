

public class Latte extends Cofe{
    private int milk;
    public Latte (String name, int volume, int temperature, double prise, int milk){
        super(name,volume,temperature,prise );
        this.milk = milk;

    }

    @Override
    public int getMilk() {
        
        return milk;
    }
    @Override
    public String toString() {
        
        return String.format("Latte- %s" ,super.toString());
    }
}
