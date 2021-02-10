public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        if((x < 10) || (y > 99) || (x > 99) || (y < 10)) {
            return false;
        }

        int k = 0, j = 0;
        while(x > 0) {
            k = (x % 10);
            x /= 10;

            while(y > 0) {
                j = (y % 10);
                y /= 10;
                if(k == j || x == j || x == y) {
                    return true;
                }
            }
        }
        return false;
    }
}