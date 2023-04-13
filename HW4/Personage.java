public abstract class Personage implements Defense{
    private String name;
    private int hp;
    public int defense;

    public boolean isAlive(){
        return hp>0;
    }

    public Personage(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.defense = 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
    

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void reduceHp (int damage){
        int rez = damage-defense();
        if ( rez < 0 ) rez = 0 ;
        this.hp-= rez;
        if (this.hp<0){
            this.hp = 0;
        }
    }
}