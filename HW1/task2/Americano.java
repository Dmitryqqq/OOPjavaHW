public class Americano extends Cofe{
    public Americano (String name, int volume, int temperature, double prise){
        super(name, volume, temperature, prise);
        //super.water = water*2;
        
    }
    
    @Override
    public String toString() {
        
        return String.format("Americano- %s" ,super.toString());
    }
}
