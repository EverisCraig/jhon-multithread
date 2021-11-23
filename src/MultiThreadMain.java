public class MultiThreadMain {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <= 3; i++) {
            MultiThreadSample multiThreadSample = new MultiThreadSample(i);
            Thread myThread= new Thread(multiThreadSample);
            myThread.start();
            myThread.isAlive();
            myThread.join();

        }
    }
}
