import java.net.SocketTimeoutException;

/**
 * Created by retaler on 27.03.2016.
 */
public class SemaphoreCheck {
    public static void main(String[] args) {
        new SemaphoreCheck().test();
    }
        MySemaphore semaphore = new MySemaphore();
    public void test() {
        for (int i = 0; i < 20; i++) {
            new Thread( new Worker()).start();

        }

    }

    public class Worker implements Runnable {

        @Override
        public void run() {
            try {
                semaphore.acquire(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            semaphore.release(5);
           // System.out.println(Thread.currentThread().getName()+ "finished work");

        }
    }
}

