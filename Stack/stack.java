class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        /**
         * Initialize a stack with a fixed capacity.
         *
         * @param capacity The maximum number of elements the stack can hold.
         */
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        /**
         * Add an element to the top of the stack.
         *
         * @param value The value to add to the stack.
         */
        // pass
    }

    public int pop() {
        /**
         * Remove and return the element at the top of the stack.
         *
         * @return The element at the top of the stack.
         * @throws IllegalStateException if the stack is empty.
         */
        // pass
        return -1;
    }

    public int peek() {
        /**
         * Return the element at the top of the stack without removing it.
         *
         * @return The element at the top of the stack.
         * @throws IllegalStateException if the stack is empty.
         */
        // pass
        return -1;
    }

    public boolean isEmpty() {
        /**
         * Check if the stack is empty.
         *
         * @return True if the stack is empty, False otherwise.
         */
        // pass
        return false;
    }

    public boolean isFull() {
        /**
         * Check if the stack is full.
         *
         * @return True if the stack is full, False otherwise.
         */
        // pass
        return false;
    }

    public int size() {
        /**
         * Get the number of elements in the stack.
         *
         * @return The number of elements in the stack.
         */
        // pass
        return 0;
    }

    public void printStack() {
        /**
         * Print the elements of the stack.
         */
        // pass
    }
}