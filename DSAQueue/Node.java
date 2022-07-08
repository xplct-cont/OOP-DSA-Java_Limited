/**
 * Queue data structure Node class
 * name: Bruce R. Unabia
 * email: bruceunabia2000@gmail.com
 * date of completion: 11/11/21
 */
public class Node{
    private Node next;
    private String data;
    
    public Node(Node next, String data) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    

    
}