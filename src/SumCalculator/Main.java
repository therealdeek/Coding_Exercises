package SumCalculator;

public class Main
{
    public static void main(String []args)
    {

    }

    public class SimpleCalculator
    {
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber()
        {
            return this.firstNumber;
        }
        public double getSecondNumber()
        {
            return this.secondNumber;
        }

        public void setFirstNumber(double firstNum)
        {
            this.firstNumber = firstNum;
        }
        public void setSecondNumber(double secondNum)
        {
            this.secondNumber = secondNum;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }
        public double getDivisionResult() {
            if (secondNumber == 0) {
                return 0;
            }
            return this.firstNumber / this.secondNumber;
        }
        public double getMultiplicationResult() {

            return this.firstNumber * this.secondNumber;
        }

    }
}
