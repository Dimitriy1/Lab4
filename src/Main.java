public class Main {
    public static void main(String[] args) {
        
        Thread thread1 = new TmpThread(5000, "Thread_1");
        Thread thread2 = new TmpThread(3000, "Thread_2");
        thread1.start();
        thread2.start();
        System.out.println("main method finished");
    }
}
