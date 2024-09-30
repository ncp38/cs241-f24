// Stack implementation in Java

class RStack<E> {

    // store elements of stack
    private Object arr[];
    // represent top of stack
    private int top;

    // Creating a stack
    RStack() {
        // initialize the array
        // initialize the stack variables
        arr = new Object[30];
        top = -1;
    }

    // push elements to the top of stack
    public void push(E x) {
        if (top+1 >= arr.length) {
            resize();
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop elements from top of stack
    public E pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return (E) arr[top--];
    }

    // pop elements from top of stack
    public E peek() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            return null;
        }

        // pop element from top of stack
        return (E) arr[top];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private void resize()
    {
        int newSize = 2 * arr.length;

        Object[] newArray = new Object[newSize];

        int i = 0;
        while (i < arr.length)
        {
            newArray[i] = arr[i];
            i++;
        }

        arr = newArray;
    }

    public static void main(String[] args) {
        RStack<Integer> stack = new RStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack: ");
        stack.printStack();

        // remove element from stack
        System.out.println("Popping from the top of the stack: " + stack.pop());
        System.out.println("\nAfter popping out");
        stack.printStack();

        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println();

    }
}