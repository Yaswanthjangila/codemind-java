import java.util.Scanner;
public class DiskCapacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        long capacity=2L*t*s*b*512;
        System.out.println(capacity);
    }
}