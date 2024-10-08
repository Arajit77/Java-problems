
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int i,count=0;
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {

            if(n%i==0) // we will get only two time 0 ,that is 1 and the number itself
            {
                count++; // if we get two time the reminder 0 then it is a prime number
            }
        }
        if(count==2)
        {
            System.out.print("Prime Number");
        }
        else
        {
            System.out.print("Not Prime Number");
        }

    }
    
}
