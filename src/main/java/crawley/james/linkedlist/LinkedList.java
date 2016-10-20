package crawley.james.linkedlist;

/**
 * Created by jamescrawley on 10/20/16.
 */
public class LinkedList {

    private int size;
    private Node head;
    private Node current;

    class Node {

        private Node next;
        private int value;

        Node (int value) {
            this.value = value;
        }

    }

    public void add (int value) {

        Node newNode = new Node (value);

        if (current == null) {
            current = newNode;
            head = current;

        } else {
            current.next = newNode;
            current = newNode;

        }

        size++;
    }

    public void remove (int index) {

        Node search = head;

        if (index == 0) {
            head = search.next;
        } else {

            for (int i = 0; i < index - 1; i++) {
                search = search.next;
            }
        }

        search.next = search.next.next;

    }

    public boolean contains (int value) {

        return false;

    }

    public boolean containsInOrder (int... values) {

        int length = values.length;
        Node search = head;

        for (int i = 0; i < length; i++) {

            if (search.value != values[i]) {
                return false;
            }
            search = search.next;
        }

        return true;
    }

    public int find (int value) {

        return -1;

    }

    public int size () {

        return size;

    }

    public int get (int index) {

        Node search = head;

        if (index == 0) {
            return head.value;
        }

        for (int i = 0; i < index; i++) {
            search = search.next;
        }

        return search.value;

    }

    public LinkedList copy () {

        return null;

    }

    public void sort () {

    }

}
