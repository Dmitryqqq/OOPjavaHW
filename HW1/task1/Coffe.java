
public class Coffe extends Product{

    public Coffe (String name, double price, int value) {
        super (name, price, value);
    }

    @Override
    public String toString() {
        
        return String.format("Кофе: %s", super.toString());
    }
}
