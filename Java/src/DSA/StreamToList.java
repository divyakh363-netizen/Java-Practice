package DSA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 3, 8, 4, 9));

        List<Integer> s1 = list.stream()
                .filter(no -> no % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        s1.forEach(no -> System.out.println(no));
    }
}