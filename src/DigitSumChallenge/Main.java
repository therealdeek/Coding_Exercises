package DigitSumChallenge;

public class Main
{
    public static void main(String[]args)
    {
        System.out.println("The sum of the digits is " +
                sumDigits(-124));
    }

    public static int sumDigits(int number)
    {
        if((number < 10))
        {
            return -1;
        }
        int sum = 0;

        while(number> 0)
        {
            int digit = number %10; //extract least significant digit
            sum += digit;

            number /=10; //drop the least-significant digit
        }
        return sum;
    }
}
