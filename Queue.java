import java.util.LinkedList;
import java.util.Queue;
class QueueOperations {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        System.out.println("--- Enqueue Operations ---");
        myQueue.offer("Apple");
        System.out.println("Added: Apple. Current Queue: " + myQueue);
        myQueue.offer("Banana");
        System.out.println("Added: Banana. Current Queue: " + myQueue);
        myQueue.offer("Cherry");
        System.out.println("Added: Cherry. Current Queue: " + myQueue);

        System.out.println("\n--- Dequeue Operations ---");
        if (!myQueue.isEmpty()) {
            String removedElement = myQueue.poll();
            System.out.println("Removed: " + removedElement + ". Current Queue: " + myQueue);
        } else {
            System.out.println("Queue is empty, cannot dequeue.");
        }
        if (!myQueue.isEmpty()) {
            String removedElement = myQueue.poll();
            System.out.println("Removed: " + removedElement + ". Current Queue: " + myQueue);
        } else {
            System.out.println("Queue is empty, cannot dequeue.");
        }
        System.out.println("\n--- Attempting to Dequeue from Empty Queue ---");
        if (!myQueue.isEmpty()) {
            String removedElement = myQueue.poll();
            System.out.println("Removed: " + removedElement + ". Current Queue: " + myQueue);
        } else {
            System.out.println("Queue is empty, cannot dequeue.");
        }
    }
}