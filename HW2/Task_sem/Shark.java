public class Shark extends Fish {
    
    public  Shark (String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "ВсЁ подряд";
    }
    @Override
    public int swimSpeed() {
        
        return 19;
    }
}
