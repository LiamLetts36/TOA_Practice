public class Recursion {
    public static void main(String[] args){

    }


    public static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n + sum(-1);
    }

    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return n + Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static int count(int n){
        if(n < 10){
            return 1;
        }

        return 1 + count(n/10);
    }

    public static int ArrSum(int[] array, int index){
        if(index >= array.length){
            return 0;
        }

        return array[index] + ArrSum(array, index + 1);

    }

    public static int Factorial(int n){
        if(n == 0){
            return 1;
        }

        return n*Factorial(n -1);
    }
}
