/**
 * @author Bruce R. Unabia
 * Date of Completion: October 26, 2021 Tuesday 
 */
public class IntDLinkedList {
    private Node head, tail;
    private Node prev;
    private Node next;
    private int data;

    public void Node(int data, Node prev, Node next) {
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

    public IntDLinkedList() {
        head = tail = null;
    }

    private void addOnEmpty(int data) {
        head = tail = new Node(data, null, null);
    }
    public void addToTail(int data) {
        if(head==null) {
            addOnEmpty(data);
        }else {
            tail.setNext(new Node(data, tail, null));
            tail = tail.getNext();
        }
    }
    public void addToHead(int data) {
        if(head==null) {
            addOnEmpty(data);
        }else {
            head.setPrev(new Node(data, null, head));
            head = head.getPrev();
        }
    }
    public void addAfter(int targetValue, int data) {
        Node tmp;
        for(tmp=head; tmp.getData()!=targetValue && tmp.getNext()!=null ; tmp = tmp.getNext()) {
        }

        Node nextOfTmp = tmp.getNext();
        tmp.setNext(new Node(data, nextOfTmp, nextOfTmp));
    }
    public void Highest(){
    Node pointer = head;
        int highest;
        highest = head.getData(); 

        while (pointer != null){ 
            if(highest < pointer.getData()){ 
               highest = pointer.getData(); 
            }
               pointer = pointer.getNext();
        }
        System.out.println("Highest value: " + highest);
    }
    public void Lowest(){
        Node pointer = head;
        int lowest;
        lowest = head.getData();

        while (pointer != null){
            if(lowest > pointer.getData()){
                lowest = pointer.getData();
            }
            pointer = pointer.getNext();
        }
        System.out.println("Lowest value: " + lowest); 
    }

    public int sum() {
        int s = 0;
        for(Node tmp=head; tmp!=null; tmp=tmp.getNext()) {
            s += tmp.getData();
        }
        return s;
    }

    public void show() {
        for(Node tmp=head; tmp!=null; tmp=tmp.getNext()) {
            System.out.print("[" + tmp.getData() + "] ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        IntDLinkedList List = new IntDLinkedList();
        double Average = 10;
        System.out.println("");
        
        List.addToTail(10);
        List.addToTail(20);
        List.addToTail(30);
        List.addToTail(40);
        List.addToTail(50);
        List.addToTail(60);
        List.addToTail(70);
        List.addToTail(80);
        List.addToTail(90);
        List.addToTail(100);


        List.addAfter(50, 51);
        List.show();
        System.out.println("");
        List.Highest();

        List.Lowest();
        System.out.println("");
        System.out.println("Sum: " + List.sum() );
        System.out.println("Average: " + List.sum() / Average);
    }
}


