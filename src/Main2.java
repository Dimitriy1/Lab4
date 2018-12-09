public class Main2 {
    public static void main(String[] args) {
        Thread thread1 = new TmpThread(5000, "Thread_1");
        Thread thread2 = new TmpThread(3000, "Thread_2");
        thread1.start();

        try {
            //thread1.join(500);
            thread1.join(5000);
            System.out.println("thread1 join exit");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        thread2.start();
        System.out.println("main method finished");
    }
}
