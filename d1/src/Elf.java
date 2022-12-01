import java.util.Comparator;
import java.util.List;

public class Elf implements Comparator<Elf>{
    List<Integer> calories;

    public Elf(List<Integer> calories){
        this.calories = calories;
    }

    public int getTotalOfCalories(){
        int sum = 0;
        for(int calory: calories){
            sum += calory;
        }
        return sum;
    }

    @Override
    public int compare(Elf elf1, Elf elf2) {
        return elf1.getTotalOfCalories()- elf2.getTotalOfCalories();
    }
}
