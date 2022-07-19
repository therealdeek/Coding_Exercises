package FirstAndLastDigitSum;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(232));

    }

    public static int sumFirstAndLastDigit(int number)
    {
        if (number < 0)
        {
            return -1;
        }
        int sum = 0;
        sum = number % 10;

        while(true)
        {
            if(number < 10)
            {
               sum += number%10;
               break;
            }
            number /=10;

    }

    return sum;
}

}
