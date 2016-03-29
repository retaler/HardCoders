public class MySemaphore implements Semaphore {

    private int counter = 0;
    int totalPermits = 1;

    private final Object lock = new Object();


    @Override
    public synchronized void acquire() throws InterruptedException {
        counter=totalPermits;

        while (counter == 0) this.wait();
        counter--;
        System.out.println(Thread.currentThread().getName() + " start work, free permits: " + getAvailablePermits());
    }


    @Override
    public synchronized void release() throws IllegalMonitorStateException {
        if (counter == 0) this.notify();
        if (counter < 1) counter++;
        System.out.println(Thread.currentThread().getName() + " finished work, we have permits " + getAvailablePermits());
    }

    @Override
    public synchronized void acquire(int permits) throws InterruptedException {

        totalPermits = permits;
        while (counter >= permits) {
            this.wait();
        }
        counter++;
        System.out.println(Thread.currentThread().getName() + " locked semaphore, free permits: " + getAvailablePermits());


    }

    @Override
    public synchronized void release(int permits) {

        if (counter >= permits) {

            this.notifyAll();
            counter = 0;
        }

    }

    @Override
    public int getAvailablePermits() {
        return totalPermits - counter;
    }
}
