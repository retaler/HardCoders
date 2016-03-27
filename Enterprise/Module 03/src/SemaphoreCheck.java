
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
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            semaphore.release();

        }
    }
}

