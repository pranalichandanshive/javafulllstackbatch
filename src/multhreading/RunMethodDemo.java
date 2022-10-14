package multhreading;

public class RunMethodDemo extends Thread {
    @Override
    public void run() {
        System.out.println("in run method");
        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(3000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

        class RunMethodDemoImpl {
            public static void main(String[] args) {
                RunMethodDemo t1 = new RunMethodDemo();
                t1.run();
            }
        }


