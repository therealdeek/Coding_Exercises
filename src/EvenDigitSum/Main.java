package EvenDigitSum;

public class Main
{

    public static void main(String[]args)
    {
        System.out.println(getEvenDigitSum(-3571));
    }

    public static int getEvenDigitSum(int number)
    {
        if (number < 0)
        {
            return -1;
        }

        int sum = 0;
        int evenNum;

        while(number > 0)
        {
            evenNum = number %10;

            if(evenNum%2 == 0)
            {
                sum += evenNum;
            }
            number= number/10;
        }
        return sum;

    }
}
