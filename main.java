import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] str){

        System.out.println("hi");


        String[] arraySimple = new String[5];

        //ArrayList example, for store and access data
        System.out.println("\n ArrayList example");
        List<Integer> listArrayOfIntegers = new ArrayList<>();
        for(int i=0; i<5; i++) {
            listArrayOfIntegers.add(i);
        }
        System.out.println(listArrayOfIntegers);

        //LinkedList example, for store access and manage data, faster
        System.out.println("\n LinkedList example");
        List<Integer> listLinkedListOfIntegers = new LinkedList<>();
        for(int i=0; i<5; i++) {
            listLinkedListOfIntegers.add(i);
        }
        System.out.println(listLinkedListOfIntegers);
    }
}
