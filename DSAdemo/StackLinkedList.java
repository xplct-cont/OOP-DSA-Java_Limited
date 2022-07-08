/**Linked List implementation of a Stack
 * with a data type of String
 * Methods: push, pop, peek, count
 * @author Bruce R. Unabia 
 */
public class StackLinkedList{
    
    private Node top;
    private int count;
    
    public StackLinkedList(){
        top = null;
        count = 0;
    }
    private String data;
    private Node next;
    
    public void Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public void push(String data){
        if(top == null){
            top = new Node(data , null);
        }else{
            Node n = new Node(data , top);
            top = n;
        }
        count ++;
    }
    
    public String pop() throws Exception {
        if(top != null){
            Node n = top;
                
            top = top.getNext();
            n.setNext(null);
                
            return n.getData();  
        }else{
            throw new Exception("You cannot pop from an empty stack.");
        }
    }
    
    public String peek() throws Exception{
        if(top != null){
            return top.getData();
        }else{
            throw new Exception("You cannot peek from an empty stack.");
        }
    }
    public int getCount(){
        return count;
    }
    public static void main(String[]args){
        StackLinkedList stack = new StackLinkedList();

        stack.push("4");
        stack.push("3");
        stack.push("13");
        stack.push("11");

        
        try{
        System.out.println("Pop " + stack.pop());
        System.out.println("Pop " + stack.pop());
        System.out.println("Pop " + stack.pop());
        System.out.println("Peek " + stack.peek());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }   

}
