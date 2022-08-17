public class Queue {
    private SinglyLinkedList singlyLinkedList;

    public Queue() {
        singlyLinkedList = new SinglyLinkedList();

        //add default element because we add further element after that
        singlyLinkedList.start();
        singlyLinkedList.add(0);
    }

    /**
     * This method will tell the queue is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return singlyLinkedList.getSize() == 1;
    }

    /**
     * This method will add the element in the queue
     *
     * @param value
     */
    public void enqueue(int value) {
        singlyLinkedList.start();

        singlyLinkedList.add(value);
    }

    /**
     * This method will give the element from the queue and remove it
     *
     * @return integer
     * @throws throws exception if queue is empty
     */
    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        singlyLinkedList.tail();

        int value = singlyLinkedList.get();

        singlyLinkedList.remove();

        return value;
    }
}