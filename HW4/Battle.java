public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int attak = attacker.harm();
            defender.reduceHp(attak);
            System.out.printf("Воин %s наносит %d очков урона, из них %d заблокировано \nУ воина %s осталось %d hp\n",
             attacker.getName(), attak, defender.defense(), defender.getName(), defender.getHp());
            if (!defender.isAlive()){
                System.out.printf("Воин %s погиб\n", defender.getName());
                System.out.printf("Победитель: \n%s\n", attacker);
                return attacker;
            }
            int response = defender.harm();
            attacker.reduceHp(response);
            System.out.printf("Воин %s дал в ответку на %d очков урона, из них %d заблокировано \nУ воина %s осталось %d hp\n",
             defender.getName(), response, attacker.defense() , attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()){
                System.out.printf("Воин %s погиб\n", attacker.getName());
                System.out.printf("Победитель: \n%s\n", defender);
                return defender;
            }
        }
    }
}
