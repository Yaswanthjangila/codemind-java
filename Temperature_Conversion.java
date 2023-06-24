import java.util.Scanner;
public class temp
{
    public static void main(String args[])
    {
        Scanner C=new Scanner(System.in);
        double c,f;
        c=C.nextDouble();
        f=32+(9*c)/5;
        System.out.format("%.2f",f);
    }
}