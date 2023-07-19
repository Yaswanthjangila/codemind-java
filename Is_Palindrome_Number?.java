import java.util.Scanner;
public class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int d,r=0;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(t==r)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}