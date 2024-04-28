class MultiThreading1 extends Thread {
    public void run()
    {
        try {
            System.out.println(
                "This is the thread");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

