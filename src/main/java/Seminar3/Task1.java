//         Задача 1
package Seminar3;
import java.util.*;
public class Task1 {
    private static void ex1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(3, 11));
        }

//        arrayList.sort(Comparator.naturalOrder());
//        Collections.sort(arrayList, Comparator.reverseOrder());
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return (x < y) ? -1 : ((x == y) ? 0 : 1);
            }
        });

        System.out.println("a" + "b");

        arrayList.sort(Integer::compare);


        System.out.println(arrayList);
    }
}
