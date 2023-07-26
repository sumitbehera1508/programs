public class myThread implements Runnable {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        myThread t = new myThread();
        Thread threa1 = new Thread(t);
        myThread2 thread2 = new myThread2();
        threa1.run();
        thread2.run();
    }
}