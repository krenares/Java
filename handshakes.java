//this code calculates the number of handshakes performed from a specific number of students
import java.util.*;
public class handshakes
{
    public static void main(String[] args)
    {
        int numberOFStudents;
        Scanner sc = new Scanner(System.in);
        // input of how many students are handshaking
        numberOFStudents = sc.nextInt();
        //deriving from combination formula "numberC2"
        int total = numberOFStudents * (numberOFStudents-1) / 2; 
        System.out.print("Number of Handshakes is " +total);
        sc.close();
    }
}