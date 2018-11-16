import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int diff;
        int pro;
        int quo;
      
        System.out.println("Enter Arithmetic Operator: ");
        String operator = sc.nextLine();
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        
        switch(operator){
        case("+"):
        case("add"):
            sum = a+b;
            System.out.println("The sum is: " + sum);
            break;
        case("-"):
        case("subtract"):
            diff = a-b;
            System.out.println("The difference is: " + diff);
            break;
        case("*"):
        case("multiply"):
            pro = a*b;
            System.out.println("The Product is: " + pro);
            break;
        case("/"):
        case("divide"):
            quo = a/b;
            System.out.println("The quotient is: " + quo);
        }   
               
           
    }
    
}
