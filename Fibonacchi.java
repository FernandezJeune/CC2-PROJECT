import java.util.*;
public class Fibonacchi {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter number: ");
        
        int num = sr.nextInt() + 1;
        
        output(num);
    }
    public static int fibonacchi(int a){
        if(a==0){
            return 0;
        }else if(a==1){
            return 1;
        }else if(a>1){
            return fibonacchi(a-1) + fibonacchi(a-2);
        }else return 0; 
    }
    public static void output(int num){
        for(int b = 0;b<num;b++){
            System.out.print("F["+b+"]\t");
        }
        for(int a = 0;a<=num;a++){
            for(int b = 0;b<a;b++){
                System.out.print(fibonacchi(b) + "\t");    
        }
            System.out.println("\n");
        }
    }
}
