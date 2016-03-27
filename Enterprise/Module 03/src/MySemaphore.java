public class MySemaphore implements Semaphore {

    private int permitsNumber = 0;
    private final Object locks = new Object();

    @Override
    public synchronized void acquire() throws InterruptedException {
        permitsNumber = 1;
        while (permitsNumber == 0) this.wait();
        permitsNumber--;
        System.out.println(Thread.currentThread().getName() + "start work, free permits: " + permitsNumber);
    }

    @Override
    public void acquire(int permits) throws InterruptedException {

        permitsNumber = permits;

        synchronized (locks) {

            while (permitsNumber == 0) locks.wait();
            permitsNumber--;
            System.out.println(Thread.currentThread().getName() + "start work, free permits: " + permitsNumber);
        }
    }


    @Override
    public synchronized void release() throws IllegalMonitorStateException {
        if (permitsNumber == 0) this.notify();
        if (permitsNumber < 1) permitsNumber++;
        System.out.println(Thread.currentThread().getName() + "finished work, we have permits " + permitsNumber);
    }

    @Override
    public void release(int permits) {
        synchronized (locks) {
            while (permitsNumber == 0) locks.notify();
            if (permitsNumber < permits)
                permitsNumber++;
            System.out.println(Thread.currentThread().getName() + "finished work, we have permits" + permitsNumber);
        }
    }

    @Override
    public int getAvailablePermits() {
        return permitsNumber;
    }
}
