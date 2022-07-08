/**
 * Queue data structure PriorityQueue class
 * name: Bruce R. Unabia
 * email: bruceunabia2000@gmail.com
 * date of completion: 11/11/21
 */
public class PriorityQueue {
    private Node front, back;
    private int size;

    public void enqueue(String data){
        if(front == null){
            front = back = new Node(null, data);
        }else{
            back.setNext(new Node(null, data));
            back = back.getNext();
            
        }
    }

    public String dequeue() throws Exception{
        if(front == null){
            throw new Exception("not empty");
        }else{
            Node n = front;
            front = front.getNext();
            n.setNext(null);
            return n.getData();
        }
    }
    public void show(){
        for(Node tmp=front; tmp!=null; tmp=tmp.getNext()){
            if(tmp!=front) System.out.print("<--");
            System.out.print("[" + tmp.getData() + "]");
        }
        System.out.println("");
    }
    public int getSize(){
        return size;
    }
}
