public class SharedSynchronized {

    private static int x;
    private static final Object objecteBloqueig = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inici");
        Thread t1 = new Thread(new Adder());
        Thread t2 = new Thread(new Adder());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("La x val " + x);
    }

    public static class Adder implements Runnable{
        @Override
        public void run() {
            //suma 1 500.000 vegades
            for(int i = 0; i < 500000; i++){
//                bloc synchronized
                synchronized (objecteBloqueig){
                    x = x + 1;
                }
            }
        }
    }
}