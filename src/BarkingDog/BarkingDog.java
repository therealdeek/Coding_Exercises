package BarkingDog;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 7));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking && (hourOfDay >=0 && hourOfDay<8) ||
                (hourOfDay >22 && hourOfDay<=23))
        {
            return true;
        }
        else if(barking && hourOfDay <0 || hourOfDay >23)
            return false;


        return false;
    }

}


