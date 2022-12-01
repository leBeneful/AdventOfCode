import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Elf> elfList = new LinkedList<>();
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        List<String> input = ReadFile.read("input1.txt");

        for(int i = 0; i<input.size(); i++){
            List<Integer> caloryList = new LinkedList<>();
            while(i+1 < input.size() && !input.get(i).isEmpty()){
                caloryList.add(Integer.valueOf(input.get(i)));
                i++;
            }
            Elf elf = new Elf(caloryList);
            elfList.add(elf);
        }



        int max = 0; // = elfList.stream().map(Elf::getTotalOfCalories).max(Integer::compare).get();
        int index = 0;
        int sum = 0;
        for(int j = 0; j<3; j++){
            for (int i = 0; i<elfList.size(); i++){
                int calories = elfList.get(i).getTotalOfCalories();
                if(calories > max){
                    max = calories;
                    index = i;
                }
            }
            sum += max;
            elfList.remove(index);
            max = 0;
            index = 0;
        }

        System.out.println(sum);
    }
}