import java.util.EmptyStackException;
class StackUnderflow{
    public int[] stackArray;
    public int top;
    public int capacity;
    public StackUnderflow(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; // Indicates an empty stack
    }
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow (custom handling): Cannot push, stack is full.");
        } else {
            stackArray[++top] = item;
            System.out.println(item + " pushed to stack.");
        }
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            int poppedItem = stackArray[top--];
            System.out.println(poppedItem + " popped from stack.");
            return poppedItem;
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public static void main(String[] args) {
        StackUnderflow stack = new StackUnderflow(3);
        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.pop();
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Stack Underflow: Attempted to pop from an empty stack.");
        }
    }
}