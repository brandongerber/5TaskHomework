/* Brandon Gerber
 * 1/19/2024 
 * COP3804
 */
public class Task2 {
	public static void main(String[] args) {
		        // array to store my favorite books
		        String[] books = new String[3];
		        // assign books to array elements
		        books[0] = "Tuesdays with Morrie by Mitch Albom";
		        books[1] = "Make your Bed by William H. McRaven";
		        books[2] = "The Four Agreements by Don Miguel Ruiz";

		        // search for book in array 
		        int searchBooks = 1;

		        // print favorite book
		        if (searchBooks >= 0 && searchBooks < books.length) {
		            System.out.println("One of my favorite books is: " + books[searchBooks] + " (# " + searchBooks + ")");
		        } else 
		        	System.out.println("Invalid search.");
		        }
		    }
					
