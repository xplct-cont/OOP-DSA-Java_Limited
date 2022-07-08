import java.util.Scanner;
public class Missile{

    static int serialNumber = 06202002;
    static String target = "";
    static String status;

    static Missile missile = new Missile();

    public static void main(String[] args){
        System.out.println("OPERATION KILL");
        System.out.println("Serial number: " + serialNumber);
        System.out.println("---------");
        
        missile.fire();
        missile.selectTarget();
        
    }
    public void selectTarget(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target: ");
        String target = sc.nextLine();
        System.out.println("Target " + target + " selected.");
    }


    public void fire(){
        new Missile();
        if(target == ""){
            status = "MOBILIZED";
            System.out.println("MISSILE ON THE WAY");
            status = "DETONATED";
            System.out.println("IMPACT DETECTION");    
        } else{
            System.out.println("SELECT A TARGET FIRST");
    }
}
}
