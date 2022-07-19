package SharedDigit;

public class Main
{

    public static void main(String[]args)
    {

        System.out.println(hasSharedDigit(23,39));
        System.out.println(hasSharedDigit(45,14));
        System.out.println(hasSharedDigit(3, 33));
        System.out.println(hasSharedDigit(-1,21));
        System.out.println(hasSharedDigit(17,74));


    }

    public static boolean hasSharedDigit(int num1, int num2)
    {
        if(((num1 < 10 || num1 > 99)) || ((num2 < 10 || num2 > 99)))
        {
            return false;
        }

        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int firstNum = num1/10;
        int firstNum2 = num2/10;

        while((lastNum1 == lastNum2 || firstNum == firstNum2)
                || (firstNum == lastNum2) || (firstNum2 == lastNum1))
        {
            return true;
        }
        return false;

    }
}
