import java.util.Scanner;
public class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int[] a=new int[100];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            c=c+a[i];
        }
        System.out.println(c);
    }
}