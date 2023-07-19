import java.util.Scanner;
public class java
{
    public static boolean ispal(int n)
    {
        int d,temp,r=0;
        temp=n;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(ispal(a[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}