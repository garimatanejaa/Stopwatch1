
public class StopwatchTest {
    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();
        StopwatchObserver ob = new StopwatchObserver();
        sw.registerObserver(ob);

        /*Thread observerThread= new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    System.out.print("\r Time:"+sw.getTime());
                    sleep(10);
                }

            }

        });    
        observerThread.start();*/
        System.out.println("\nStarting Stopwatch: ");
        sw.start();
        sleep(1000);
        System.out.println(sw.getTime());
        sleep(1000);
        sw.stop();
        System.out.println("\nStopwatch Stopped. ");

        System.out.println("\nStarting Stopwatch: ");
        sw.start();
        sleep(1000);
        System.out.println(sw.getTime());
        sleep(1000);
        sw.stop();
        System.out.println("\nStopwatch Stopped. ");
    }
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } 
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    
}
