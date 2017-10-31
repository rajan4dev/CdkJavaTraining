package LinkedList;

import org.junit.Test;

/**
 * Created by bhirudr on 10/30/2017.
 */
public class LinkedListImplTest {
    @Test
    public void testAdd() {
        LinkedListImpl<Integer> linkedList=new LinkedListImpl<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(11);
        linkedList.add(21);
        linkedList.add(31);
        linkedList.add(41);
        linkedList.add(51);
        linkedList.printList();
        System.out.println("\nsize: "+linkedList.getSize());
        System.out.println("first: "+linkedList.getFirst());
        System.out.println("last: "+linkedList.getLast());
        System.out.println("index of 8 : "+linkedList.indexOf(51));
        System.out.println("Removing 31.... removed? : "+ linkedList.delete(31));
        linkedList.printList();
    }

}
