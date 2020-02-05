public class Fibonaccii implements Fibonacci{
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    Fibonaccii(  int num1, int num2, int amountofNumbers    ) {
        amountofNumbersInSequence = amountofNumbers;
        number1 = num1;
        number2 = num2;
    }

    // Methods
    public void run() {

        int num1 = number1;
        int num2 = number2;

        System.out.print(number1 + " ");
        System.out.print(number2 + " ");


        for (int i = 1; i <= amountofNumbersInSequence-2; i++ ) {
            int numberX = num1 + num2;
            num1= num2;
            num2=numberX;
            System.out.print(numberX + " ");

        }

        System.out.println("DONE! printed " + amountofNumbersInSequence + "numbers!");


    }
}
