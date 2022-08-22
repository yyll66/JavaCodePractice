package ThreadTest;
//通过实现Runnable接口创建线程
public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " +threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
        try{
            for (int i = 0; i < 4; i++) {
                System.out.println("Thread: "+ threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: "+threadName+ " interrupted.");
        }
        System.out.println("Thread "+ threadName+ " exiting");
    }

    public void start(){
        System.out.println("Starting "+ threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
