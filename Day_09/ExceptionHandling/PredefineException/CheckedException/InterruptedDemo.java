package PredefineException.CheckedException;

public class InterruptedDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping");
            Thread.sleep(5000);
            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread was intrupted!!");
        }

    }

    public static void main(String[] args) {
        InterruptedDemo t = new InterruptedDemo();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread intrruptd");
        }

        t.interrupt();

    }
}
