import java.security.InvalidParameterException;

public class Set {
    private boolean[] data;
    private int max;
    private int add = 1;

    public static void main(String[] args) {
        System.out.println("");
        System.out.print("Set 1: ");
            Set set1 = new Set(100);
        try{
            set1.add(45);
            set1.add(10);
            set1.add(25);
            set1.show();

            System.out.print("Set 2: ");
            Set set2 = new Set(100);
            set2.add(10);
            set2.add(14);
            set2.add(45);
            set2.show();

            System.out.println("");
             
            System.out.println("Intersection: ");
            Set intersectset1 = set1.intersect(set2);
            intersectset1.show();
            
            System.out.println("Difference: ");
            Set intersectset2 = set1.differ(set2);
            intersectset2.show();
        } catch (Exception ex) {    
           
            System.out.println(ex.getMessage());
        }
    }

    public set (int max){
        this.max = max;
        this.data = new boolean [max + add];
    }

    public boolean exists (int value) throws InvalidParameterException {
        if (value < 0 || value > max) {
            throw new InvalidParameterException("not in ranged.");
        }else{
            return data[value];
        }
    }

    public void add (int value) throws InvalidParameterException {
        if (value < 0 || value > max ){
            throw new InvalidParameterException("not in ranged.");
        }
        else{
            data[value] = true;
        }
    }

    public Set intersect (Set set2) {
        Set j = new set(max);
        for(int i = 0; i < max; i++){
            if(this.exists(i)& set2.exists(i)){
                j.add(i);
            }
        }
        return j;
    } 

    public Set differ (Set set2) {
        Set j = new set(max);
        for(int i = 0; i < max; i++){
            if(!this.exists(i) == set2.exists(i)){
                j.add(i);
            }
        }
        return j;
    }

    public void show() {
        System.out.print("{");
        for(int n = 0; n < max; n++) {
            if(data[n]) {
                System.out.print(n + ",");
            }
        }
        System.out.println("}");
    }

}

        

