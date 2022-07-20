package FlourPackProblem;

public class Main
{

    public static void main(String[]args)
    {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));

    }

        public static boolean canPack(int bigCount, int smallCount, int goal) {
            int remainder = goal % 5;
            int quotient = goal / 5;
            if(bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }else if(5 * bigCount + smallCount >= goal) {
                if(quotient <= bigCount && remainder <= smallCount) {
                    return true;
                }else return quotient > bigCount && remainder < smallCount;
            }else {
                return false;
            }
        }
    }

