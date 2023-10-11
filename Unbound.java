public class Unbound {
    public static void main(String[] args){
        System.out.println(9/2);
    }

    public static int function(int x){
        return 3*x - 100;
    }

    public static int binary_search(){
        int minXValue = 0;
        int maxXValue = 1000;
        int midXValue = 0;

        while(minXValue<=maxXValue){
            midXValue = (minXValue+maxXValue)/2;

            if(function(midXValue) == 0){
                return midXValue;
            }

            else if(function(midXValue) > 0){
                maxXValue = midXValue -1;
            }

            else{
                minXValue = midXValue +1;
            }

        }
        return minXValue;
    }
}
