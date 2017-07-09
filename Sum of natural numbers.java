import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc1=new Scanner(System.in); 
        Scanner sc2=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter how many numbers : ");
        int n=sc1.nextInt();
        int a[]=new int[n];
        for(int i = 0;i<n;i++)
        { a[i]=sc2.nextInt();
            sum=sum+a[i];
        }
        
        System.out.println("The sum is : " + sum);
     
}
}