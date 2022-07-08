public class BSTDemo {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();

        for(int i = 0; i < 10; i++ ){
            b.insert((int)(Math.random()*100));
        }
        b.inorder();

        Node s = b.search(10);
        if(s != null){
            System.out.println("Found: " + s.key);
        }else{
            System.out.println("NOT FOUND");
        }
        
        System.out.println("PRE ORDER");
        b.preorder();

        System.out.println("POST ORDER");
        b.postorder();
    }
}
