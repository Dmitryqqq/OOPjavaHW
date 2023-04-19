public class Main {
    public static void main(String[] args) {
        Team<Prashtnic> prashnikTeam = new Team<>();
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        prashnikTeam.addPers(new Prashtnic("Колян", 80, new Prasha(60), new SmallShild())  );
        archers.addPers(new Archer("Робин", 100, new Bow(20),new Shilds()))
          // если Shilds() пустой. То же что без щита
                .addPers(new Archer("Бобин", 100, new Bow(20),new Shilds(2)))
          // если Shilds(2) с каким-то значением но без имени то принимается общая броня
                .addPers(new Archer("Соколиный глаз", 100, new Bow(20),new SmallShild()))
                .addPers(new Archer("Гуд", 100, new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new Shilds(5)))
                .addPers(new Thief("Потрошитель", 150, new Knife(),new Shilds("MEGA",8)))
                .addPers(new Thief("Резчик", 136, new Knife(), new TowerShild()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        Thief pers = new Thief("Зверюга", 150, new Knife(),new Shilds("MEGA",8));
        System.out.println(pers);
        Archer robin = new Archer("Робин", 50, new Bow(20), new Shilds("Крутой щит",3));
        //Archer gud = new Archer("Гуд", 50, new Bow(50));

        Battle fight = new Battle(robin,pers);
        fight.run();
    }
}