import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class TestExercises {

    static int findDCG(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return  findDCG(b % a, a);
        }
    }

    static int findLCD(int a, int b) {
        return (a / findDCG(a,b)) * b;
    }

    public static void main(String[] args) {

        String[] myArrStr = {"VW","BMW","AUDI","Mercedes","Kia","Ford", "Mercedes", "Ford"};

        int[] arr1 = new int[] {1, 0, 2, 0, 3, 0, 0, 0};

        String text = "Marin1 Marin1 is number12 everywhere ! !";


        System.out.println(findDCG(6, 14));
        System.out.println(findLCD(6, 14));
    }

}
