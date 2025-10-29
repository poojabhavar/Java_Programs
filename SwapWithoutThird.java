
import java.util.*; 
public class SwapWithoutThird 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter 2nd number");
        int b=sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a value is "+a+"\nb value is "+b);



        

    }
    
}
