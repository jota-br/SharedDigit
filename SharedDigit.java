public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit (int x, int y) {
        if ((x > 99 || x < 10) || (y > 99 || y < 10)) {
            return false;
        }

        int i = x;
        int j = y;
        while (true) {
            while (true) { 
                if (j == 0) {
                    j = y;
                    break;
                }
                if (i % 10 == j % 10) {
                    return true;
                }
                j /= 10;
            }
            if (i == 0) {
                break;
            }
            i /= 10;
        }

        return false;
    }
}
