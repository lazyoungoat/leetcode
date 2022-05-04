public class Test {
    public static void main(String[] args) {
        PowerOfThree good = new PowerOfThree();
        int great;

        great = good.pow(3,-5);
        System.out.println(great);

        Try can = new Try();
        boolean verify = can.isPow3(243);
        System.out.println(verify);
    }
}
