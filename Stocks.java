public class Stocks {
    public static void main(String[] args){
        int[] x = {5,3,4,6,3};
        int[] y = {8,4,3,5,10};
        System.out.println(dp(x,y));
    }

    public static int dp(int[] x, int[] y){
        if(x.length == 0){
            return 0;
        }

        int prevOfPrev = 0;
        int prev = Math.max(x[0],y[0]);
        int current = 0;

        for(int i = 1; i < x.length; i++){
            current = Math.max(x[i] + prev, y[i] + prevOfPrev);
            prevOfPrev = prev;
            prev = current;
        }

        return prev;

    }
}
