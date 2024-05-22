class task1 {
    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        int res = (a << 2) + (b >> 2);
        boolean res2 = (a++ != b++) && (a++ == b++);
        boolean res3 = (--a != --b) | (--a == --b);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

    }
}