class Queue {
    private int[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        /**
         * Initialize a queue with a fixed capacity.
         *
         * @param capacity The maximum number of elements the queue can hold.
         */
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        /**
         * Add an element to the rear of the queue.
         *
         * @param value The value to add to the queue.
         */
        // pass
    }

    public int dequeue() {
        /**
         * Remove and return the element at the front of the queue.
         *
         * @return The element at the front of the queue.
         * @throws IllegalStateException if the queue is empty.
         */
        // pass
        return -1;
    }

    public int peek() {
        /**
         * Return the element at the front of the queue without removing it.
         *
         * @return The element at the front of the queue.
         * @throws IllegalStateException if the queue is empty.
         */
        // pass
        return -1;
    }

    public boolean isEmpty() {
        /**
         * Check if the queue is empty.
         *
         * @return True if the queue is empty, False otherwise.
         */
        // pass
        return false;
    }

    public boolean isFull() {
        /**
         * Check if the queue is full.
         *
         * @return True if the queue is full, False otherwise.
         */
        // pass
        return false;
    }

    public int size() {
        /**
         * Get the number of elements in the queue.
         *
         * @return The number of elements in the queue.
         */
        // pass
        return 0;
    }

    public void printQueue() {
        /**
         * Print the elements of the queue.
         */
        // pass
    }
}