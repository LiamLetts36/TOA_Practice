import java.io.*;

public class PricingSolution
{
    public static final int MAX_I = 1000000;

    public static long f(int i)
    {
        long result = 0;
        for (int j = 1; j < i; ++j)
        {
            result += j * (i/j);
        }
        return result;
    }

    public static void binary_search() throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(in.readLine());

        int low = 0;
        int high = MAX_I;
        while (low < high)
        {
            int mid = (low + high + 1) / 2;
            if (f(mid) > n)
                high = mid - 1;
            else
                low = mid;
        }

        System.out.println(low);
    }

    public static void main (String[] args) throws IOException
    {
        binary_search();
    }
}