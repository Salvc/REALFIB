public class Main {
    public static void main(String args[]) {
        Fibonaccii myFib1 = new Fibonaccii(10, 2, 6);
        Thread myFib1Thread = new Thread(myFib1, "Sal1");
        myFib1Thread.start();
        //myFib1.run();

        Fibonaccii myFib2 = new Fibonaccii(3, 5, 6);
        Thread myFib2Thread = new Thread(myFib2, "Sal2");
        myFib2Thread.start();
        //myFib2.run();

        Fibonaccii myFib3 = new Fibonaccii(8, -1, 3);
        Thread myFib3Thread = new Thread(myFib3, "Sal3");
        myFib3Thread.start();
        //myFib3.run();

        Fibonaccii myFib4 = new Fibonaccii(8, 9, 15);
        Thread myFib4Thread = new Thread(myFib4, "Sal4");
        myFib4Thread.start();
        //myFib4.run();


    }
}
