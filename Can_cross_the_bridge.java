import java.util.Scanner;
public class bridge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(c-b)/a;
        System.out.println(d);
    }
    }