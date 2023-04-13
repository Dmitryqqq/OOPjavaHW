public class Archer extends Warrior<Throwing>{
    public Archer(String name, int hp, Throwing weapon, Shilds shild) {
        super(name, hp, weapon, shild);
        //this.shild = shild;
    }

    public Archer(String name, int hp, Throwing weapon) {
        super(name, hp, weapon);
        this.shild= new Shilds();
        //this.defense = shild.def;
    }
    // public Archer(String name, int hp, Bow weapon, int i) {
    // }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}