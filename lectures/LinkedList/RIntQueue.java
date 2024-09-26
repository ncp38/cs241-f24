public class RIntQueue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    public RIntQueue() {
        front = -1;
        rear = -1;
    }

    // check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // insert elements to the queue
    void enqueue(int element) {

        // if queue is full
        if (front == 0 && rear >= items.length - 1) {
            resize();
        }
            if (front == -1) {
                // mark front denote first element of queue
                front = 0;
            }

            rear++;
            // insert element at the rear
            items[rear] = element;
            System.out.println("Insert " + element);
    }

    // delete element from the queue
    int dequeue() {
        int element;

        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            // remove element from the front of queue
            element = items[front];

            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                // mark next element as the front
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    // display element of the queue
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            // display the front of the queue
            System.out.println("\nFront index-> " + front);

            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            // display the rear of the queue
            System.out.println("\nRear index-> " + rear);
        }
    }

    private void resize()
    {
        int newSize = items.length * 2;

        int[] newArray = new int[newSize];

        int i = 0;
        while (i < items.length)
        {
            newArray[i] = items[i];
            i++;
        }

        items = newArray;
    }

    public static void main(String[] args) {

        // create an object of Queue class
        RIntQueue q = new RIntQueue();

        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        q.dequeue();

        // insert elements to the queue
        for(int i = 1; i < 6; i ++) {
            q.enqueue(i);
        }

        // 6th element can't be added to queue because queue is full
        q.enqueue(66);

        q.display();

        // deQueue removes element entered first i.e. 1
        q.dequeue();

        // Now we have just 4 elements
        q.display();

    }
}