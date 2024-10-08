public class palindrome2 
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,1};
        int size=arr.length;
        int flag=0;
        int i=0;
        while(flag==0)
        {
            if(arr[i]==arr[size-1])
            {
                i++;size--;
                System.out.print("Palindrome");
                if(i==size-1||size<0)
                {
                    break;
                }
                else
                {
                    System.out.print("Not Palindrome");
                }
                
            }
        }
    }    
}
