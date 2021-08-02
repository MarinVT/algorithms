

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestExercises {



    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Stream<Integer> stream = Stream.of(1,2,3);
//        System.out.println(stream.reduce(0, (s, n) -> s+n));

        stream = Stream.of(1,2,3);
        System.out.println(stream.mapToInt(x -> x).sum());
    }
}
