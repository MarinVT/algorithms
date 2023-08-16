import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TestExercises {


    public static void main(String[] args) {


    Integer[] intArray = new Integer[]{1,2,3,4};
    String [] stringsArray = new String[] {"VW", "tt", "bmw", "volga"};

    List<Integer> integerList = new ArrayList<>(Arrays.asList(intArray));
    List<String> stringList = new ArrayList<>(Arrays.asList(stringsArray));
//
//        System.out.println(integerList.contains(44));
//        System.out.println(stringList.contains("VW4"));
        sumDigitsNumber(123);
    }

    public static <T> boolean arrContainsElement(final T[] arr, final T v) {

        for (final T e : arr) {
            if (e == v || v != null && v.equals(e)) {
                return true;
            }
        }

        return false;
    }

    static void sumDigitsNumber(int num) {

        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }



}




