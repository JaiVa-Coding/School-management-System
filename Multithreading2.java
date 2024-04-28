class MultiThreading2 implements Runnable {
    public void run()
    {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
               );
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
 
// Main Class
class Multithread2 {
    public static void main(String[] args)
    {
        int n = 5;
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultiThreading2());
            object.start();
        }
    }
}