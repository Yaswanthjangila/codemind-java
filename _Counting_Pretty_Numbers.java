import java.util.Scanner;
public class snn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int d,c=0;
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            c=0;
            for(int j=a;j<=b;j++)
            {
                d=j%10;
                if(d==2 || d==3 || d==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}