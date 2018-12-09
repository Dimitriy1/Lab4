public class Main3 {
    public static void main(String[] args) {
        Thread thread1 = new TmpThread(5000, "Thread_1");
        Thread thread2 = new TmpThread(3000, "Thread_2");
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();

        try {
            //thread1.join(10);
            //thread1.join(500);
            thread1.join(10);
            System.out.println("thread1 join exit");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        thread2.start();
        System.out.println("main method finished");

        //Потоки 1 и 2 тоже завершаются с методом main?
        //Не всі потоки завершаються з методом main
        //Якщо зменшувати час затримки потока демона, то він може встигнути закінчити своє виконання до завершення основного потока
    }
}
