import java.util.Scanner;

public class Score {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int length = keyboard.nextInt();
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = keyboard.nextInt();
        }
        int target = keyboard.nextInt();

        System.out.println(maxScore(array, 0, target, 1));

    }


    public static int maxScore(int[] array, int index, int target, int currentScore){
        if(index == array.length){
            return (currentScore < target) ? currentScore : -1;
        }

        int addOption = maxScore(array, index + 1, target, currentScore + array[index]);
        int multiplyOption = maxScore(array, index + 1, target, currentScore * array[index]);

        if(addOption < target && multiplyOption < target){
            return Math.max(addOption, multiplyOption);
        }
        else if(addOption < target){
           return  addOption;
        }
        else{
            return multiplyOption;
        }
    }
}
