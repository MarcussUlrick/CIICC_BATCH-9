package chapt4;

public class task8 {



    public static int cumulativeVarargs(int... numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int cumulativeSum = 0;


            for (int i = 1; i <= n; i++) {
                cumulativeSum += i;
            }

            System.out.println("Cumulative sum for " + n + " = " + cumulativeSum);


            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {

        int result = cumulativeVarargs(4, 5, 10);

        System.out.println("Total sum of all cumulative values = " + result);
    }
}
