package lab2.task2;

import java.util.Iterator;


public class Stack implements Iterable<Integer> {

    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return (this.top == null);
    }

    public void push(final int a) {
        top = new Node(a, top);
    }

    public int pop()  {

        int result = 0;

        if (isEmpty()) {
            System.out.println("stack empty");
        } else {
            result = top.item;
            top = top.next;
        }
        return result;
    }

    class NodeIterator implements Iterator<Integer> { // перевірка чи є ще елементи

        boolean hasNext = false;
        private Node cur = top;

        public boolean hasNext() {
            if (cur == null) {
                hasNext = false;
            } else {
                hasNext = true;
            }
            return hasNext;
        }

        public Integer next() {// повертає поточний елемент і перемикається на наступний
            final Node result = cur;
            cur = cur.next;
            return result.item;
        }
    }

    public Iterator<Integer> iterator() {
        return new NodeIterator();
    }
}


