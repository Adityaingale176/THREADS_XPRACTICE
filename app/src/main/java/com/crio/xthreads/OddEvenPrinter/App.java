package com.crio.xthreads.OddEvenPrinter;

public class App {
    public static void main(String[] args) {
        int n = 10; // Example: Set n to 10 to print numbers from 1 to 10

        OddEvenPrinter printer = new OddEvenPrinter(n);

        // TODO:
        // 1. Create a thread for printing odd numbers:
        //    - Use the `printOdd` method from the `OddEvenPrinter` class.
        //    - Name the thread "OddThread" for identification.
        Thread OddThread = new Thread(()->{
            try {
                printer.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "OddThread");
        
        // 2. Create a thread for printing even numbers:
        //    - Use the `printEven` method from the `OddEvenPrinter` class.
        //    - Name the thread "EvenThread" for identification.
        Thread EvenThread = new Thread (()-> {
            try {
                printer.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "EvenThread");
        // 3. Start both threads to begin execution:
        //    - Call `start()` on both the odd and even threads.
        OddThread.start();
        EvenThread.start();

        // 4. Wait for both threads to finish:
        //    - Use `join()` on each thread to ensure the main thread waits for their completion.
        //    - Handle any `InterruptedException` by restoring the interrupted status of the main thread.
        try{
            OddThread.join();
            EvenThread.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
