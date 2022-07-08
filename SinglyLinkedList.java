public class SinglyLinkedList {
    Node head, tail;
    
        public LinkedList() {
            head = tail = null;
        }
    
        public void addToTail(int data) {
            if(head==null) {
                head = tail = new Node(data, null);
            }else {
                tail.next = new Node(data, null);
                tail = tail.next;
            }
        }
        public void addBefore(int targetValue, int data){
            Node pointer,before;
            for(pointer=head; tmp.data!=targetValue && tmp.next!=null ; tmp = tmp.next) {
            }
    
            Node nextOfTmp = tmp.next;
            tmp.next = new Node(data, nextOfTmp);
        }
    
        public void addAfter(int targetValue, int data) {
            Node tmp;
            for(tmp=head; tmp.data!=targetValue && tmp.next!=null ; tmp = tmp.next) {
            }
    
            Node nextOfTmp = tmp.next;
            tmp.next = new Node(data, nextOfTmp);
        }
    
        public void addToHead(int data) {
            if(head==null) {
                head = tail = new Node(data, null);
            }else {
                head = new Node(data, head);
            }
        }
    
        public void show() {
            for(Node tmp=head; tmp!=null; tmp=tmp.next) {
                System.out.print("[" + tmp.data + "]");
            }
            System.out.println("");
        }
        public static void main(String[] args) {
            SinglyLinkedList list1 = new SinglyLinkedList();
    
            list1.addToTail(10);
            list1.addToTail(15);
            list1.addToTail(18);
    
            list1.show();
    
            list1.addAfter(15,17);
            list1.addAfter(20, 21);
            list1.addToHead(1);
    
            list1.show();
    
            list1.addBefore(10,9);
            list1.addBefore(15,14);
            list1.addBefore(20,19);
    
            list1.show();
        }
    }

