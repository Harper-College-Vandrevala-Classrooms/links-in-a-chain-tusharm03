class LinkedList {
    private Node head;

    LinkedList() {
        this.head = null;
    }

    public void append(ChainLink link) {
        Node newNode = new Node(link);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next() != null) {
                current = current.next();
            }
            current.setNext(newNode);
        }
    }

    public ChainLink get(int index) {
        if (head == null) {
            return null;
        }

        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data();
            }
            current = current.next();
            count++;
        }

        return null;
    }
}
