public class Thief extends Warrior<Knife,TowerShild>{
    public Thief(String name, int hp, Knife weapon, Shilds shild) {
        super(name, hp, weapon, shild);
        
    }

    public Thief(String name, int hp, Knife weapon) {
        super(name, hp, weapon);
        this.shild= new Shilds();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}