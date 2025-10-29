public class Pattern3 
{

    public static void main(String[] args) {
        int n = 3; // rows

        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" "); 
            }

            // print stars before number
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            // print number
            System.out.print(i + " ");

            // print stars after number
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}
/*
    1
  * 2 *
* * 3 * *
 
*/
