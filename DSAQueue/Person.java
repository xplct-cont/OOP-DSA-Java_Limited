/**
 * Queue data structure Person class
 * name: Bruce R. Unabia
 * email: bruceunabia2000@gmail.com
 * date of completion: 11/11/21
 */
public class Person {
    public static void main(String[] args){
        PriorityQueue queue = new PriorityQueue();

        queue.enqueue("Levi");
        queue.enqueue("Erwin");
        queue.enqueue("Escanor");
        queue.enqueue("Meliodas");
        queue.enqueue("Eren");
        queue.show();

        try {
            queue.dequeue();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            while(queue.getSize() > 0){
                System.out.println(queue.dequeue());
            }
        }catch (Exception ex){
            ex.getStackTrace();

        }



    }
}
