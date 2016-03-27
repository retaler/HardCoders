
public class SemaphoreCheck {
    public static void main(String[] args) throws InterruptedException {
        new SemaphoreCheck().test();
    }

    MySemaphore semaphore = new MySemaphore();

    public void test() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            new Thread(new Worker()).start();
        }
        Thread.sleep(2000);
        
        System.out.println("First block finished !!!");
        System.out.println();

        for (int i = 0; i < 20; i++) {
            new Thread(new WorkerSecond()).start();

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

    public class WorkerSecond implements Runnable {

        @Override
        public void run() {
            try {
                semaphore.acquire(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            semaphore.release(3);

        }
    }
}

