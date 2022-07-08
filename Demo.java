public class Demo {
    public static void main(String[] args) {
        IntDLinkedList list = new IntDLinkedList();

        for(int i=0; i<10; i++) {
            list.addToTail( (int)(Math.random()*100) );
        }

        list.show();

        System.out.println("The sum is " + list.sum());
    }
}
