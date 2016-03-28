public class MySemaphore implements Semaphore {

    private int availablePermits = 0;

    private final Object lock = new Object();
    private final boolean[] locks = new boolean[10];


    @Override
    public synchronized void acquire() throws InterruptedException {

        availablePermits = 1;

        while (availablePermits == 0) lock.wait();
        availablePermits--;
        System.out.println(Thread.currentThread().getName() + "start work, free permits: " + availablePermits);
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        availablePermits = permits;

        synchronized (locks) {
            for (int i = 0; i < permits; i++) {
                if (!locks[i]) {
                    locks[i] = true;
                    availablePermits--;
        System.out.println(Thread.currentThread().getName() + "locked semaphore, free permits: " + availablePermits);
                    break;
                }
            }
        }
        while (availablePermits == 0) locks.wait();
    }


    @Override
    public synchronized void release() throws IllegalMonitorStateException {
        if (availablePermits == 0) this.notify();
        if (availablePermits < 1) availablePermits++;
        System.out.println(Thread.currentThread().getName() + "finished work, we have permits " + availablePermits);
    }

    @Override
    public void release(int permits) {

        synchronized (locks) {
            if(availablePermits<permits)
            locks[availablePermits++]=false;
            locks.notifyAll();
        }

        System.out.println(Thread.currentThread().getName() + "finished work, we have permits " + availablePermits);

    }

    @Override
    public int getAvailablePermits() {
        return availablePermits;
    }
}
