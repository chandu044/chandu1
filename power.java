import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
     int a,b,c=1,i;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     for(i=0;i<b;i++)
     {
         c=c*a;
     }
     System.out.println(c);
    }
}
