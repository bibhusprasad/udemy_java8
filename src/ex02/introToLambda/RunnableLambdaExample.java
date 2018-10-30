package ex02.introToLambda;

/**
 * Implement Runnable interface in two ways
 */
public class RunnableLambdaExample {

    public static void main(String[] args) {
        /*
         *  prior to Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable.");
            }
        };

        new Thread(runnable).start(); //OP: Inside Runnable.

        /*
         *  After Java 8
         */

        Runnable runnableLambda = () -> System.out.println("Inside Lambda Runnable."); //OP: Inside Lambda Runnable.
        new Thread(runnableLambda).start();

        new Thread(() -> System.out.println("Another ways of lambda Runnable")).start(); //OP: Another ways of lambda Runnable

    }
}
