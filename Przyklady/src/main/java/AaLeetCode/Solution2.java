package AaLeetCode;

class Solution2 {

    public static boolean isHappy(int n) {
        do {
            String nAsString = Integer.toString(n);
            int tempN = 0;
            for (int b = 0; b < nAsString.length(); b++) {
                String substring = nAsString.substring(b, b + 1);
                int subN = Integer.valueOf(substring);
                tempN = tempN + subN * subN;
                n = tempN;
            }
        } while (n != 1&&n!=4);

        if (n==1){return true;
        } else return false;
    }

    public static void main(String[] args) {
        isHappy(2);
    }


}
