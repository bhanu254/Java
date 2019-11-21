import java.util.Scanner;
import java.io.*;

public class JavaProgram
{
    public static void main(String args[])
    {
        int a, b, big;
        a = 25;
        b = 30;
		
        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }
		
        System.out.print("Largest of Two Number is " +big);
    }
}
