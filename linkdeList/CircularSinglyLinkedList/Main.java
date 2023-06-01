import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        CircularSinglyLinkedList sll = new CircularSinglyLinkedList();
        sll.createCSLL(5);
        System.out.println(sll.head.value);
    }
}