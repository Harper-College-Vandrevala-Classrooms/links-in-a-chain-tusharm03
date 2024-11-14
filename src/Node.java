class Node {
    ChainLink data; 
    Node next;     

    Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }


    public ChainLink data() {
        return this.data;
    }

    public Node next() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
