import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();

        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.clear();

        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);

        System.out.println("--------------------------dequeue");

        int result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);

        queue.enqueue(12);
        queue.enqueue(13);

        result = queue.dequeue();
        System.out.println(result);
        result = queue.front();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);
        result = queue.dequeue();
        System.out.println(result);

        result = queue.front();
        System.out.println(result);

        result = queue.dequeue();
        System.out.println(result);

        result = queue.front();
        System.out.println(result);
    }
}