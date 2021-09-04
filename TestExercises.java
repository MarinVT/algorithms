import java.util.*;
import java.util.stream.Collectors;


public class TestExercises {

    private static void areaAndPerRectangle(int length1, int width) {
        int area = length1 * width;
        int perimeter = 2 * (length1 + width);

        System.out.println("The area is of rectangle is: " + area);
        System.out.println("The perimeter is of rectangle is: " + perimeter);
    }

    public static int sumAllNumbersArr(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(sumAllNumbersArr(list));
    }
}
