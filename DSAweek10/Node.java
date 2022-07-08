/**
 * Name: Angela Cecilia G. Lenteria
 * Email:acelenteria@yahoo.com
 * Date of completion: Nov. 12,2021
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