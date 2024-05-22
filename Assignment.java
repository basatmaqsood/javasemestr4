class StatsCalculator extends Thread {
    private int[] numbers;
    private double average;
    private int max;
    private int min;

    public StatsCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        calculateAverage();
        calculateMax();
        calculateMin();
    }

    private void calculateAverage() {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        average = sum / numbers.length;
        System.out.println("The average value is " + average);
    }

    private void calculateMax() {
        max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum value is " + max);
    }

    private void calculateMin() {
        min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The minimum value is " + min);
    }
}

public class Assignment {
    public static void main(String[] args) {
        int[] numbers = {90, 81, 78, 95, 79, 72, 85};

        StatsCalculator averageThread = new StatsCalculator(numbers);
        StatsCalculator maxThread = new StatsCalculator(numbers);
        StatsCalculator minThread = new StatsCalculator(numbers);

        averageThread.start();
        maxThread.start();
        minThread.start();
    }
}
