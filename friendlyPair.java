import java.util.Scanner;
public class friendlyPair
{
    public static void main(String[] args)
    {
        int number1, number2;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i < number1; i++)
        {
            if(number1 % i == 0)
            {
                sum1 = sum1 + i;
            }
        }
        for(int i = 1; i < number2; i++)
        {
            if(number2 % i == 0)
            {
                sum2 = sum2 + i;
            }
        }
        if(sum1 == number1 && sum2 == number2)
            System.out.print("These numbers are Friendly Pair");
        else
            System.out.print("These  numbers are not Friendly Pair");
    }	
}