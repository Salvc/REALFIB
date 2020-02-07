public class Fibonaccii implements Fibonacci, Runnable {
    private int amountofNumbersInSequence = 0;
    private int number1 = 0;
    private int number2 = 0;

    private String sequence = "";

    Fibonaccii(int num1, int num2, int amountofNumbers) {
        this.amountofNumbersInSequence = amountofNumbers;
        number1 = num1;
        number2 = num2;
    }

    // Methods
    public void run() {

        int num1 = number1;
        int num2 = number2;

        System.out.println(Thread.currentThread().getName() + " " + number1 + " ");
        System.out.println(Thread.currentThread().getName() + " " + number2 + " ");


        for (int i = 1; i <= amountofNumbersInSequence - 2; i++) {
            int numberX = num1 + num2;
            num1 = num2;
            num2 = numberX;
            System.out.println(Thread.currentThread().getName() + " " + numberX + " ");
            //sequence = sequence + " " + numberX;

        }

        //print();

    }

    private void print() {
        System.out.println("DONE! printed " + amountofNumbersInSequence + " numbers!");
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i < amountofNumbersInSequence -2; i++) {
            String[] strings = sequence.split(" ");
            System.out.print(strings[i] + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
