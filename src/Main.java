import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        printOddNumbers(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        printOddSortedNumbers(new ArrayList<>(List.of(1, 10, 2, 30, 4, 4, 5, 5, 6, 7)));
        printSortedSting(new ArrayList<>(List.of("один", "два", "два", "три", "три", "три")));
        printNumberOfTakes(new ArrayList<>(List.of("один", "два", "два", "три", "три", "три")));
    }

    private static void printOddNumbers(ArrayList<Integer> list) {
        System.out.println(list.stream().filter(e -> e % 2 == 0).toList());
    }

    private static void printOddSortedNumbers(ArrayList<Integer> list) {
        System.out.println(list.stream().filter(e -> e % 2 == 0).collect(Collectors.toSet()));
    }

    private static void printSortedSting(ArrayList<String> list) {
        System.out.println(new HashSet<>(list));
    }

    private static void printNumberOfTakes(ArrayList<String> list) {
        Map<String,Integer> result = list
                .stream()
                .collect(Collectors
                        .toMap(k->k,e->1,Integer::sum));
        result.forEach((k,e)->System.out.println(e));
    }

}