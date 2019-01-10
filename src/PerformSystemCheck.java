import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable {
    private String checkWhat;

    ReentrantLock lock = new ReentrantLock();
    public PerformSystemCheck(String checkWhat) {
        this.checkWhat = checkWhat;
    }

    public PerformSystemCheck() {

    }
// synchronized  allows method to be locked
    public void run() {
        lock.lock(); // another way to lock this method
        System.out.println("Checking " + this.checkWhat);
        lock.unlock(); // unlocks the method

    }
}
