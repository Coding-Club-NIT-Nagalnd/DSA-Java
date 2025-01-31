class DoublyListNode {
    int value;
    DoublyListNode prev;
    DoublyListNode next;

    public DoublyListNode(int value) {
        /**
         * Initialize a node in the doubly linked list.
         *
         * @param value The value to be stored in the node.
         */
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private DoublyListNode head;
    private DoublyListNode tail;

    public DoublyLinkedList() {
        /**
         * Initialize an empty doubly linked list.
         */
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int value) {
        /**
         * Insert a value at the head of the linked list.
         *
         * @param value The value to insert.
         */
        // pass
    }

    public void insertAtTail(int value) {
        /**
         * Insert a value at the tail of the linked list.
         *
         * @param value The value to insert.
         */
        // pass
    }

    public void insertAtIndex(int index, int value) {
        /**
         * Insert a value at a specific index in the linked list.
         *
         * @param index The index where the value will be inserted.
         * @param value The value to insert.
         */
        // pass
    }

    public void deleteAtHead() {
        /**
         * Delete the node at the head of the linked list.
         */
        // pass
    }

    public void deleteAtTail() {
        /**
         * Delete the node at the tail of the linked list.
         */
        // pass
    }

    public void deleteAtIndex(int index) {
        /**
         * Delete the node at a specific index in the linked list.
        