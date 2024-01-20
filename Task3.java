/* Brandon Gerber
 * 1/19/2024
 * COP3804
 */
public class Task3 {
public static void main (String[] args) {
	int number = 6462925;
			int sum = 0;
			while (number != 0) {
	            int digit = number % 10;
	            sum += digit;
	            number /= 10;
	        }

	        System.out.println("The sum of digits in 6462925 is: " + sum);
	    }
	}
