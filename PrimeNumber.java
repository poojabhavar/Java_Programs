
public class PrimeNumber {

    void checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime number");
        }

    }
    public static void main(String args[])
{
    PrimeNumber pn=new PrimeNumber();
    pn.checkPrime(12);
    pn.checkPrime(7);
    
}


}
