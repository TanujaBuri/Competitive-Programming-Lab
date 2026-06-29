import java.io.*;
import java.util.*;

public class InterchangingElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0;i< n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;  
        int min = Integer.MAX_VALUE;
        int max_index = 0;
        int min_index = 0;
        
        for(int i = 0;i<n;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                max_index = i;
            }
            if(arr[i] < min)
            {
                min = arr[i];
                min_index = i;
            }
        }
        
        arr[max_index] = min;
        arr[min_index] = max;
        
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}

