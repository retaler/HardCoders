
public class SemaphoreCheck {
    public static void main(String[] args) throws InterruptedException {
        new SemaphoreCheck().test();
        System.out.println("All Threads finished work");
    }


    public void test() throws InterruptedException {

        for (int i = 0; i < 20; i++) {
            new Thread(new Worker()).start();
        }
        Thread.sleep(2000);

        System.out.println("First block finished !!!");
        System.out.println();

        for (int i = 0; i < 20; i++) {
            new Thread(new WorkerSecond()).start();
            Thread.sleep(400);
        }

    }

    MySemaphore semaphoreOne = new MySemaphore();

    public class Worker implements Runnable {

        @Override
        public void run() {
            try {
                semaphoreOne.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            semaphoreOne.release();

        }
    }

    MySemaphore semaphoreMulty = new MySemaphore();
    private int permits = 8;
    private final boolean[] locks = new boolean[permits];

    public class WorkerSecond implements Runnable {

        @Override
        public void run() {
            try {
                semaphoreMulty.acquire(permits);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            semaphoreMulty.release(permits);



        }
    }
}

