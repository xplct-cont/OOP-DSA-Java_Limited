/**
 * @author Bruce Unabia
 * Date of Completion: October 27, 2021 Wednesday 
 */
public class IntDLinkedList {
    private Node head, tail;
    private Node next, prev;
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
    public void highest(){
        Node data = head;
            int highest;
            highest = head.getData(); 
    
            while (data != null){ 
                if(highest < data.getData()){ 
                   highest = data.getData(); 
                }
                data = data.getNext();//the data must be outside the bracket so that it will not loop infinitely
            }
            System.out.println("THE HIGHEST VALUE OF THE LIST: " + highest);
        }
    public void lowest(){
        Node data = head;
            int lowest;
            lowest = head.getData();
    
            while (data != null){
                if(lowest > data.getData()){
                    lowest = data.getData();
                }
                data = data.getNext();
            }
            System.out.println("THE LOWEST VALUE OF THE LIST: " + lowest); 
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
        IntDLinkedList list = new IntDLinkedList();
        double Average = 10;

        for(int i=0; i<10; i++) {
            list.addToTail( (int)(Math.random()*1000000) );
        }
        list.show();
        list.highest();
        list.lowest();

        System.out.println("The sum is " + list.sum());
        System.out.println("and the average is: " + list.sum() / Average);
    }
}

