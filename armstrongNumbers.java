//Krenare Syla//
// This code calculates the armstrong numbers from 0-1000
// Anumber is said to be an Armstrong number when the sum of the nth power of digit of the number is equal to the number itself.//

public class armstrongNumbers {

    public static void main(String[] args) {

        int min = 0, max = 1000;

        for(int num = min + 1; num < max; ++num) {
            int digitsOFnumber = 0;
            int result = 0;
            int initialnumber = num;
            while (initialnumber != 0) {
                initialnumber /= 10;
                ++digitsOFnumber;
            }
            initialnumber = num;
            while (initialnumber != 0) {
                int remainder = initialnumber % 10;
                result += Math.pow(remainder, digitsOFnumber);
                initialnumber /= 10;
            }
            if (result == num)
                System.out.print(num + " ");
        }
    }
}