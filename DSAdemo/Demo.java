public class Demo {
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
