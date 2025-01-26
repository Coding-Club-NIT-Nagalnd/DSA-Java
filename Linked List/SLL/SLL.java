public class SLL {

    // To represent the node of a Single Linked List
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // To represent the head of the SLL
    public Node head = null;
    // To represent the tail of the SLL
    public Node tail = null;

    // This function creates a node with the passed data and adds it to the SLL
    public void createNode(int data) {
        // Creates a new node (object of class Node)
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // Adds the newNode to the existing list
        tail.next = newNode;
        tail = newNode; // Updates the tail of the SLL
    }

    public static void main(String args[]) {
        // Creating a SLL object
        SLL sll = new SLL();

        // Creating nodes
        sll.createNode(3);
        sll.createNode(1);
        sll.createNode(2);
    }
}
