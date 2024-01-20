/* Brandon Gerber
 * 1/20/2024
 * COP3804
 */
package task5;

import java.io.*;
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        try (Scanner inputStudent = new Scanner(System.in)) {
        	// ask how many students they want to input 
			System.out.print("Input how many students you would like to document:");
			int studentNumber = inputStudent.nextInt();

			try (BufferedWriter studentdatainput = new BufferedWriter(new FileWriter("C:/Users/Brandon/Eclipse-workspace/task5/src/Students.txt"))) {
			    // execute for loop
				for (int i = 1; i <= studentNumber; i++) {
					// write to file, same for line 25 and 29
			        studentdatainput.write("Student " + i + ":\n");

			        System.out.print("Enter Name: ");
			        String name = inputStudent.next();
			        studentdatainput.write("Name: " + name + "\n");

			        System.out.print("Enter Score: ");
			        int score = inputStudent.nextInt();
			        studentdatainput.write("Score: " + score + "\n\n");
			    }
				// print saving data
			    System.out.println ("--------------");
			    System.out.println("Saving data....");
			    System.out.println ("Data saved to file.");
			} catch (IOException e) {
			    System.out.println("An error occurred while writing to the file.");
			    e.printStackTrace();
			}
		}
    }
}
