import java.util.Scanner;

public class Cycling {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        int[] array = new int[N];
        for(int i = 0; i <N; i++){
            array[i] = keyboard.nextInt();
        }
        System.out.println(dp(array));
    }

    public static int dp(int[] array){
        int current = 0;
        int best = 0;

        for(int i = 0; i < array.length; i++){
            current = Math.max(current + array[i], array[i]);
            best = Math.max(current, best);
        }


        return best;
    }

}
