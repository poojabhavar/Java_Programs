public class PrimeArrayNumber
{
    public static void main(String[] args) 
    {
        int arr[]={5,10,21,39,40,45,55,32};
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            int count=0;
            for(int j=2;j<x;j++)
            {
                if(x%j==0)
                {
                    count=0;
                    System.out.println("not a prime number");
                }
                else
                {
                    count=1;
                    System.out.println("prime number");

                    
                }
            }
        }
        
    }
    
}
