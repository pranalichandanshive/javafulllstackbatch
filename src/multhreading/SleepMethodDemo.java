package multhreading;

public class SleepMethodDemo extends Thread{
    @Override
    public void run() {
        System.out.println("In run method");
        for(int i=1;i<=5;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(3000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(i);
        }
    }
}
class SleepImpl{
    public static void main(String[] args) {
        SleepMethodDemo t1=new SleepMethodDemo();
        t1.setName("T1");
        SleepMethodDemo t2=new SleepMethodDemo();
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}