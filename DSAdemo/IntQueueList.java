public class IntQueueList {
    
    public static void main(String[] args){
        IntQueue queue = new IntQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.show();

        try{
            while(queue.getSize() > 0){
                System.out.println(queue.dequeue());
            }
        }catch (Exception ex){
        ex.printStackTrace();
        }
    }
}
