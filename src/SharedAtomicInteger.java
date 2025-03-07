import java.util.concurrent.atomic.AtomicInteger;

public class SharedAtomicInteger {

//    private static int x = 0;
    private static AtomicInteger xx;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inici");
        Thread t1 = new Thread(new Adder());
        Thread t2 = new Thread(new Adder());

        xx = new AtomicInteger();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("La x val " + xx.get());
    }

    public static class Adder implements Runnable{
        @Override
        public void run() {
            //suma 1 500.000 vegades
            for(int i = 0; i < 500000; i++){
//                x = x + 1;
                xx.addAndGet(1);
//                xx.incrementAndGet(); //same
            }
        }
    }
}