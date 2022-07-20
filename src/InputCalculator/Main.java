package InputCalculator;

import java.util.Scanner;

public class Main
{
    public static void main(String[]args)
    {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long roundAvg = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                count++;
                int number = scanner.nextInt();
                sum += number;
                roundAvg = Math.round((double) sum / (double) count);
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + roundAvg);
        scanner.close();
    }


    }

