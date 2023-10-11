import java.util.Scanner;

public class Scoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        int maxScore = calculateMaxScore(numbers, target, 0, 1); // Start with initial score of 1

        System.out.println(maxScore);
    }

    // Recursive function to calculate the maximum score
    private static int calculateMaxScore(int[] numbers, int target, int index, int currentScore) {
        if (index == numbers.length) {
            return (currentScore < target) ? currentScore : -1;
        }

        int addOption = calculateMaxScore(numbers, target, index + 1, currentScore + numbers[index]);
        int multiplyOption = calculateMaxScore(numbers, target, index + 1, currentScore * numbers[index]);

        // Return the maximum of the two options that are strictly less than the target
        if (addOption < target && multiplyOption < target) {
            return Math.max(addOption, multiplyOption);
        } else if (addOption < target) {
            return addOption;
        } else {
            return multiplyOption;
        }
    }
}