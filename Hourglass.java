import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

       int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) 
        {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

             //String[] arrRowTempItems = scan.nextLine().split(" ");
            //scan.skip("(\\s+$");
            //List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) 
            {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arr[i][j]=arrItem;
            }

            //arr.add(arrRowItems);
        }
         int maxSum = Integer.MIN_VALUE;
        for (int row =0;row<4;row++)
        {
            for (int col=0;col<4;col++)
            {
                int sum =   arr[row][col] + arr[row][col+1] + arr[row][col+2] +
                                arr[row+1][col+1]  + 
                            arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
                
                if (sum>maxSum)
                {
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
        bufferedReader.close();
    }
}
