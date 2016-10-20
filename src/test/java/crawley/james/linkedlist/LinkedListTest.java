package crawley.james.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 10/20/16.
 */
public class LinkedListTest {

    private LinkedList linkedList = new LinkedList();

    @Test
    public void addTest () {

        linkedList.add(1);

        assertEquals("The added value of 1 should be returned.", 1, linkedList.get(0));

    }

    @Test
    public void addMultipleTest () {

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals("The added value of 3 should be returned.", 3, linkedList.get(2));

    }

    @Test
    public void removeFirstTest () {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.remove(0);

        assertEquals("The value 1 should have been removed so that 2 took its place.", 2, linkedList.get(0));

    }

    @Test
    public void removeOtherTest () {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(1);

        assertTrue("The values should be 1, 3.", linkedList.containsInOrder(1, 3));

    }

    @Test
    public void containsTest () {

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertTrue("The value 3 should be in the list", linkedList.contains(3));


    }

    @Test
    public void findTest () {

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        assertEquals("2 should be at index 1", 1, linkedList.find(2));


    }

    @Test
    public void sizeTest () {

        linkedList.add(1);
        linkedList.add(2);

        assertEquals("The size should be 2", 2, linkedList.size());
    }

    @Test
    public void copyTest () {

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList linkedList1 = linkedList.copy();

        assertNotEquals("The lists should not be the same", linkedList, linkedList1);
        assertTrue("The values should be ordered as 1, 2, 3.", linkedList1.containsInOrder(1, 2, 3));

    }

    @Test
    public void sortTest () {

        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.sort();

        assertTrue("The values should be ordered as 1, 2, 3.", linkedList.containsInOrder(1, 2, 3));

    }
}
