class MyHashMap {

    // Node class to store key-value pairs
    static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    private Node[] bucketArray;
    private int size = 10;  // Number of buckets

    // Constructor
    public MyHashMap() {
        bucketArray = new Node[size];
    }

    // Hash function
    private int getIndex(int key) {
        return key % size;
    }

    // Put key-value pair
    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = bucketArray[index];

        // Check if key exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;  // Update value
                return;
            }
            head = head.next;
        }

        // Add new node at the beginning
        Node newNode = new Node(key, value);
        newNode.next = bucketArray[index];
        bucketArray[index] = newNode;
    }

    // Get value by key
    public int get(int key) {
        int index = getIndex(key);
        Node head = bucketArray[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }

        return -1;  // Not found
    }

    // Remove key
    public void remove(int key) {
        int index = getIndex(key);
        Node head = bucketArray[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev != null)
                    prev.next = head.next;
                else
                    bucketArray[index] = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}