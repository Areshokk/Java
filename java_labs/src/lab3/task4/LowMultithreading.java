package lab3.task4;

public class LowMultithreading {
    public static void main(final String[] args) {

        final FirstLowMultithreading lm1  = new FirstLowMultithreading();
        final SecondLowMultithreading lm2 = new SecondLowMultithreading();
        final ThirdLowMultithreading lm3 = new ThirdLowMultithreading();

        lm1.start();
        lm2.start();
        lm3.start();
    }
    public static class FirstLowMultithreading extends Thread {
        @Override
        public void run() {
            Operations.sum(1, 2);
        }
    }

    public static class SecondLowMultithreading extends Thread {
        @Override
        public void run() {
            Operations.sub(4, 3);
        }
    }

    public static class ThirdLowMultithreading extends Thread {
        @Override
        public void run() {
            Operations.mult(5, 4);
        }
    }
}

