
// Fibbonacci number print

import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args)
     {
        
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a number :");
            int n= sc.nextInt();
            int a1=0,b1=1,c1;
            System.out.print(a1+" "+b1); // printing the 0 and 1
            for(int i=2;i<=n;i++)
            {
                c1=a1+b1;
                System.out.print(" "+c1);
                b1=c1;
                a1=b1;
            }

        
     }
    
}
