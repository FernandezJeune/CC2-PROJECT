//Activity 4 Fernandez
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.println("Enter the number to be guessed with from 1-1000: ");
        int a = input.nextInt();
          while(a<0 || a>1000){
            System.out.println("Invalid number!"); 
            System.out.println("Enter number again: ");
            a = input.nextInt();
          }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("What is your Guess?: ");
        int b = input.nextInt();
            while(b<0 || b>1000){
            System.out.println("Invalid number!"); 
            System.out.println("Enter number again: ");
            b = input.nextInt();
          }
            
            
        while(b!=a){
            if(a%2 == 0){
                System.out.println("Hint: The number is Even");
            }else{
                System.out.println("Hint: The number is Odd");
            }
            if(b>a){
                System.out.println("Number is too high");
            }else if (b<a){
                System.out.println("Number is too low");
            }                            
            System.out.println("Try Again: ");
            b = input.nextInt();
        }if (b==a){
            System.out.println("Correct!");
        }
        
       
       
}   
}
