import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

class AverageCalculator implements Runnable {
    private int[] numbers;
    private double average;

    public AverageCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        calculateAverage();
        System.out.println("The average value is " + average);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long thread2CpuTime = threadMXBean.getCurrentThreadCpuTime();
        System.out.println("CPU time for averageThread: " + thread2CpuTime + " ns");
    }

    private void calculateAverage() {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
            // Simulate computational workload
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        average = sum / numbers.length;
    }
}

class MinCalculator implements Runnable {
    private int[] numbers;
    private int min;

    public MinCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        calculateMin();
        System.out.println("The minimum value is " + min);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long thread2CpuTime = threadMXBean.getCurrentThreadCpuTime();
        System.out.println("CPU time for minThread: " + thread2CpuTime + " ns");
    }

    private void calculateMin() {
        min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            // Simulate computational workload
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MaxCalculator implements Runnable {
    private int[] numbers;
    private int max;

    public MaxCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        calculateMax();
        System.out.println("The maximum value is " + max);
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long thread2CpuTime = threadMXBean.getCurrentThreadCpuTime();
        System.out.println("CPU time for maxThread: " + thread2CpuTime + " ns");
    }

    private void calculateMax() {
        max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            // Simulate computational workload
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        Runnable averageCalculator = new AverageCalculator(numbers);
        Runnable minCalculator = new MinCalculator(numbers);
        Runnable maxCalculator = new MaxCalculator(numbers);

        Thread averageThread = new Thread(averageCalculator);
        Thread minThread = new Thread(minCalculator);
        Thread maxThread = new Thread(maxCalculator);

        averageThread.start();
        minThread.start();
        maxThread.start();
        try {
            averageThread.join();
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
