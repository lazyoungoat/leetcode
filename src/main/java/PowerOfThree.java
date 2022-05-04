public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; i < 2; i++) {
        }

            return true;
    }

    int PP;
    int NP;
    public int pow(int a, int b) {
        PP = 1;
        if (b > 0) {
            for (int j = 0; j < b; j++) {
                PP = PP * a;
            }
        }
            return PP;

    }

}
