class ConcurrentExample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }

    public static void main(String[] args) {
        ConcurrentExample thread1 = new ConcurrentExample();
        ConcurrentExample thread2 = new ConcurrentExample();

        thread1.start(); // Start first thread
        thread2.start(); // Start second thread
    }
}
