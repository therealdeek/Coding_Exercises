package EqualSumChecker;

public class EqualSumChecker
{

    public static void main(String[]args)
    {
        System.out.println(hasEqualSum(1,5,9));
        System.out.println(hasEqualSum(1,-1,0));
        System.out.println(hasEqualSum(1,1,1));


    }

    public static boolean hasEqualSum(int a, int b, int c)
    {

        if(a + b == c)
        {
            return true;
        }else
            return false;

    }

}
