import java. util.Scanner;
public class SimpleInterest 
{
    public static void main(String[] args) 
    {
    
        System.out.print("Enter the capital :");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();

        System.out.print("Enter the time :");
        Scanner sc1=new Scanner(System.in);
        int t=sc1.nextInt();

        System.out.print("Enter the rate percentage :");
        Scanner sc2=new Scanner(System.in);
        int r=sc2.nextInt();

        int interest=(p*t*r)/100;
        System.out.print("capital :"+p+" years(time), :"+t+"years"+", rate(in percentage), :"+r+"%"+" \ninterest :"+interest);    
    }    
}
