import java.util.*;
public class j
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    for(int i=0;i<n;i++)
    {
        s=a[i]*a[i];
        a[i]=s;
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
    }
}