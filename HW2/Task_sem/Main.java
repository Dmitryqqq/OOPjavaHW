public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cow("Бурёнка"));
        zoo.addAnimal(new Bear("М.Потапыч", 60));
        zoo.addAnimal(new Platypus("Пэрри"));
        zoo.addAnimal(new Woof("Серый"));
        zoo.addAnimal(new Goat("Маня"));
        zoo.addAnimal(new Bat("Микки"));
        zoo.addAnimal(new Bear("Косолапыч", 61));
        //zoo.addAnimal(new Shark("Большая Белая"));
        
        zoo.addAnimal(new Dolfin("Шустрый"));

        zoo.noise();
        zoo.showAll();
        Shark s1 = new Shark("Зверюга");
        System.out.println(s1);
        System.out.printf("Скорость плавания: %d ",s1.swimSpeed());

        System.out.println();
        System.out.println("Чемпион по бегу: ");
        System.out.println(((Walkable)zoo.championByRun()).runSpeed());
        System.out.println(zoo.championByRun());
        System.out.println();
        System.out.println("Чемпион по полёту: ");
        System.out.println(((Flyable)zoo.championByFly()).flySpeed());
        System.out.println(zoo.championByFly());
        System.out.println("Чемпион по плаванью: ");
        System.out.println(((Swimable)zoo.championBySwim()).swimSpeed());
        System.out.println(zoo.championBySwim());
        
    }

}