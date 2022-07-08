/**
 * a program that will generate a multiplication table
 * with dynamic number of rows and columns
 * @author Bruce R. Unabia
 */
import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Assignment{
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows (x)");
        int x = sc.nextInt();   
        
        System.out.println("Enter the number of columns (y)");
        int y = sc.nextInt();
        
        int [][] lengthTable = {{x-1, y-1}};

        if(x > 15 || y > 15){
            System.out.println("error, the number has exceeded to the given limit.");
            System.exit(0);                             /**prevents the code from continuing to run if
                                                           the statement is false */
        }

        System.out.println("");
        for(int i = 1; i <= lengthTable.length; i++ ) {
        }
        System.out.print("");
         for(int i = 0; i <= x; i++) {
            System.out.print(String.format("%4d)", i));

            for(int j = 1; j <= y; j++) {
                System.out.print(String.format("%4d", i * j));
            }
            System.out.println("");
        }
    }
}

