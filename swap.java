

import java.util.* ;
class swap {
    public static void main(String[] args) {
        
        System.out.println(" Swaping Programme ");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number 1 ");
        int a1 = sc.nextInt();
                
        System.out.println(" Enter Number 2 ");
        int a2 = sc.nextInt();
        
        System.out.println(" Number 1 Is  "+a1 +" Number Two Is "+a2);
      // swaping logic code 
            int temp = a1 ;
            a1 = a2 ;
            a2 = temp ;
         System.out.println(" After Swapping Number 1 Is  "+a1 +" Number Two Is "+a2);
            
        
    }
}
