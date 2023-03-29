public class Cofe {
    private String name;
    private int volume;
    private int temperature;
    private double prise;
    private double cofe;
    private int water;
    
    // Конструктор класса
    public Cofe(String name, int volume, int temperature, double prise){
        this.temperature = temperature;
        this.name = name;
        this.volume = volume;
        this.prise = prise;
        this.cofe = 1.5;
        this.water = volume;




    }
    
    // public double getCofe() {
    //     return cofe;
    // }
    public String getName() {
        return name;
    }
    public double getPrise() {
        return prise;
    }
    public int getVolume() {
        return volume;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrise(double prise) {
        this.prise = prise;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
     @Override
     public String toString() {
         
         return String.format("Кофе: %s, порция: %d мл, Температура: %d °С Цена: %.2f р."
         ,name, volume, temperature, prise);
     }
}

