import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc1=new Scanner(System.in); 
        int count=0;
        System.out.println("Enter number : ");
        int n=sc1.nextInt();
        while(n!=0)
            {count++;
            n=n/10;
            }
     System.out.println("Total digits: " + count);
}
}