import java.io.*;
import java.util.*;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        factClass f = new factClass();
        int result = f.fact(n);
        
        System.out.println(result);
    }
}

class factClass
{
    public int fact(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}

