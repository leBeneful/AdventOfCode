import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Elf> elfSet = new HashSet<>();
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        List<String> input = ReadFile.read("input1.txt");

        for(int i = 0; i<input.size(); i++){
            List<Integer> caloryList = new LinkedList<>();
            while(i+1 < input.size() && !input.get(i).isEmpty()){
                caloryList.add(Integer.valueOf(input.get(i)));
                i++;
            }
            Elf elf = new Elf(caloryList);
            elfSet.add(elf);
        }

        int max = elfSet.stream().map(Elf::getTotalOfCalories).max(Integer::compare).get();
        System.out.println(max);
    }
}