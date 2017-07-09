import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n!=0)
        { if(n<0) System.out.println("Negative");
        else System.out.println("Positive");}
        else System.out.println("zero");
        
     }
}
