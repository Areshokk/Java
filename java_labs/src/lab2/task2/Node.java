package lab2.task2;

public class Node {

    public int item;
    public Node next;

    public Node(final int item, final Node next) {
        this.item = item;
        this.next = next;
    }

    public int getItem() { return item; }

//

    public Node getNext() {
        return next;
    }


}
