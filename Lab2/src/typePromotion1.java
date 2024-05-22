public class typePromotion1 {

        public static void main(String[] args) {
            short a = 120;
            byte b = 50;
//120*50 is promoted to int automatically
            int c = a*b; System.out.println(c);

            short z = 4;
            int d = z*5;
            System.out.println(d);
        }
    }


