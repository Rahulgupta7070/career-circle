package PredefineException.CheckedException;

public class InterruptedExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Thread is going sleep");
            Thread.sleep(6000);

            System.out.println("Thread woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread was intruuped");
        }
        System.out.println("Program continues..!!");
    }
}
