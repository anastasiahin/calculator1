
public class SumCalculator {

    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The input number must be greater than 0.");
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
