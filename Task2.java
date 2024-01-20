/* Brandon Gerber
 * 1/19/2024 
 * COP3804
 */
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		// array to store my favorite books
		String[] books = new String[3];
		//assign books to array elements
		books[0] = "Tuesdays with morrie";
		books[1] = "Make your bed";
		books[2] = "The four agreements";
			
		Scanner favBook = new Scanner (System.in);
			System.out.print("Search for favorite book. 0-2 :");
			
			int bookInput = favBook.nextInt();
			if (bookInput >= 0 && bookInput < books.length) {
				if (bookInput >= 0 && bookInput < books.length) {
		            System.out.println("One of my favorite books is: " + books[bookInput] + " (Index # " + bookInput + ")");
		        } else {
		            System.out.println("Invalid input. Please enter a number between 0 and " + (books.length - 1));
		        }
			}
	}
}
			
