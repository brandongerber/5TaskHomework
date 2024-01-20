/* Brandon Gerber
 * 1/20/2024
 * COP3804
 */
import java.io.*;
import java.util.*;

public class Task5B {
    public static void main(String[] args) throws FileNotFoundException {
    	// read in file
        File file = new File("C:/Users/Brandon/eclipse-workspace/task5/src/Students.txt");
        Scanner scan = new Scanner(file);
        scan.nextLine();
        int totalScore = 0;
        int numberOfStudents = 0;
       // scan line 
        while (scan.hasNextLine()) {    
            String line = scan.nextLine();
            // split line and stores each word into a different index of an array
            String[] parts = line.split(" ");
           
            if (parts.length >= 2) {
                try {
                	// parse string and return integer
                    int score = Integer.parseInt(parts[1]);
                    totalScore += score;
                    numberOfStudents++;
               } catch (NumberFormatException e) {
                   }
            }
        }
        // find the average by dividing total score by the number of students 
        int average; 
        if (numberOfStudents > 0) {
        	average = totalScore / numberOfStudents;	
        }
        else average = 0;
        // print the average score 
        System.out.println("The average score is " + average);

        scan.close();
    }
}
