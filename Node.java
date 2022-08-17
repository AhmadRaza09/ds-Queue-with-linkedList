/**
 * Created By: Ahmad Raza
 * Date: 15 Mar 2022
 **/

public class Node {
    private int value;  // value store in node
    private Node next;  // piont to the next node in the chain

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }

}