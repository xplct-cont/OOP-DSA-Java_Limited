import java.security.InvalidParameterException; 
public class setDemo{
    public static void main(String[] args){
        Set set1 = new Set(100);
        
        try{
        set1.add(10);
        set1.add(45);
        set1.add(5);
        set1.add(20);
        set1.add(11);
        
        Set set2 = new Set(100);
        set2.add(10);
        set2.add(9);
        set2.add(6);
        set2.add(25);


        System.out.println("set1 is a subset of set2? " + set1.isSubset(sub2));
        }catch(InvalidParameterException ex){
            System.out.println(ex.getMessage());

        }

    }
}