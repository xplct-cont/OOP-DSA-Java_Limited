public class Node {
    private Node next, prev;
    private int data;

    public Node(int data, Node prev, Node next) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    
}
