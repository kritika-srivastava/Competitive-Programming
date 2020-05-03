
/*PROGRAM 30
 Write a program to implement queue using linklist.
 */
import java.util.*;

public class queuelinkedlist {
    private static class node<T> {
        private final T data;
        private node Next;
        public node next;

        public node(T data) {
            this.data = data;
        }

        public void displayNode() {
            System.out.println(data + "");
        }
    }

    private node first = null;
    private node last = null;

    public boolean isempty() {
        if (first == null)
            return true;
        else
            return false;
    }

    public <T> void addlast(T data) {
        node n = new node(data);
        if (isempty()) {
            n.next = first;
            first = n;
            last = n;
        }
    }
}
