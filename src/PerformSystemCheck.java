import java.util.concurrent.locks.ReentrantLock;

public class PerformSystemCheck implements Runnable {
    private String checkWhat;


    public PerformSystemCheck(checkWhat) {
        this.checkWhat = checkWhat;
    }

    public PerformSystemCheck() {

    }

    public void run() {

    }
}
