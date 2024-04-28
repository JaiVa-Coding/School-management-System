public class Multithread {
    public static void main(String[] args)
    {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            MultiThreading1 object
                = new MultiThreading1();
            object.start();
        }
    }
}