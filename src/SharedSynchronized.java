public class SharedSynchronized {

    private static int x;
    private static final Object objecteBloqueig = new Object();

    private static boolean vullDebugar = true;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inici");

        Debugger d = new Debugger();
        d.debug = vullDebugar;

        try{
            Thread t1 = new Thread(new Adder());
            Thread t2 = new Thread(new Adder());

            d.debug("Començo a crear threads");

            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("La x val " + x);
        }catch(Exception e){
            d.debug(e);
        }
    }

    public static class Adder implements Runnable{
        @Override
        public void run() {
            Debugger d = new Debugger();
            d.debug = vullDebugar;
            d.debug("Començo a sumar");
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