import java.util.Scanner;
import java.io.*;

class JavaProgram
{
    public static void main(String args[])
    {
	    System.out.println("Hi");
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
		
        System.out.println("Largest of Two Number is " +big);
    }
}
