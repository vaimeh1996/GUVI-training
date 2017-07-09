import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0)
        System.out.println("It is even");
        else System.out.println("It is odd");
     }
}
