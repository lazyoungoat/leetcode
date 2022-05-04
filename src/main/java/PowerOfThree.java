public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return true;

    }

    int PP;
    int NP;
    public int pow(int a, int b) {
        if (b > 0) {
            for (int j = 0; j < b; j++) {
                PP = a * a;
            }
            return PP;
        }
        if (b < 0){
            for (int i = 0; i > b ; i--) {
                NP = 1 / a * a;
            }
        }
        return NP;
    }

}
