//find is the number divisible by 3 and 5

import java.util.Scanner;

public class problem2 
{
    public static void main(String[] args) 
    {   
        System.out.print("Enter a number :");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        String ans;
        ans=(n%3==0 && n%5==0) ? "yes" : "No";
        System.out.print("is "+n+" divisible by 3 & 5 : "+ans);
         
    }    
}
