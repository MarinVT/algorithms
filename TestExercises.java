import java.lang.reflect.Array;
import java.util.*;

public class TestExercises {
    public static void main(String[] args) {

        String[] words = {"name","test","number","sorry"};
        List<String> list1 = new ArrayList<String>();

        for (String word : words) {
            list1.add(word);
        }

        String[] modeListRemoveDup = {"name", " test"};
        List<String> list2 = new ArrayList<String>();

        for (String modeList : modeListRemoveDup) {
            list2.add(modeList);
        }

        editList(list1,list2);

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
            
        }


    }

    public static void editList(Collection<String> list1, Collection<String> list2) {
        Iterator<String> iter1 = list1.iterator();

        while (iter1.hasNext()) {

            if (list2.contains(iter1.next())) {
                iter1.remove();
            }
        }
    }
}
