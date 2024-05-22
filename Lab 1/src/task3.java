public class task3 {
        public static int howManySeconds(int hours) {

            return hours * 3600;
        }

        public static void main(String[] args) {

            System.out.println(howManySeconds(2));  // Output: 7200
            System.out.println(howManySeconds(10)); // Output: 36000
            System.out.println(howManySeconds(24)); // Output: 86400
        }
    }