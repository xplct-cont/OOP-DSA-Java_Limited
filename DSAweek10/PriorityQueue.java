/**
 * Name: Angela Cecilia G. Lenteria
 * Email:acelenteria@yahoo.com
 * Date of completion: Nov. 12,2021
 */
public class PriorityQueue {
    private Node front;
    private Node back;
    private int size;

    public void enqueue(String data){
        if(front == null){
            front = back = new Node(null, data);
        }else{
            back.setNext(new Node(null, data));
            back = back.getNext();
        }
    } 
    public String dequeue(String string){
        String data = front.getData();
        size = size - 1;
        return data;
    }

    public void show(){
        System.out.print("Persons: ");
        for(Node tmp = front; tmp!=null; tmp=tmp.getNext()){
            if(tmp!=front);
            System.out.print(" [ " + tmp.getData() + " ] ");
        }
        System.out.println("");
    }
    public int getSize(){
        return size;
    }
}



