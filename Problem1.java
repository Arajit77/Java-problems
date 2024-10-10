// write a programm the number is even and divisble by 3
import java.util.Scanner;
public class Problem1
{
    public static void main(String[] args) 
    {
       System.out.print("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans;
        ans=(n%2==0 && n/3==0) ? "yes" :"no"; 
        System.out.print(ans);
    }    
}
