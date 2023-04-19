import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();
    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Максимальная дальность: %d", maxRange()));
        res.append(String.format("\nМаксимальная защита: %d у персонажа: %s", maxDefense().defense(),maxDefense().getName()));
        return res.toString();
    }

    public int maxRange (){
        int max = 0;
        for (T pers:this) {
            if (pers instanceof Archer){
                Archer archer = (Archer) pers;
                if(archer.range()>max){
                    max= archer.range();
                }
            }
        }
        return max;
    }
    public Personage maxDefense (){
        int max = 0;
        boolean flag = true;
        Personage pm = null;
        for (T pers:this){
            if (flag) {
                pm = pers;
                flag = false;
            }
            if (pers.defense()>max){

                max = pers.defense();
                pm = pers;
            }
        }
        return pm;
    }
}