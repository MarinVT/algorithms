import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class TestExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userStrOutput = JOptionPane.showInputDialog("Please enter the number of cookies");
        double userNumberOfCookies = Double.parseDouble(userStrOutput);
        double numberOfServings = (userNumberOfCookies / 40) * 10;
        double numberOfColories = (numberOfServings  / 1) * 300;

        JOptionPane.showMessageDialog(null, userNumberOfCookies + " cookies is equal to " +
        numberOfColories + " (" + numberOfServings + ") ");
    }
}
