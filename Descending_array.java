import java.util.Scanner;
public class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,a[];
        a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c+=1;
            }
        }
        if(c==n-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}