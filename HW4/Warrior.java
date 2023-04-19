import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Shilds> extends Personage{   //T extends Weapon, Shilds
protected static Random rnd = new Random();
    protected T weapon;
    protected Shilds shild;
    public Warrior(String name, int hp, T weapon, Shilds shild) { // Щит можно задать при создании
        super(name, hp);
        this.shild = shild;
        //this.defense = shild.def;
        this.weapon = weapon;
        
    }

    public Warrior(String name, int hp, T weapon) {  // если при создании воина щит не указан то от равен нулю "без щита"
        super(name, hp);
        this.shild = new Shilds();
        //this.defense = shild.def;
        this.weapon = weapon;
        
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    @Override
    public int defense(){
        return shild.def;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tЗащищен: %s , блокирует %d ед.урона", shild.name, shild.def));
        return res.toString();
    }
}