package lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class First {

    public First() {

    }

    public void test() {
        List<String> inventory = new ArrayList<>();
        inventory.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        inventory.sort((String a1, String b2) -> a1.compareTo(b2));

        Thread t = new Thread(()-> System.out.println("test"));
    }


}
