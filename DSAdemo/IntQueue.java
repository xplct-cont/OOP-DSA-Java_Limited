public class IntQueue {
    private Node front, back;
    private int size;
    
    public IntQueue() {
        front = back = null;
        size = 0;
    }

    public void enqueue(int data){
        if(front == null){
            front = back = new Node(null, data);
        }else{
            back.setNext(new Node(null, data));
            back = back.getNext();
            
        }
        size++;
    }
    public int dequeue() throws Exception{
        if(front == null){
            throw new Exception("Queue is not empty");
        }else{
            Node n = front;
            front = front.getNext();
            
            n.setNext(null);
            
            size--;

            return n.getData();
        }

    }
    public void show(){
        for(Node tmp=front; tmp!=null; tmp=tmp.getNext()){
            if(tmp!=front) System.out.print("<-");

            System.out.print("[" + tmp.getData() + "]");
        } 
        System.out.println("");
    }

    public int getSize(){
        return size;
    }
}


