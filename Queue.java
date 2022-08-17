public class Queue {
    private SinglyLinkedList singlyLinkedList;

    public Queue() {
        singlyLinkedList = new SinglyLinkedList();
    }

    /**
     * This method will tell the queue is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return singlyLinkedList.getSize() == 0;
    }
}