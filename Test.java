import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(scanner.nextLine());

        sb1.reverse();

        System.out.println(sb1);
    }

}
