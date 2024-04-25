/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subtractnumbers;

/**
 *
 * @author ntand
 */
import java.util.Scanner;
public class SubtractNumber{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner number = new Scanner(System.in);
        int num1;
        int num2;
        int difference;
    System.out.println("Enter first num:");
    
     num1 = number.nextInt();
     
     System.out.println("Enter second num:");
     
     num2 = number.nextInt();
     
    difference = num1 - num2;
     
     System.out.println("The difference is:"+ difference);
     
     
     
    
}
    
}
