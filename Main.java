import java.util.*;
class Main{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(n==1)
          System.out.println("add:"+(a+b));
        else if(n==2)
          System.out.println("sub:"+(a-b));
        else if(n==3)
          System.out.println("mul:"+(a*b));
        else if(n==4)
          System.out.println("div:"+(a/b));
}}
