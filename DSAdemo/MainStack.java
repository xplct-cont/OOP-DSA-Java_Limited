public class MainStack{
    public static void main(String[]args){
        StringStack stack = new StringStack();

        stack.push("9");
        stack.push("4");
        stack.push("7");
        stack.push("10");
        stack.push("20");
        
        try{
        System.out.println("Pop " + stack.pop());
        System.out.println("Pop " + stack.pop());
        System.out.println(stack.peek());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }   
}