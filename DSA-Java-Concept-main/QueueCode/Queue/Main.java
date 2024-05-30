// package Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte elements in queue: ");
        Queue queue = new Queue(1);
        // Items to be Inserted into queue
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.printQueue();

        queue.getFirst();
        queue.getLast();
        queue.getLength();

        System.out.println("Dequeued element from queue");
        // (1) Items - Return 1 Node
        System.out.println("Dequeue:  " + queue.dequeue().value);
        // (2) Items - Return 2 Node
        System.out.println("Dequeue:  " + queue.dequeue().value);
        queue.printQueue();

    }

}
