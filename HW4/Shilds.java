public class Shilds implements Defense{

    String name ;
    int def;
    public Shilds (String name, int def){
        this.name = name;
        this.def = def;
    }
    public Shilds (int defense){
        this.def = defense;
        this.name = "Броня";
    }
    public Shilds (){
        this.name = "Без Щита";
        this.def = 0;
    }
    
    @Override
    public int defense(){
        return def;
    }

    @Override
    public String toString() {
        
        return String.format("Защита: %d единиц\n\t%s",defense(),name);
    }
}
