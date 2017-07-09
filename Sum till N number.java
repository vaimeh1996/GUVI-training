import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in); 
        int sum=0;
        System.out.println("Enter number upto which sum is required : ");
        int n=sc.nextInt();
        for(int i = 0;i<n+1;i++)
        { 
        sum=sum+i;}
        System.out.println("The sum is : " + sum);
     
}
}