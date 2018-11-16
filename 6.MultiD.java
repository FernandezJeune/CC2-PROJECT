import java.util.*;
public class MultiD {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int r;
     int c;

        System.out.println("Enter Row size: ");
        r = sc.nextInt();
        int [][] z = new int[r][];
        int data;
        
        for(int a=0;a<r;a++){
            System.out.println("Enter Column Size: ");
            c = sc.nextInt();
            z[a] = new int[c];
        
            for(int b=0;b<c;b++){
                System.out.println("Row " + a + " Column " + b);
                data = sc.nextInt();
                z[a][b]=data;
            }
        }
        
        System.out.println();
        for(int a=0;a<z.length;a++){
            for(int b=0;b<z[a].length;b++){
                System.out.print(z[a][b] + "\t");
            }
            System.out.println("");
        }
        
 
}   
}


