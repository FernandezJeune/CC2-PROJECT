import java.util.*;
public class Last {
    public static void main(String[] args) {
    display();    
    }
        public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to get? factorial/fibonacci?");
        String choice  = sc.nextLine();
        while(!choice.equals("factorial") || choice.equals("fibonacci")){
            System.out.println("What do you want to get?  factorial/fibonacci?");
            sc = new Scanner(System.in);
            choice = sc.nextLine();
                    
        }
            
            
        System.out.println("Enter Size of array: ");
        int num = sc.nextInt();
        int[] size  = new int[num];
        
        System.out.println("Enter Elements: ");
        for(int i = 0; i < num; i++){
        size[i] = sc.nextInt();
        }

        
        if(choice.equals("fibonacci")){
          for(int i = 0; i<size.length; i++){
              System.out.print("F(" + size[i] + ")\t");
          }
        System.out.print("\n");
        for(int i = 0; i<size.length;i++){
            System.out.print(fibo(size[i]) + "\t");
        }
        }

        
        
        if(choice.equals("factorial")){
           for(int i = 0; i<size.length; i++){
               System.out.print("F(" + size[i] + ")\t" );
           }
        System.out.print("\n");
        for(int i = 0; i < size.length; i++){
            System.out.print(facto(size[i]) + "\t");
        }
        }
    }

        public static int fibo(int a){
        if(a==0){
            return 0;
        }else if(a==1){
            return 1;
        }else if(a>1){
            return fibo(a-1) + fibo(a-2);
        }else return 0; 
        }
        
        public static int facto(int a){
            if(a<=0){
                return 1;
            }else{
             return a*facto(a-1);   
            }    
        }
        
        
        
        
}
