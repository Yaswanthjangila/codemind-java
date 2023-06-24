import java.util.Scanner;
public class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        double r,p=3.14;
        a=sc.nextInt();
        r=p*a*a;
        System.out.printf("%.2f",r);
    }
}