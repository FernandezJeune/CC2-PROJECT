package array;
public class Array {
    public static void main(String[] args) {
    int [] sample = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21};
    int [] arrayeven = new int [sample.length];
    int [] arrayodd = new int [sample.length];
    int odd = 0;
    int even = 0;
    
    System.out.println("Elements of array: ");
    for(int i=0;i<sample.length;i++){
            System.out.print(sample[i] + "\t");
    }
    
        System.out.println("");
        
        System.out.println("\nEven\tOdd");
    for(int i=0;i<sample.length;i++){
      if(sample[i]%2==0){
         arrayeven[even] = sample[i];
            System.out.println(arrayeven[even]);
         even++;
      }
    }
    for(int i=0;i<sample.length;i++){
      if(sample[i]%2!=0){
         arrayodd[odd] = sample[i];
            System.out.println("\t" + arrayodd[odd]);
         odd++;
      }
    }
    
  
    
    

    
    
        
}   
}
