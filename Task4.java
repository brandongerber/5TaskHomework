/* Brandon Gerber
 * 1/20/2024
 * COP3804
 */
public class Task4 {
    public static void main(String[] args) {
        // testing class name
        String classInput = "COP3804";
        System.out.println ("Is COP3804 a prime number?");
        int length = classInput.length();
        boolean primeNumber = true;

        if (length <= 1) {
            primeNumber = false;
        } else {
            int root = (int) Math.sqrt(length); // math.sqrt used to find prime number
            for (int i = 2; i <= root; i++) {
                if (length % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }

        // display the result
        if (primeNumber) {
            System.out.println(classInput + " is a prime number.");
        } else {
            System.out.println(classInput + " is not a prime number.");
        }
    }
}