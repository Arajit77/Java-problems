import java. util.Scanner;

public class FloydTriangle 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
