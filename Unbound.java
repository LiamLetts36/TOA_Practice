public class Unbound {
    public static void main(String[] args){
        System.out.println(binary_search());
    }

    public static int function(int x){
        int func = 3*x - 100;
        return func;
    }

    public static int binary_search(){
      int minXValue = 0;
      int maxXValue = 1000;
      int mid = 0;

      while(minXValue<maxXValue){
          mid = (minXValue+maxXValue)/2;

          if(function(mid) == 0){
              return mid;
          }

          if(function(mid) > 0){
              maxXValue = mid -1;
          }

          else{
              minXValue = mid +1;
          }
      }
      return minXValue;
    }
}
