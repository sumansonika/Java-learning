// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        try {
            Runnable r = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello " + i + " " + Thread.currentThread().getName());
                }
            };
            Thread t1 = new Thread(r, "thread 1");
            Thread t2 = new Thread(r, "thread 2");

            t1.start();
            t2.start();
            System.out.println("started");
            t1.interrupt();
            t1.join();


            System.out.println("completed 1");
            t2.join();
            System.out.println("completed 2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}