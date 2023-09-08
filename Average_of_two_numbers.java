import java.util.Scanner;
public class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(a+b)*0.50;
        System.out.format("Average of "+(int)a+" and "+(int)b+" is: "+"%.2f",c);
    }
}