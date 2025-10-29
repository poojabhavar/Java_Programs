public class PrimeArray 
{
    void checkArray(int arr[])
    {
        
        int sum=0,sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                sum=sum+num;
            }
            else
            {
                sum1=sum1+num;

            }


        }
        System.out.println("prime number addition is   "+sum);
        System.out.println("not prime number addition is  "+sum1);
    }
        public static void main(String[] args) 
        {
        PrimeArray pa= new PrimeArray();
        pa.checkArray(new int[]{3,4,5,6,7,8});
        }
    
}
