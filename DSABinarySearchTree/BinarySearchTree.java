public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insert(int key){
        root = insertNode(root, key);
    }

    private Node insertNode(Node node , int key){
        if(node == null){
            return new Node(key);
        }
        if(key > node.key){
            node.right = insertNode(node.right, key);
        }else{
            node.left = insertNode(node.left, key);
        }
        return node;
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node != null){
            //go to left
            inorder(node.left);
            //visit
            System.out.println(node.key);
            //go to right
            inorder(node.right);
        }
    }
    public void postorder(){
        postorder(root);
    }  
    private void postorder(Node node){
        if(node != null);
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node != null){
            System.out.println(node.key);
            postorder(node.left);
            postorder(node.right);
        }
    }

    public Node search(int key){
        return search(root, key);
    }
    private Node search(Node node, int key){
        if(node == null){
            return null;
        }else{
            if(node.key == key){
                return node;
            }else{
                if(key > node.key){
                    return search(node.right, key);
                }else{
                    return search(node.left, key);
                }
            }
        }

    }
}