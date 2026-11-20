package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisctintLimitSkip {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9));

        List<Integer> s1 = list.stream()
                .distinct()
                .skip(5)
                .collect(Collectors.toList());

        s1.forEach(no -> System.out.println(no));
    }
}