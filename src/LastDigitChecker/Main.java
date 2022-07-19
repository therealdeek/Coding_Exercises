package LastDigitChecker;

public class Main
{

    public static void main(String[]args)
    {

        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println();

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3)
    {
        if((n1 < 10 || n1 > 1000) || (n2 < 10 || n2 > 1000)
           || (n3 < 10 || n3 > 1000))
        {
            return false;

        }
        int lastNum1 = n1 % 10;
        int lastNum2 = n2 % 10;
        int lastNum3 = n3 % 10;

        if((lastNum1 == lastNum2) || (lastNum1 == lastNum3) ||
                (lastNum2 == lastNum3))
        {
            return true;

        }
        return false;
    }

    public static boolean isValid(int numb1)
    {
        if(numb1 > 9 && numb1 < 1001)
        {
            return true;
        }else
        {
            return false;
        }

    }
}
