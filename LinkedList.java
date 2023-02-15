public class LinkedList {
    Node head;
    Node tail;

    class Node {
        private int data;
        private Node nextNode;

        Node (int data){
            this.data = data;
            this.nextNode = null;
        }

        Node getNextNode() {
            return this.nextNode;
        }

        int getData() {
            return this.data;
        }

        void setData(int data) {
            this.data = data;
        }

        void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

    void insertToFirst(int data) {
        //create new node
        Node newNode = new Node(data);
//        newNode.setNextNode(this.head);
//        this.head = newNode;
        newNode.nextNode = head;
        head = newNode;
        if (head.nextNode == null){
            tail = head;
        }
    }

    void addTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null){
            insertToFirst(data);
        }else {
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    void visit(Node p){
        System.out.println(p.data + " ");
    }

    void addMany(int[] a){
        for (int i = 0; i < a.length; i++){
            addTail(a[i]);
        }
    }

    int length() {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    void traverse() {
        System.out.print("{");
        Node current = this.head;
        int length = length();
        for (int i = 0; i < length-1; i++){
            System.out.print(current.data + ", ");
            current = current.getNextNode();
        }
        System.out.print(tail.data + "}\n");
    }

    String search(int data) {
        Node current = this.head;
        int length = length();
        for (int i = 0; i < length; i++){
            if (current.data == data){
               return String.valueOf(i);
            }
            current = current.nextNode;
        }
        return null;
    }
}
