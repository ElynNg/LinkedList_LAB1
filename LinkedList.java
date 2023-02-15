public class LinkedList {
    Node head;
    Node tail;

    class Node {
        private int data;
        private Node nextNode;

        Node (int data){
            this.data = data;
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
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    void addTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        this.tail.setNextNode(newNode);
        this.tail = newNode;
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
        while (current != null) {
        	System.out.print(current.data + ", ");
        	current = current.getNextNode();
        }
    }
    
    Node search(int data) {
    	Node current = this.head;
    	
    	while (current != null) {
    		if (current.getData() == data) {
    			return current;
    		}
    		else {
    			current = current.getNextNode();
    		}
    	}
    	return null;
    }
}
