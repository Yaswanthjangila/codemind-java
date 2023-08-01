import java.util.Scanner;
public class java
{
    public static boolean ispri(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.print(a[i]+"");
        }
        int d=sc.nextInt();
        //System.out.println(d);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(ispri(a[i]))
            {
                if(a[i]<=d)
                {
                    //System.out.print(a[i]+"")
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}