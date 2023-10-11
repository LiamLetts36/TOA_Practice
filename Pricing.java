import java.util.Scanner;

public class Pricing{

    public static void main(String[] args){
    System.out.println(binary_search());
    }

    public static int function(int k) {
        int cost = 0;
        for(int j = 1; j < k; j++){
            cost += j*k/j;
        }
        return cost;
    }

    public static int binary_search(){
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int minGems = 0;
        int maxGems = 1000000;
        int mid = 0;

        while(minGems<maxGems){
            mid = (minGems+maxGems)/2;

            if(function(mid) > n){
                maxGems = mid -1;
            }

            else{
                minGems = mid;
            }
        }
        return minGems;
    }
}