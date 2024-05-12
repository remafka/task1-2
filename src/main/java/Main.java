
public class Main {

    public static long _min(long[] num) {
        long min = num[0];
        for (long i : num) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static long _max(long[] num) {
        long max = num[0];
        for (long i : num) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static long _sum(long[] num) {
        long sum = 0;
        for (long i : num) {
            sum += i;
        }
        return sum;
    }

    public static long _mult(long[] num) {
        long mult = 1;
        for (long i : num) {
            mult *= i;
        }
        return mult;
    }
}
